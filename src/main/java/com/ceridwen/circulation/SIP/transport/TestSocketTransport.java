/* 
 * Copyright (C) 2020 Ceridwen Limited
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ceridwen.circulation.SIP.transport;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ceridwen.circulation.SIP.exceptions.ChecksumError;
import com.ceridwen.circulation.SIP.exceptions.InvalidFieldLength;
import com.ceridwen.circulation.SIP.exceptions.MandatoryFieldOmitted;
import com.ceridwen.circulation.SIP.exceptions.MessageNotUnderstood;
import com.ceridwen.circulation.SIP.exceptions.RetriesExceeded;
import com.ceridwen.circulation.SIP.exceptions.SequenceError;
import com.ceridwen.circulation.SIP.messages.ACSStatus;
import com.ceridwen.circulation.SIP.messages.CheckOut;
import com.ceridwen.circulation.SIP.messages.CheckOutResponse;
import com.ceridwen.circulation.SIP.messages.Message;
import com.ceridwen.circulation.SIP.messages.SCStatus;
import com.ceridwen.circulation.SIP.netty.server.SIPDaemon;
import com.ceridwen.circulation.SIP.samples.netty.DummyDriverFactory;
import com.ceridwen.circulation.SIP.types.enumerations.ProtocolVersion;
import com.ceridwen.circulation.SIP.types.flagfields.SupportedMessages;

public class TestSocketTransport {
  SIPDaemon server;
	
	@Before
	public void setUp() throws Exception {
      // Run netty server
      server = new SIPDaemon("Sample", "localhost", 1234, new DummyDriverFactory(), true);

      server.start();
	}

	@After
	public void tearDown() throws Exception {
    server.stop();
	}

	@Test
	public void test() {
        /**
         * Now try basic client commands
         */
        Connection connection;
        Message request, response;

        connection = new SocketConnection();
        ((SocketConnection) connection).setHost("localhost");
        ((SocketConnection) connection).setPort(1234);
        ((SocketConnection) connection).setConnectionTimeout(30000);
        ((SocketConnection) connection).setIdleTimeout(30000);
        ((SocketConnection) connection).setRetryAttempts(2);
        ((SocketConnection) connection).setRetryWait(500);
        ((SocketConnection) connection).setStrictChecksumChecking(true);
        ((SocketConnection) connection).setStrictSequenceChecking(true);

        try {
            connection.connect();
        } catch (Exception e1) {
        	fail("Connection failed: " + e1.getMessage());
        	return;
        }

        /**
         * It is necessary to send a SC Status with protocol version 2.0 else
         * server will assume 1.0)
         */

        request = new SCStatus();
        ((SCStatus) request).setProtocolVersion(ProtocolVersion.VERSION_2_00);

        try {
            response = connection.send(request);
        } catch (RetriesExceeded e) {
        	fail("Retries exceeded: " + e.getMessage());
        	return;
        } catch (MessageNotUnderstood e) {
        	fail("Message not understood: " + e.getMessage());
        	return;
        } catch (ChecksumError e) {
        	fail("Checksum error: " + e.getMessage());
        	return;
        } catch (SequenceError e) {
        	fail("Sequence error: " + e.getMessage());
        	return;
        } catch (MandatoryFieldOmitted e) {
        	fail("Mandatory Field Omitted: " + e.getMessage());
        	return;
        } catch (InvalidFieldLength e) {
        	fail("Invalid field length: " + e.getMessage());
        	return;
        }
        
        if (!(response instanceof ACSStatus)) {
          fail("Status Request did not return valid response from server.");
        	return;
        }


        /**
         * Check if the server can support checkout
         */
        if (!((ACSStatus) response).getSupportedMessages().isCheckOut()) {
        	fail("Check out not supported");
        	return;
        }

        request = new CheckOut();

        /**
         * The code below would be the normal way of creating the request
         */

        ((CheckOut) request).setPatronIdentifier("2000000");
        ((CheckOut) request).setItemIdentifier("300000000");
        ((CheckOut) request).setSCRenewalPolicy(Boolean.TRUE);
        ((CheckOut) request).setTransactionDate(new Date());

        try {
            response = connection.send(request);
        } catch (RetriesExceeded e) {
        	fail("Retries exceeded: " + e.getMessage());
        	return;
        } catch (MessageNotUnderstood e) {
        	fail("Message not understood: " + e.getMessage());
        	return;
        } catch (ChecksumError e) {
        	fail("Checksum error: " + e.getMessage());
        	return;
        } catch (SequenceError e) {
        	fail("Sequence error: " + e.getMessage());
        	return;
        } catch (MandatoryFieldOmitted e) {
        	fail("Mandatory Field Omitted: " + e.getMessage());
        	return;
        } catch (InvalidFieldLength e) {
        	fail("Invalid field length: " + e.getMessage());
        	return;
        }

        if (!(response instanceof CheckOutResponse)) {
            fail("Error - CheckOut Request did not return valid response from server");
        	return;
        }
        
        try {
        	String testCase = response.encode('1');
        	assert(testCase.startsWith("120NUN") && testCase.contains("AA|AB|AH|AJ|AO|AY1AZ")); // strip out components which may change (transaction date and checksum)
	    } catch (MessageNotUnderstood e) {
	    	fail("Message not understood: " + e.getMessage());
      } catch (MandatoryFieldOmitted e) {
        fail("Mandatory Field Omitted: " + e.getMessage());
	    } catch (InvalidFieldLength e) {
	    	fail("Invalid field length: " + e.getMessage());
	    }
	}
}

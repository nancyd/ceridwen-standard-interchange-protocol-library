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
package com.ceridwen.circulation.SIP.server;

import com.ceridwen.circulation.SIP.messages.ACSStatus;
import com.ceridwen.circulation.SIP.messages.CheckInResponse;
import com.ceridwen.circulation.SIP.messages.CheckOutResponse;
import com.ceridwen.circulation.SIP.messages.EndSessionResponse;
import com.ceridwen.circulation.SIP.messages.FeePaidResponse;
import com.ceridwen.circulation.SIP.messages.HoldResponse;
import com.ceridwen.circulation.SIP.messages.ItemInformationResponse;
import com.ceridwen.circulation.SIP.messages.ItemStatusUpdateResponse;
import com.ceridwen.circulation.SIP.messages.LoginResponse;
import com.ceridwen.circulation.SIP.messages.PatronEnableResponse;
import com.ceridwen.circulation.SIP.messages.PatronInformationResponse;
import com.ceridwen.circulation.SIP.messages.PatronStatusRequest;
import com.ceridwen.circulation.SIP.messages.PatronStatusResponse;
import com.ceridwen.circulation.SIP.messages.RenewAllResponse;
import com.ceridwen.circulation.SIP.messages.RenewResponse;
import com.ceridwen.circulation.SIP.messages.SCStatus;

@Deprecated
public class MessageHandlerDummyImpl implements MessageHandler {

    @Override
    public ACSStatus Status(SCStatus msg) {
        ACSStatus response = new ACSStatus();
        response.getSupportedMessages().setBlockPatron(true);
        response.getSupportedMessages().setCheckIn(true);
        response.getSupportedMessages().setCheckOut(true);
        response.getSupportedMessages().setEndPatronSession(true);
        response.getSupportedMessages().setFeePaid(true);
        response.getSupportedMessages().setHold(true);
        response.getSupportedMessages().setItemInformation(true);
        response.getSupportedMessages().setItemStatusUpdate(true);
        response.getSupportedMessages().setLogin(true);
        response.getSupportedMessages().setPatronEnable(true);
        response.getSupportedMessages().setPatronInformation(true);
        response.getSupportedMessages().setPatronStatusRequest(true);
        response.getSupportedMessages().setRenew(true);
        response.getSupportedMessages().setRenewAll(true);
        response.getSupportedMessages().setScAcsStatus(true);
        response.getSupportedMessages().setRequestScAcsResend(true);
        return response;
    }

    @Override
    public PatronStatusResponse BlockPatron(
            com.ceridwen.circulation.SIP.messages.BlockPatron msg) {
        return new PatronStatusResponse();
    }

    @Override
    public CheckInResponse CheckIn(
            com.ceridwen.circulation.SIP.messages.CheckIn msg) {
        return new CheckInResponse();
    }

    @Override
    public CheckOutResponse CheckOut(
            com.ceridwen.circulation.SIP.messages.CheckOut msg) {
        return new CheckOutResponse();
    }

    @Override
    public EndSessionResponse EndPatronSession(
            com.ceridwen.circulation.SIP.messages.EndPatronSession msg) {
        return new EndSessionResponse();
    }

    @Override
    public FeePaidResponse FeePaid(
            com.ceridwen.circulation.SIP.messages.FeePaid msg) {
        return new FeePaidResponse();
    }

    @Override
    public HoldResponse Hold(com.ceridwen.circulation.SIP.messages.Hold msg) {
        return new HoldResponse();
    }

    @Override
    public ItemInformationResponse ItemInformation(
            com.ceridwen.circulation.SIP.messages.ItemInformation msg) {
        return new ItemInformationResponse();
    }

    @Override
    public ItemStatusUpdateResponse ItemStatusUpdate(
            com.ceridwen.circulation.SIP.messages.ItemStatusUpdate msg) {
        return new ItemStatusUpdateResponse();
    }

    @Override
    public LoginResponse Login(com.ceridwen.circulation.SIP.messages.Login msg) {
        return new LoginResponse();
    }

    @Override
    public PatronEnableResponse PatronEnable(
            com.ceridwen.circulation.SIP.messages.PatronEnable msg) {
        return new PatronEnableResponse();
    }

    @Override
    public PatronInformationResponse PatronInformation(
            com.ceridwen.circulation.SIP.messages.PatronInformation msg) {
        return new PatronInformationResponse();
    }

    @Override
    public PatronStatusResponse PatronStatus(PatronStatusRequest msg) {
        return new PatronStatusResponse();
    }

    @Override
    public RenewResponse Renew(com.ceridwen.circulation.SIP.messages.Renew msg) {
        return new RenewResponse();
    }

    @Override
    public RenewAllResponse RenewAll(
            com.ceridwen.circulation.SIP.messages.RenewAll msg) {
        return new RenewAllResponse();
    }

}

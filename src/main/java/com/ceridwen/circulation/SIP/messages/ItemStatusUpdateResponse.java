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
package com.ceridwen.circulation.SIP.messages;

import com.ceridwen.circulation.SIP.annotations.Command;
import com.ceridwen.circulation.SIP.annotations.PositionedField;
import com.ceridwen.circulation.SIP.annotations.TaggedField;
import com.ceridwen.circulation.SIP.annotations.TestCaseDefault;
import com.ceridwen.circulation.SIP.annotations.TestCasePopulated;
import com.ceridwen.circulation.SIP.fields.FieldPolicy;

@Command("20")
@TestCaseDefault("20019700101    010000AB|")
@TestCasePopulated("20119700101    010000ABitemIdentifier|AFscreenMessage|AGprintLine|AJtitleIdentifier|CHitemProperties|")
public class ItemStatusUpdateResponse extends Message {

    private static final long serialVersionUID = 428496319623237121L;
    @PositionedField(start = 2, end = 2)
    private Boolean ok;
    @PositionedField(start = 3, end = 20)
    private java.util.Date transactionDate;
    @TaggedField(FieldPolicy.REQUIRED)
    private String itemIdentifier;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String titleIdentifier;
    @TaggedField(FieldPolicy.NOT_REQUIRED)
    private String itemProperties;
    @TaggedField
    private String screenMessage;
    @TaggedField
    private String printLine;

    public Boolean isOk() {
        return this.ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public java.util.Date getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(java.util.Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getItemIdentifier() {
        return this.itemIdentifier;
    }

    public void setItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    public String getTitleIdentifier() {
        return this.titleIdentifier;
    }

    public void setTitleIdentifier(String titleIdentifier) {
        this.titleIdentifier = titleIdentifier;
    }

    public String getItemProperties() {
        return this.itemProperties;
    }

    public void setItemProperties(String itemProperties) {
        this.itemProperties = itemProperties;
    }

    public String getScreenMessage() {
        return this.screenMessage;
    }

    public void setScreenMessage(String screenMessage) {
        this.screenMessage = screenMessage;
    }

    public String getPrintLine() {
        return this.printLine;
    }

    public void setPrintLine(String printLine) {
        this.printLine = printLine;
    }
}

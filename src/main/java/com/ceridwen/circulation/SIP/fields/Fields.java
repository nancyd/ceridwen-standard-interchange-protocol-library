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
package com.ceridwen.circulation.SIP.fields;

import java.util.Date;

import com.ceridwen.circulation.SIP.annotations.Field;
import com.ceridwen.circulation.SIP.annotations.PositionedField;
import com.ceridwen.circulation.SIP.annotations.TaggedField;
import com.ceridwen.circulation.SIP.types.enumerations.CirculationStatus;
import com.ceridwen.circulation.SIP.types.enumerations.CurrencyType;
import com.ceridwen.circulation.SIP.types.enumerations.FeeType;
import com.ceridwen.circulation.SIP.types.enumerations.HoldMode;
import com.ceridwen.circulation.SIP.types.enumerations.HoldType;
import com.ceridwen.circulation.SIP.types.enumerations.Language;
import com.ceridwen.circulation.SIP.types.enumerations.MediaType;
import com.ceridwen.circulation.SIP.types.enumerations.PaymentType;
import com.ceridwen.circulation.SIP.types.enumerations.ProtocolVersion;
import com.ceridwen.circulation.SIP.types.enumerations.SecurityMarker;
import com.ceridwen.circulation.SIP.types.enumerations.StatusCode;
import com.ceridwen.circulation.SIP.types.flagfields.PatronStatus;
import com.ceridwen.circulation.SIP.types.flagfields.Summary;
import com.ceridwen.circulation.SIP.types.flagfields.SupportedMessages;

public class Fields {
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean ACSRenewalPolicy;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean alert;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean available;
    @Field(tag = "AL", policy = FieldPolicy.REQUIRED)
    String blockedCardMessage;
    @Field(tag = "BI", policy = FieldPolicy.NOT_REQUIRED)
    Boolean cancel;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean cardRetained;
    @Field(length = 2, policy = FieldPolicy.REQUIRED)
    CirculationStatus circulationStatus;
    @Field(tag = "AU", policy = FieldPolicy.NOT_REQUIRED)
    String chargedItems;
    @Field(length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer chargedItemsCount;
    @Field(tag = "CB", length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer chargedItemsLimit;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean checkInOk;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean checkOutOk;
    @Field(tag = "BH", length = 3)
    CurrencyType currencyType;
    @Field(tag = "AP")
    String currentLocation;
    @Field(policy = FieldPolicy.REQUIRED)
    Date dateTimeSync; 
    @Field(length = 1, policy = FieldPolicy.REQUIRED)
    Boolean desensitize;
    @Field(tag = "AH") //This date need not be in the standard format
    String dueDate; 
    @Field(tag = "BE", policy = FieldPolicy.NOT_REQUIRED)
    String emailAddress;
    @Field(tag = "BQ", policy = FieldPolicy.NOT_REQUIRED)
    Integer endItem;
    @Field(length = 1, policy = FieldPolicy.REQUIRED)
    Boolean endSession;
    @Field(tag = "BW", policy = FieldPolicy.NOT_REQUIRED)
    Date expirationDate;
    @Field(tag = "BO", policy = FieldPolicy.NOT_REQUIRED)
    Boolean feeAcknowledged;
    @Field(tag = "BV") //Formated according to country conventions
    String feeAmount;
    @Field(tag = "CC", policy = FieldPolicy.NOT_REQUIRED) //Formated according to country conventions
    String feeLimit; 
    @Field(tag = "CG", policy = FieldPolicy.NOT_REQUIRED)
    String feeIdentifier;
    @Field(tag = "BT", length = 2)
    FeeType feeType;
    @Field(tag = "AV", policy = FieldPolicy.NOT_REQUIRED)
    String[] fineItems; 
    @Field(length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer fineItemsCount;
    @Field(tag = "AS", policy = FieldPolicy.NOT_REQUIRED)
    String[] holdItems; 
    @Field(length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer holdItemsCount; 
    @Field(tag = "BZ", length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer holdItemsLimit;
    @Field(length = 1, policy = FieldPolicy.REQUIRED)
    HoldMode holdMode; 
    @Field(tag = "CM", policy = FieldPolicy.NOT_REQUIRED)
    Date holdPickupDate;
    @Field(tag = "CF", length=5, policy = FieldPolicy.REQUIRED) // according to spec should be no length, not required but that breaks 3M emulator
    Integer holdQueueLength;
    @Field(tag = "BY", length = 1, policy = FieldPolicy.NOT_REQUIRED)
    HoldType holdType;
    @Field(tag = "BD", policy = FieldPolicy.NOT_REQUIRED)
    String homeAddress;
    @Field(tag = "BF", policy = FieldPolicy.NOT_REQUIRED)
    String homePhoneNumber;
    @Field(tag = "AO", policy = FieldPolicy.REQUIRED)
    String institutionId;
    @Field(tag = "AB")
    String itemIdentifier;
    @Field(tag = "CH")
    String itemProperties;
    @Field(length = 3, policy = FieldPolicy.REQUIRED)
    Language language;
    @Field(tag = "AM", policy = FieldPolicy.NOT_REQUIRED)
    String libraryName;
    @Field(tag = "CP", policy = FieldPolicy.NOT_REQUIRED)
    String locationCode;
    @Field(tag = "CN", policy = FieldPolicy.REQUIRED)
    String loginUserId;
    @Field(tag = "CO", policy = FieldPolicy.REQUIRED)
    String loginPassword;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean magneticMedia;
    @Field(length = 3, policy = FieldPolicy.REQUIRED)
    Integer maxPrintWidth;
    @Field(tag = "CK", length = 3, policy = FieldPolicy.NOT_REQUIRED)
    MediaType mediaType;
    @Field(policy = FieldPolicy.NOT_REQUIRED)
    Date nbDueDate;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean noBlock;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean offlineOk;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean ok;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean onlineStatus;
    @Field(tag = "AT", policy = FieldPolicy.NOT_REQUIRED)
    String[] overdueItems;
    @Field(length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer overdueItemsCount;
    @Field(tag = "CA", length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer overdueItemsLimit;
    @Field(tag = "BG", policy = FieldPolicy.NOT_REQUIRED)
    String owner;
    @Field(tag = "AA")
    String patronIdentifier;
    @Field(tag = "AD")
    String patronPassword;
    @Field(length = 14, policy = FieldPolicy.NOT_REQUIRED)
    PatronStatus patronStatus;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean paymentAccepted;
    @Field(length = 2, policy = FieldPolicy.REQUIRED)
    PaymentType paymentType;
    @Field(tag = "AQ")
    String permanentLocation;
    @Field(tag = "AE", policy = FieldPolicy.REQUIRED)
    String personalName;
    @Field(tag = "BS", policy = FieldPolicy.NOT_REQUIRED)
    String pickupLocation;
    @Field(tag = "AG", policy = FieldPolicy.NOT_REQUIRED)
    String printLine;
    @Field(length = 4, policy = FieldPolicy.REQUIRED)
    ProtocolVersion protocolVersion;
    @Field(length = 1, policy = FieldPolicy.NOT_REQUIRED)
    String PWDAlgorithm;
    @Field(tag = "BR", policy = FieldPolicy.NOT_REQUIRED)
    Integer queuePosition;
    @Field(tag = "CJ", policy = FieldPolicy.NOT_REQUIRED)
    Date recallDate;
    @Field(tag = "BU", policy = FieldPolicy.NOT_REQUIRED)
    String[] recallItems;
    @Field(length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer recallItemsCount;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean renewalOk;
    @Field(length = 4, policy = FieldPolicy.REQUIRED)
    Integer renewedCount;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean resensitize;
    @Field(length = 3, policy = FieldPolicy.REQUIRED)
    Integer retriesAllowed;
    @Field(policy = FieldPolicy.NOT_REQUIRED)
    Date returnDate;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean SCRenewalPolicy;
    @Field(length = 2, policy = FieldPolicy.REQUIRED)
    SecurityMarker securityMarker;
    @Field(tag = "AF", policy = FieldPolicy.NOT_REQUIRED)
    String screenMessage;
    @Field(tag = "CI", policy = FieldPolicy.NOT_REQUIRED)
    Boolean securityInhibit;
    @Field(tag = "CL", policy = FieldPolicy.NOT_REQUIRED)
    String sortBin;
    @Field(tag = "BP", policy = FieldPolicy.NOT_REQUIRED)
    Integer startItem;
    @Field(length = 1, policy = FieldPolicy.REQUIRED)
    StatusCode statusCode;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean statusUpdateOk;
    @Field(length = 10, policy = FieldPolicy.NOT_REQUIRED)
    Summary summary;
    @Field(tag = "BX", length = 16, policy = FieldPolicy.REQUIRED)
    SupportedMessages supportedMessages;
    @Field(tag = "AN", policy = FieldPolicy.NOT_REQUIRED)
    String terminalLocation;
    @Field(tag = "AC")
    String terminalPassword;
    @Field(policy = FieldPolicy.REQUIRED)
    Boolean thirdPartyAllowed;
    @Field(length = 3, policy = FieldPolicy.REQUIRED)
    Integer timeoutPeriod;
    @Field(tag = "AJ")
    String titleIdentifier;
    @Field(policy = FieldPolicy.REQUIRED)
    Date transactionDate;
    @Field(tag = "BK", policy = FieldPolicy.NOT_REQUIRED)
    String transactionId;
    @Field(length = 1, policy = FieldPolicy.NOT_REQUIRED)
    String UIDAlgorithm;
    @Field(length = 4, policy = FieldPolicy.NOT_REQUIRED)
    Integer unavailableHoldsCount;
    @Field(tag = "CD", policy = FieldPolicy.NOT_REQUIRED)
    String unavailableHoldItems;
    @Field(length = 4, policy = FieldPolicy.REQUIRED)
    Integer unrenewedCount;
    @Field(tag = "BL", policy = FieldPolicy.NOT_REQUIRED)
    Boolean validPatron;
    @Field(tag = "CQ", policy = FieldPolicy.NOT_REQUIRED)
    Boolean validPatronPassword;
    @Field(tag = "PB", policy = FieldPolicy.NOT_REQUIRED)
    Date birthDate;
    @Field(tag = "PA", policy = FieldPolicy.NOT_REQUIRED)
    String pacAccessType;
    @Field(tag = "ZY", policy = FieldPolicy.NOT_REQUIRED)
    String patronType;
    @Field(tag = "PT", policy = FieldPolicy.NOT_REQUIRED)
    String patronGroup;

    @Field(tag = "PC", policy = FieldPolicy.NOT_REQUIRED)
    String patronLoanClass;
    @Field(tag = "PE", policy = FieldPolicy.NOT_REQUIRED)
    String patronUserCategory1;
    @Field(tag = "PF", policy = FieldPolicy.NOT_REQUIRED)
    String patronUserCategory2;


    static public PositionedFieldDefinition getPositionedFieldDefinition(String messageName, String fieldName, PositionedField annotation) {
        java.lang.reflect.Field fld;
        try {
            fld = Fields.class.getDeclaredField(fieldName);
        } catch (Exception ex) {
            throw new java.lang.AssertionError(messageName + " - Positioned FieldDescriptor not defined: " + fieldName);            
        }
//        if (fld == null) {
//            throw new java.lang.AssertionError(messageName + " - Positioned FieldDescriptor not defined: " + fieldName);            
//        }
        Field fldann = fld.getAnnotation(Field.class);
        if (fldann == null) {
            throw new java.lang.AssertionError(messageName + " - Positioned FieldDescriptor not defined: " + fieldName);            
        }
        FieldDefinition field = new FieldDefinition(fldann, fld.getType());
        if (field.length == 0) {
            throw new java.lang.AssertionError(messageName + " - Positioned FieldDescriptor must explicit length: " + fieldName);
        }
        if ((annotation.end() - annotation.start() + 1) != field.length) {
            throw new java.lang.AssertionError(messageName + " - Positioned FieldDescriptors length mismatch: " + fieldName);
        }
        PositionedFieldDefinition pfd = new PositionedFieldDefinition(fieldName, annotation.start(),
                annotation.end(), field, annotation.policy());
        return pfd;        
    }

    static public TaggedFieldDefinition getTaggedFieldDefinition(String messageName, String fieldName, TaggedField annotation) {
        java.lang.reflect.Field fld;
        try {
            fld = Fields.class.getDeclaredField(fieldName);
        } catch (Exception ex) {
            throw new java.lang.AssertionError(messageName + " - Tagged FieldDescriptor not defined: " + fieldName);            
        }
//        if (fld == null) {
//            throw new java.lang.AssertionError(messageName + " - Tagged FieldDescriptor not defined: " + fieldName);            
//        }
        Field fldann = fld.getAnnotation(Field.class);
        if (fldann == null) {
            throw new java.lang.AssertionError(messageName + " - Tagged FieldDescriptor not defined: " + fieldName);            
        }
        FieldDefinition field = new FieldDefinition(fldann, fld.getType());
        if (field.tag.isEmpty()) {
            throw new java.lang.AssertionError(messageName + " - field tag not defined: " + fieldName);                        
        }
        TaggedFieldDefinition tfd = new TaggedFieldDefinition(fieldName, field, annotation.value());
        return tfd;
    }    
}

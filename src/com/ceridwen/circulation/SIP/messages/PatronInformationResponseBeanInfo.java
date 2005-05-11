package com.ceridwen.circulation.SIP.messages;

import java.beans.*;
import com.ceridwen.circulation.SIP.helpers.*;

/**
 * <p>Title: RTSI</p>
 * <p>Description: Real Time Self Issue</p>
 * <p>Copyright: </p>

 * @author Matthew J. Dovey
 * @version 1.0
 */

public class PatronInformationResponseBeanInfo extends SimpleBeanInfo {
  Class beanClass = PatronInformationResponse.class;
  String iconColor16x16Filename;
  String iconColor32x32Filename;
  String iconMono16x16Filename;
  String iconMono32x32Filename;

  public PatronInformationResponseBeanInfo() {
  }
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor _chargedItems = new PropertyDescriptor("chargedItems", beanClass, "getChargedItems", "setChargedItems");
      PropertyDescriptor _chargedItemsCount = new PropertyDescriptor("chargedItemsCount", beanClass, "getChargedItemsCount", "setChargedItemsCount");
      PropertyDescriptor _chargedItemsLimit = new PropertyDescriptor("chargedItemsLimit", beanClass, "getChargedItemsLimit", "setChargedItemsLimit");
      PropertyDescriptor _currencyType = new PropertyDescriptor("currencyType", beanClass, "getCurrencyType", "setCurrencyType");
      PropertyDescriptor _eMailAddress = new PropertyDescriptor("eMailAddress", beanClass, "getEMailAddress", "setEMailAddress");
      PropertyDescriptor _feeAmount = new PropertyDescriptor("feeAmount", beanClass, "getFeeAmount", "setFeeAmount");
      PropertyDescriptor _feeLimit = new PropertyDescriptor("feeLimit", beanClass, "getFeeLimit", "setFeeLimit");
      PropertyDescriptor _fineItems = new PropertyDescriptor("fineItems", beanClass, "getFineItems", "setFineItems");
      PropertyDescriptor _fineItemsCount = new PropertyDescriptor("fineItemsCount", beanClass, "getFineItemsCount", "setFineItemsCount");
      PropertyDescriptor _holdItems = new PropertyDescriptor("holdItems", beanClass, "getHoldItems", "setHoldItems");
      PropertyDescriptor _holdItemsCount = new PropertyDescriptor("holdItemsCount", beanClass, "getHoldItemsCount", "setHoldItemsCount");
      PropertyDescriptor _holdItemsLimit = new PropertyDescriptor("holdItemsLimit", beanClass, "getHoldItemsLimit", "setHoldItemsLimit");
      PropertyDescriptor _homeAddress = new PropertyDescriptor("homeAddress", beanClass, "getHomeAddress", "setHomeAddress");
      PropertyDescriptor _homePhoneNumber = new PropertyDescriptor("homePhoneNumber", beanClass, "getHomePhoneNumber", "setHomePhoneNumber");
      PropertyDescriptor _institutionId = new PropertyDescriptor("institutionId", beanClass, "getInstitutionId", "setInstitutionId");
      PropertyDescriptor _language = new PropertyDescriptor("language", beanClass, "getLanguage", "setLanguage");
      PropertyDescriptor _overdueItems = new PropertyDescriptor("overdueItems", beanClass, "getOverdueItems", "setOverdueItems");
      PropertyDescriptor _overdueItemsCount = new PropertyDescriptor("overdueItemsCount", beanClass, "getOverdueItemsCount", "setOverdueItemsCount");
      PropertyDescriptor _overdueItemsLimit = new PropertyDescriptor("overdueItemsLimit", beanClass, "getOverdueItemsLimit", "setOverdueItemsLimit");
      PropertyDescriptor _patronIdentifier = new PropertyDescriptor("patronIdentifier", beanClass, "getPatronIdentifier", "setPatronIdentifier");
      PropertyDescriptor _patronStatus = new PropertyDescriptor("patronStatus", beanClass, "getPatronStatus", "setPatronStatus");
      PropertyDescriptor _personalName = new PropertyDescriptor("personalName", beanClass, "getPersonalName", "setPersonalName");
      PropertyDescriptor _printLine = new PropertyDescriptor("printLine", beanClass, "getPrintLine", "setPrintLine");
      PropertyDescriptor _recallItems = new PropertyDescriptor("recallItems", beanClass, "getRecallItems", "setRecallItems");
      PropertyDescriptor _recallItemsCount = new PropertyDescriptor("recallItemsCount", beanClass, "getRecallItemsCount", "setRecallItemsCount");
      PropertyDescriptor _screenMessage = new PropertyDescriptor("screenMessage", beanClass, "getScreenMessage", "setScreenMessage");
      PropertyDescriptor _transactionDate = new PropertyDescriptor("transactionDate", beanClass, "getTransactionDate", "setTransactionDate");
      PropertyDescriptor _unavailableHoldsCount = new PropertyDescriptor("unavailableHoldsCount", beanClass, "getUnavailableHoldsCount", "setUnavailableHoldsCount");
      PropertyDescriptor _unavilableHoldItems = new PropertyDescriptor("unavilableHoldItems", beanClass, "getUnavilableHoldItems", "setUnavilableHoldItems");
      PropertyDescriptor _validPatron = new PropertyDescriptor("validPatron", beanClass, "getValidPatron", "setValidPatron");
      PropertyDescriptor _validPatronPassword = new PropertyDescriptor("validPatronPassword", beanClass, "getValidPatronPassword", "setValidPatronPassword");

      _patronStatus.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(2,15));
      _language.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(16,18));
      _transactionDate.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(19,36));
      _holdItemsCount.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(37,40));
      _overdueItemsCount.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(37,44));
      _chargedItemsCount.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(45,48));
      _fineItemsCount.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(49,52));
      _recallItemsCount.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(53,56));
      _unavailableHoldsCount.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(57,60));

      _institutionId.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("AO") );
      _patronIdentifier.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("AA"));
      _personalName.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("AE"));
      _holdItemsLimit.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("BZ"));
      _overdueItemsLimit.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("CA"));
      _chargedItemsLimit.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("CB"));
      _validPatron.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("BL"));
      _validPatronPassword.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("CQ"));
      _currencyType.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("BH"));
      _feeAmount.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("BV"));
      _feeLimit.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("CC"));
      _homeAddress.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("BD"));
      _eMailAddress.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("BE"));
      _homePhoneNumber.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("BF"));
      _screenMessage.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("AF"));
      _printLine.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("AG"));


      PropertyDescriptor[] pds = new PropertyDescriptor[] {
        _chargedItems,
        _chargedItemsCount,
        _chargedItemsLimit,
        _currencyType,
        _eMailAddress,
        _feeAmount,
        _feeLimit,
        _fineItems,
        _fineItemsCount,
        _holdItems,
        _holdItemsCount,
        _holdItemsLimit,
        _homeAddress,
        _homePhoneNumber,
        _institutionId,
        _language,
        _overdueItems,
        _overdueItemsCount,
        _overdueItemsLimit,
        _patronIdentifier,
        _patronStatus,
        _personalName,
        _printLine,
        _recallItems,
        _recallItemsCount,
        _screenMessage,
        _transactionDate,
        _unavailableHoldsCount,
        _unavilableHoldItems,
        _validPatron,
        _validPatronPassword};
      return pds;
    }
    catch(IntrospectionException ex) {
      ex.printStackTrace();
      return null;
    }
  }
  public java.awt.Image getIcon(int iconKind) {
    switch (iconKind) {
      case BeanInfo.ICON_COLOR_16x16:
        return iconColor16x16Filename != null ? loadImage(iconColor16x16Filename) : null;
      case BeanInfo.ICON_COLOR_32x32:
        return iconColor32x32Filename != null ? loadImage(iconColor32x32Filename) : null;
      case BeanInfo.ICON_MONO_16x16:
        return iconMono16x16Filename != null ? loadImage(iconMono16x16Filename) : null;
      case BeanInfo.ICON_MONO_32x32:
        return iconMono32x32Filename != null ? loadImage(iconMono32x32Filename) : null;
    }
    return null;
  }
}
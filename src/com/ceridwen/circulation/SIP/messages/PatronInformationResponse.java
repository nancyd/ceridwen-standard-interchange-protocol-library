package com.ceridwen.circulation.SIP.messages;

import java.util.Date;

/**
 * <p>Title: RTSI</p>
 * <p>Description: Real Time Self Issue</p>
 * <p>Copyright: </p>

 * @author Matthew J. Dovey
 * @version 1.0
 */

public class PatronInformationResponse extends Message {
  private String patronStatus;
  private String language;
  private Date transactionDate;
  private String holdItemsCount;
  private String overdueItemsCount;
  private String chargedItemsCount;
  private String fineItemsCount;
  private String recallItemsCount;
  private String unavailableHoldsCount;
  private String institutionId;
  private String patronIdentifier;
  private String personalName;
  private String holdItemsLimit;
  private String overdueItemsLimit;
  private String chargedItemsLimit;
  private Boolean validPatron;
  private Boolean validPatronPassword;
  private String currencyType;
  private String feeAmount;
  private String feeLimit;
  private String[] holdItems;
  private String[] overdueItems;
  private String[] chargedItems;
  private String[] fineItems;
  private String[] recallItems;
  private String[] unavilableHoldItems;
  /**@todo: add array support
   */
  private String homeAddress;
  private String eMailAddress;
  private String homePhoneNumber;
  private String screenMessage;
  private String printLine;

  public String getCommand() {
    return "64";
  }
  public String[] getChargedItems() {
    return chargedItems;
  }
  public String getChargedItemsCount() {
    return chargedItemsCount;
  }
  public String getChargedItemsLimit() {
    return chargedItemsLimit;
  }
  public String getCurrencyType() {
    return currencyType;
  }
  public String getEMailAddress() {
    return eMailAddress;
  }
  public String getFeeAmount() {
    return feeAmount;
  }
  public String getFeeLimit() {
    return feeLimit;
  }
  public String[] getFineItems() {
    return fineItems;
  }
  public String getFineItemsCount() {
    return fineItemsCount;
  }
  public String[] getHoldItems() {
    return holdItems;
  }
  public String getHoldItemsCount() {
    return holdItemsCount;
  }
  public String getHoldItemsLimit() {
    return holdItemsLimit;
  }
  public String getHomeAddress() {
    return homeAddress;
  }
  public String getHomePhoneNumber() {
    return homePhoneNumber;
  }
  public String getInstitutionId() {
    return institutionId;
  }
  public String getLanguage() {
    return language;
  }
  public String[] getOverdueItems() {
    return overdueItems;
  }
  public String getOverdueItemsCount() {
    return overdueItemsCount;
  }
  public String getOverdueItemsLimit() {
    return overdueItemsLimit;
  }
  public String getPatronIdentifier() {
    return patronIdentifier;
  }
  public String getPatronStatus() {
    return patronStatus;
  }
  public String getPersonalName() {
    return personalName;
  }
  public String getPrintLine() {
    return printLine;
  }
  public String[] getRecallItems() {
    return recallItems;
  }
  public String getRecallItemsCount() {
    return recallItemsCount;
  }
  public String getScreenMessage() {
    return screenMessage;
  }
  public Date getTransactionDate() {
    return transactionDate;
  }
  public String getUnavailableHoldsCount() {
    return unavailableHoldsCount;
  }
  public String[] getUnavilableHoldItems() {
    return unavilableHoldItems;
  }
  public Boolean getValidPatron() {
    return validPatron;
  }
  public Boolean getValidPatronPassword() {
    return validPatronPassword;
  }
  public void setValidPatronPassword(Boolean validPatronPassword) {
    this.validPatronPassword = validPatronPassword;
  }
  public void setValidPatron(Boolean validPatron) {
    this.validPatron = validPatron;
  }
  public void setUnavilableHoldItems(String[] unavilableHoldItems) {
    this.unavilableHoldItems = unavilableHoldItems;
  }
  public void setUnavailableHoldsCount(String unavailableHoldsCount) {
    this.unavailableHoldsCount = unavailableHoldsCount;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }
  public void setScreenMessage(String screenMessage) {
    this.screenMessage = screenMessage;
  }
  public void setRecallItemsCount(String recallItemsCount) {
    this.recallItemsCount = recallItemsCount;
  }
  public void setRecallItems(String[] recallItems) {
    this.recallItems = recallItems;
  }
  public void setPrintLine(String printLine) {
    this.printLine = printLine;
  }
  public void setPersonalName(String personalName) {
    this.personalName = personalName;
  }
  public void setPatronStatus(String patronStatus) {
    this.patronStatus = patronStatus;
  }
  public void setPatronIdentifier(String patronIdentifier) {
    this.patronIdentifier = patronIdentifier;
  }
  public void setOverdueItemsLimit(String overdueItemsLimit) {
    this.overdueItemsLimit = overdueItemsLimit;
  }
  public void setOverdueItemsCount(String overdueItemsCount) {
    this.overdueItemsCount = overdueItemsCount;
  }
  public void setOverdueItems(String[] overdueItems) {
    this.overdueItems = overdueItems;
  }
  public void setLanguage(String language) {
    this.language = language;
  }
  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }
  public void setHomePhoneNumber(String homePhoneNumber) {
    this.homePhoneNumber = homePhoneNumber;
  }
  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }
  public void setHoldItemsLimit(String holdItemsLimit) {
    this.holdItemsLimit = holdItemsLimit;
  }
  public void setHoldItemsCount(String holdItemsCount) {
    this.holdItemsCount = holdItemsCount;
  }
  public void setHoldItems(String[] holdItems) {
    this.holdItems = holdItems;
  }
  public void setFineItemsCount(String fineItemsCount) {
    this.fineItemsCount = fineItemsCount;
  }
  public void setFineItems(String[] fineItems) {
    this.fineItems = fineItems;
  }
  public void setFeeLimit(String feeLimit) {
    this.feeLimit = feeLimit;
  }
  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }
  public void setChargedItems(String[] chargedItems) {
    this.chargedItems = chargedItems;
  }
  public void setChargedItemsCount(String chargedItemsCount) {
    this.chargedItemsCount = chargedItemsCount;
  }
  public void setChargedItemsLimit(String chargedItemsLimit) {
    this.chargedItemsLimit = chargedItemsLimit;
  }
  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }
  public void setEMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }
}
package com.ceridwen.circulation.SIP.messages;

public class RenewResponse extends Message {
  private Boolean ok;
  private Boolean renewalOk;
  private Boolean magneticMedia;
  private Boolean desensitize;
  private java.util.Date transactionDate;
  private String institutionId;
  private String patronIdentifier;
  private String itemIdentifier;
  private String titleIdentifier;
  private String dueDate;
  private String feeType;
  private Boolean securityInhibit;
  private String currencyType;
  private String feeAmount;
  private String mediaType;
  private String itemProperties;
  private String transactionId;
  private String screenMessage;
  private String printLine;
  public String getCommand() {
    return "30";
  }
  public Boolean getOk() {
    return ok;
  }
  public void setOk(Boolean ok) {
    this.ok = ok;
  }
  public Boolean getRenewalOk() {
    return renewalOk;
  }
  public void setRenewalOk(Boolean renewalOk) {
    this.renewalOk = renewalOk;
  }
  public Boolean getMagneticMedia() {
    return magneticMedia;
  }
  public void setMagneticMedia(Boolean magneticMedia) {
    this.magneticMedia = magneticMedia;
  }
  public Boolean getDesensitize() {
    return desensitize;
  }
  public void setDesensitize(Boolean desensitize) {
    this.desensitize = desensitize;
  }
  public java.util.Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(java.util.Date transactionDate) {
    this.transactionDate = transactionDate;
  }
  public String getInstitutionId() {
    return institutionId;
  }
  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }
  public String getPatronIdentifier() {
    return patronIdentifier;
  }
  public void setPatronIdentifier(String patronIdentifier) {
    this.patronIdentifier = patronIdentifier;
  }
  public String getItemIdentifier() {
    return itemIdentifier;
  }
  public void setItemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }
  public String getTitleIdentifier() {
    return titleIdentifier;
  }
  public void setTitleIdentifier(String titleIdentifier) {
    this.titleIdentifier = titleIdentifier;
  }
  public String getDueDate() {
    return dueDate;
  }
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }
  public String getFeeType() {
    return feeType;
  }
  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }
  public Boolean getSecurityInhibit() {
    return securityInhibit;
  }
  public void setSecurityInhibit(Boolean securityInhibit) {
    this.securityInhibit = securityInhibit;
  }
  public String getCurrencyType() {
    return currencyType;
  }
  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }
  public String getFeeAmount() {
    return feeAmount;
  }
  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }
  public String getItemProperties() {
    return itemProperties;
  }
  public void setItemProperties(String itemProperties) {
    this.itemProperties = itemProperties;
  }
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  public String getScreenMessage() {
    return screenMessage;
  }
  public void setScreenMessage(String screenMessage) {
    this.screenMessage = screenMessage;
  }
  public String getPrintLine() {
    return printLine;
  }
  public void setPrintLine(String printLine) {
    this.printLine = printLine;
  }
}
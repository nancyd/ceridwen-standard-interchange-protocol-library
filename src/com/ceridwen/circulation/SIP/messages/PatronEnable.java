package com.ceridwen.circulation.SIP.messages;

public class PatronEnable extends Message {
  private java.util.Date transactionDate;
  private String institutionId;
  private String patronIdentifier;
  private String terminalPassword;
  private String patronPassword;
  public String getCommand() {
    return "25";
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
  public String getTerminalPassword() {
    return terminalPassword;
  }
  public void setTerminalPassword(String terminalPassword) {
    this.terminalPassword = terminalPassword;
  }
  public String getPatronPassword() {
    return patronPassword;
  }
  public void setPatronPassword(String patronPassword) {
    this.patronPassword = patronPassword;
  }
}
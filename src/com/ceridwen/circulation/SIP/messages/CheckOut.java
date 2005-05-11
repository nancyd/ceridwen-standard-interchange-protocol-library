/**
 * <p>Title: Self Issue</p>
 * <p>Description: Self Issue Client</p>
 * <p>Copyright: 2004,</p>
 * <p>Company: ceridwen.com</p>
 * @author Matthew J. Dovey
 * @version 2.1
 */

package com.ceridwen.circulation.SIP.messages;

import java.util.Date;

public class CheckOut extends Message {
  private Boolean renewalPolicy;
  private Boolean noBlock;
  private Date transactionDate;
  private Date nbDueDate;
  private String institutionId;
  private String patronIdentifier;
  private String itemIdentifier;
  private String terminalPassword;
  private String itemProperties;
  private String patronPassword;
  private Boolean feeAcknowledged;
  private Boolean cancel;

  public String getCommand() {
    return "11";
  }
  public Boolean getCancel() {
    return cancel;
  }
  public Boolean getFeeAcknowledged() {
    return feeAcknowledged;
  }
  public String getInstitutionId() {
    return institutionId;
  }
  public String getItemIdentifier() {
    return itemIdentifier;
  }
  public String getItemProperties() {
    return itemProperties;
  }
  public Date getNbDueDate() {
    return nbDueDate;
  }
  public Boolean getNoBlock() {
    return noBlock;
  }
  public String getPatronIdentifier() {
    return patronIdentifier;
  }
  public String getPatronPassword() {
    return patronPassword;
  }
  public Boolean getRenewalPolicy() {
    return renewalPolicy;
  }
  public String getTerminalPassword() {
    return terminalPassword;
  }
  public Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }
  public void setTerminalPassword(String terminalPassword) {
    this.terminalPassword = terminalPassword;
  }
  public void setRenewalPolicy(Boolean renewalPolicy) {
    this.renewalPolicy = renewalPolicy;
  }
  public void setPatronPassword(String patronPassword) {
    this.patronPassword = patronPassword;
  }
  public void setPatronIdentifier(String patronIdentifier) {
    this.patronIdentifier = patronIdentifier;
  }
  public void setNoBlock(Boolean noBlock) {
    this.noBlock = noBlock;
  }
  public void setNbDueDate(Date nbDueDate) {
    this.nbDueDate = nbDueDate;
  }
  public void setItemProperties(String itemProperties) {
    this.itemProperties = itemProperties;
  }
  public void setItemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }
  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }
  public void setFeeAcknowledged(Boolean feeAcknowledged) {
    this.feeAcknowledged = feeAcknowledged;
  }
  public void setCancel(Boolean cancel) {
    this.cancel = cancel;
  }
}
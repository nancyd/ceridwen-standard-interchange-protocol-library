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

public class ItemInformationResponse extends Message {
  private String circulationStatus;
  private String securityMarker;
  private String feeType;
  private Date transactionDate = new Date();
  private String holdQueueLength;
  private String dueDate;
  private Date recallDate;
  private Date holdPickupDate;
  private String itemIdentifier;
  private String titleIdentifier;
  private String owner;
  private String currencyType;
  private String feeAmount;
  private String mediaType;
  private String permanentLocation;
  private String currentLocation;
  private String itemProperties;
  private String screenMessage;
  private String printLine;

  public String getCommand() {
    return "18";
  }
  public String getCirculationStatus() {
    return circulationStatus;
  }
  public String getCurrencyType() {
    return currencyType;
  }
  public String getCurrentLocation() {
    return currentLocation;
  }
  public String getDueDate() {
    return dueDate;
  }
  public String getFeeAmount() {
    return feeAmount;
  }
  public String getFeeType() {
    return feeType;
  }
  public Date getHoldPickupDate() {
    return holdPickupDate;
  }
  public String getHoldQueueLength() {
    return holdQueueLength;
  }
  public String getItemIdentifier() {
    return itemIdentifier;
  }
  public String getItemProperties() {
    return itemProperties;
  }
  public String getMediaType() {
    return mediaType;
  }
  public String getOwner() {
    return owner;
  }
  public String getPermanentLocation() {
    return permanentLocation;
  }
  public String getPrintLine() {
    return printLine;
  }
  public Date getRecallDate() {
    return recallDate;
  }
  public String getScreenMessage() {
    return screenMessage;
  }
  public String getSecurityMarker() {
    return securityMarker;
  }
  public String getTitleIdentifier() {
    return titleIdentifier;
  }
  public Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }
  public void setTitleIdentifier(String titleIdentifier) {
    this.titleIdentifier = titleIdentifier;
  }
  public void setSecurityMarker(String securityMarker) {
    this.securityMarker = securityMarker;
  }
  public void setScreenMessage(String screenMessage) {
    this.screenMessage = screenMessage;
  }
  public void setRecallDate(Date recallDate) {
    this.recallDate = recallDate;
  }
  public void setPrintLine(String printLine) {
    this.printLine = printLine;
  }
  public void setPermanentLocation(String permanentLocation) {
    this.permanentLocation = permanentLocation;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }
  public void setItemProperties(String itemProperties) {
    this.itemProperties = itemProperties;
  }
  public void setItemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }
  public void setHoldQueueLength(String holdQueueLength) {
    this.holdQueueLength = holdQueueLength;
  }
  public void setHoldPickupDate(Date holdPickupDate) {
    this.holdPickupDate = holdPickupDate;
  }
  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }
  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }
  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }
  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }
  public void setCirculationStatus(String circulationStatus) {
    this.circulationStatus = circulationStatus;
  }
}

package com.ceridwen.circulation.SIP.messages;

import java.beans.*;
import com.ceridwen.circulation.SIP.*;
import com.ceridwen.circulation.SIP.helpers.*;


/**
 * <p>Title: RTSI</p>
 * <p>Description: Real Time Self Issue</p>
 * <p>Copyright: </p>

 * @author Matthew J. Dovey
 * @version 1.0
 */

public class SCStatusBeanInfo extends SimpleBeanInfo {
  Class beanClass = SCStatus.class;
  String iconColor16x16Filename;
  String iconColor32x32Filename;
  String iconMono16x16Filename;
  String iconMono32x32Filename;

  public SCStatusBeanInfo() {
  }
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor _maxPrintWidth = new PropertyDescriptor("maxPrintWidth", beanClass, "getMaxPrintWidth", "setMaxPrintWidth");
      PropertyDescriptor _protocolVersion = new PropertyDescriptor("protocolVersion", beanClass, "getProtocolVersion", "setProtocolVersion");
      PropertyDescriptor _statusCode = new PropertyDescriptor("statusCode", beanClass, "getStatusCode", "setStatusCode");

      _statusCode.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(2,2));
      _maxPrintWidth.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(3,5));
      _protocolVersion.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(6,9));

      PropertyDescriptor[] pds = new PropertyDescriptor[] {
        _maxPrintWidth,
        _protocolVersion,
        _statusCode};
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
/*
 * $Id: FormattedStringArrayConfigurer.java 7861 2011-10-01 06:23:11Z swampwallaby $
 *
 * Copyright (c) 2011 by Brent Easton
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License (LGPL) as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, copies are available
 * at http://www.opensource.org.
 */

package VASSAL.configure;

import java.awt.Component;
import java.awt.event.ActionListener;

public class FormattedStringArrayConfigurer extends StringArrayConfigurer {
  
  protected FormattedExpressionConfigurer config;
  
  public FormattedStringArrayConfigurer(String key, String name, Object val) {
    super(key, name, val);
  }

  public FormattedStringArrayConfigurer(String key, String name) {
    super(key, name);
  }
    
  protected Component getTextComponent() {
    if (config == null) {
      config = new FormattedExpressionConfigurer(null, ""); 
    }
    return config.getControls();
  }
  
  protected String getTextValue() {
    return config.getValueString();
  }
  
  protected void setTextValue(String s) {
    config.setValue(s);
  }
  
  protected void addTextActionListener(ActionListener a) {
    return;
  }
}
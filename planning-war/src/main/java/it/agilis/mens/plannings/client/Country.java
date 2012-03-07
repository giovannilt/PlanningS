/*
 * Ext GWT 2.2.0 - Ext for GWT
 * Copyright(c) 2007-2010, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package it.agilis.mens.plannings.client;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class Country extends BaseModelData {

  public Country() {

  }

  public Country(String abbr, String name, int value) {
    setAbbr(abbr);
    setName(name);
    set("value", value);
  }


    public Country(String abbr, String name) {
        setAbbr(abbr);
        setName(name);
    }

  public String getName() {
    return get("name");
  }

  public void setName(String name) {
    set("name", name);
  }

  public String getAbbr() {
    return get("abbr");
  }

  public void setAbbr(String abbr) {
    set("abbr", abbr);
  }

}

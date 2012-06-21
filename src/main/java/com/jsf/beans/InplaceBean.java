package com.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class InplaceBean {
  private String  text = "PrimeFaces";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

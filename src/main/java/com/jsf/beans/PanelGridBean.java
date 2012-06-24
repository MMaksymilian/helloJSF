package com.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 24.06.12
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class PanelGridBean {

    private Double number = 0d;

    private String string = "default";

    private Date date = new Date();

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

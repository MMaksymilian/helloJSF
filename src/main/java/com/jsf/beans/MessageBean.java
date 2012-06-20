package com.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 07.06.12
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name ="message")
@SessionScoped
public class MessageBean implements Serializable {

    private String message = "empty message string";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

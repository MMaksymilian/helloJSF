package com.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 07.06.12
 * Time: 19:24
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    @ManagedProperty(value="#{message}")
    private MessageBean messages;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMessages(MessageBean messages) {
        this.messages = messages;
    }
    public MessageBean getMessages() {
        return messages;
    }

    public String getSayWelcome(){
        if("".equals(name) || name == null) {
            return "";
        } else {
            return "Ajax message: Welcome" + name;
        }
    }

    public void valueChanged(ValueChangeEvent event) {
        System.out.println("Listener fired on : " + event.getSource() );
    }
}

package com.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 19.06.12
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean
@SessionScoped
public class HandlerBean {
    public void handle() {
        System.out.println("did it. Handled the change");
    }
}

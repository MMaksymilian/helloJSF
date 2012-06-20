package com.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 18.06.12
 * Time: 19:54
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class PaymentController {

    public boolean registerCompleted = true;
    public int orderQty = 120;

    public boolean isRegisterCompleted() {
        return registerCompleted;
    }

    public void setRegisterCompleted(boolean registerCompleted) {
        this.registerCompleted = registerCompleted;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }
}

package com.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 18.06.12
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean
@SessionScoped
public class PageController implements Serializable {

    public String processPage1() {
        return "success";
    }

    public String processPage2() {
        return "success";
    }
}

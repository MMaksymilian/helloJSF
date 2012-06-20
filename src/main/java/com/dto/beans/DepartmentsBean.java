package com.dto.beans;

import com.dto.Departments;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 19.06.12
 * Time: 20:19
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean(name = "departments")
@SessionScoped
public class DepartmentsBean implements Serializable {

    @Resource(name = "java:/jdbc/orclDriver")
    private DataSource ds;

    public List<Departments> getDepartmentsList() throws SQLException {
        if (ds == null) {
            throw new SQLException("Can't get data source");
        }
        Connection con = ds.getConnection();

        if(con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps = con.prepareStatement("select * from departments");
        ResultSet result = ps.executeQuery();
        List<Departments> list = new ArrayList<Departments>();
        while (result.next()) {
            Departments dep = new Departments();
            dep.setDepartmentId(result.getInt("department_id"));
            dep.setDepartmentName(result.getString("department_name"));
            dep.setManagerId(result.getInt("manager_id"));
            dep.setLocationId(result.getInt("location_id"));
            list.add(dep);
        }
        return list;
    }
}

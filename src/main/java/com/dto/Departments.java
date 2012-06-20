package com.dto;

/**
 * Created with IntelliJ IDEA.
 * User: Maksymilian
 * Date: 19.06.12
 * Time: 20:15
 * To change this template use File | Settings | File Templates.
 */
public class Departments {
    public Integer departmentId;
    public String departmentName;
    public Integer managerId;
    public Integer locationId;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}

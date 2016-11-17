package clc.tool.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qup on 11/17/16.
 */
public class Department {

    private String name;
    private Employee chief;
    private List<Employee> staff = new ArrayList<>();
    private String link;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getChief() {
        return chief;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

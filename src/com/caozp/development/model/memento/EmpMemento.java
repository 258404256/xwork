package com.caozp.development.model.memento;

/**
 * 备忘录类
 * Created by caozp on 2016/12/18.
 */
public class EmpMemento {

    private String ename;
    private int age;
    private  double salary;

    public EmpMemento(Emp emp){
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

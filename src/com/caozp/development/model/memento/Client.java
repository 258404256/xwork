package com.caozp.development.model.memento;

/**
 * Created by caozp on 2016/12/18.
 */
public class Client {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("张三",19,900);
        System.out.println("第一次打印的对象："+emp.getEname()+"----"+emp.getAge()+"-----"+emp.getSalary());

        careTaker.setMemento(emp.memento());  // 备忘一次

        emp.setEname("李四");
        emp.setAge(21);
        emp.setSalary(9000);
        System.out.println("第二次打印的对象："+emp.getEname()+"----"+emp.getAge()+"-----"+emp.getSalary());

        emp.recovery(careTaker.getMemento()); // 恢复到备忘录对象保存的状态
        System.out.println("第三次打印的对象："+emp.getEname()+"----"+emp.getAge()+"-----"+emp.getSalary());
    }
}

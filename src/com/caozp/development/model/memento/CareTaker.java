package com.caozp.development.model.memento;

import java.util.Stack;

/**
 * 备忘录开发模式：
 * 负责人类
 * 负责管理备忘录对象
 * Created by caozp on 2016/12/18.
 */
public class CareTaker {

    private EmpMemento memento;

    // 备忘点较多时，可以将备忘录压zhai 还可以将多个对象序列号和持久化
    private Stack<EmpMemento> stack = new Stack<EmpMemento>();

    // 用容器
    //private List<EmpMemento> empList = new ArrayList<EmpMemento>();
    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }

}

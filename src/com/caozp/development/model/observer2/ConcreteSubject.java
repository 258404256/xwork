package com.caozp.development.model.observer2;

import java.util.Observable;

/**
 * 观察者模式Observer
 * 开发中常用的场景：
 * -聊天程序，服务器转发给所有客户端
 * -网络游戏（多人联机对战）场景中，服务器将客户端的状态进行分发
 * -邮箱订阅
 * -Servlet中，监听器的实现
 * -Android中，广播机制
 * -JDK的AWT中事件处理模型，基于观察者模式的委派事件模型（Delegation Event Model）
 *      事件源------------------目标对象
 *      事件监听器---------------观察者
 * -京东商城，群发某种商品打折信息
 *
 * Created by caozp on 2016/12/18.
 */
//目标对象
public class ConcreteSubject extends Observable{

    private int state;

    public void set(int s){
        state = s ; //目标状态发生了改变

        setChanged(); //表示目标对象已经做出了更改

        notifyObservers(state); //通知所有的观察者

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

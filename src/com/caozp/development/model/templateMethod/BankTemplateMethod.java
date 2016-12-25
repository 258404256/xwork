package com.caozp.development.model.templateMethod;

/**
 * 模版方法设计模式template method 方法回调（钩子方法）
 * 什么时候用到模版方法模式：
 * 实现一个算法时，整体步骤很固定，但是，某些部分易变。易变部分可以抽像出来，供子类实现
 * 开发中常见的场景：
 * 非常频繁，各个框架、类库中都有他的影子。比如常见的有：
 * 数据库访问的封装
 * Junit单元测试
 * servlet关于doGet/doPost方法调用
 * Hibernate中模版程序
 * spring中JDBCTemplate、HibernateTemplate等。
 *
 * Created by caozp on 2016/12/18.
 */
public abstract class BankTemplateMethod {

    // 具体方法
    public void takeNumber(){
        System.out.println("取号排队！");
    }

    public abstract void transact();//办理具体的业务  钩子方法

    public void evaluate(){
        System.out.println("反馈评分！");
    }

    //模版方法：把基本操作组合到一起，子类一般不能重写
    public final void process(){
        this.takeNumber();

        this.transact();//像个钩子，执行时，执行那个子类的方法就调取那个

        this.evaluate();
    }
}

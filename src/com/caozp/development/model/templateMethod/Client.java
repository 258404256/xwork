package com.caozp.development.model.templateMethod;

/**
 * Created by caozp on 2016/12/18.
 */
public class Client {

    public static void main(String[] args) {
        BankTemplateMethod btm = new DrwaMoney();
        btm.process();

        // 采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱！！！");
            }
        };
        btm2.process();

        BankTemplateMethod btm3 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要理财，我有2000万！！！");
            }
        };
        btm3.process();
    }
}

class DrwaMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("我要取款！！！");
    }
}

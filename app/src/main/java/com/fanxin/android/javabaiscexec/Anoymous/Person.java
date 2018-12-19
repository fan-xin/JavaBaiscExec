package com.fanxin.android.javabaiscexec.Anoymous;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/19  11:31
 */
public abstract class Person {
    private String name;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();
}

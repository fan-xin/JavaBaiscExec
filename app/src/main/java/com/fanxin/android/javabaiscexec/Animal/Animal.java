package com.fanxin.android.javabaiscexec.Animal;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/17  16:57
 */
public class Animal {
    //属性
    private String name;
    private int month;

    //方法
    public Animal(String name, int month){
        this.name = name;
        this.month = month;

    }

    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void Eat(){
        System.out.println("Animals eat food.");
    }


}

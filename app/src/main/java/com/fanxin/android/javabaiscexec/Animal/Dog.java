package com.fanxin.android.javabaiscexec.Animal;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/17  17:04
 */
public class Dog extends Animal{
    //属性
    private String sex;

    public Dog(){

    }

    public Dog(String name, int month, String sex){
        this.setName(name);
        this.setMonth(month);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //方法
    public void sleep(){
        System.out.println("Dog Sleep");
    }

    public void Eat(){
        System.out.println("Dog eat Meat.");
    }


}

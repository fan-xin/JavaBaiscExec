package com.fanxin.android.javabaiscexec.Animal;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/17  17:00
 */
public class Cat extends Animal {
    //属性
    private double weight;

    public Cat(){

    }

    public Cat(String name, int month, double weight){
        super(name,month);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //方法
    public void Run(){
        System.out.println("Run");
    }

    //重写父类的方法
    public void Eat(){
        System.out.println("Cat eat fish");
    }
}

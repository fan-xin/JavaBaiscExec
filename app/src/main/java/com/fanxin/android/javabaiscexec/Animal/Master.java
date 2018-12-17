package com.fanxin.android.javabaiscexec.Animal;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/17  19:55
 */
public class Master {
    //喂宠物
    //喂猫咪
    //方案一： 编写方法，传入不同类型的动物，调用各自的方法
//    public void feed(Cat cat){
//        cat.Eat();
//        cat.playBall();
//    }
//
//    public void feed(Dog dog){
//        dog.Eat();
//        dog.sleep();
//
//    }


    //方案二: 编写方法，传入动物的父类，方法中通过类型转换，调用指定子类的方法
    public void feed(Animal obj){
        if (obj instanceof Cat){
            Cat temp = (Cat)obj;
            temp.Eat();
            temp.playBall();

        }else if (obj instanceof Dog){
            Dog temp = (Dog)obj;
            temp.Eat();
            temp.sleep();


        }
    }


    //向上转型，父类来接收
    public Dog hasManyTime(){
        System.out.println("Has many time");

        return new Dog();
    }

    public Cat hasLittleTime(){
        System.out.println("Has little time");
        return new Cat();
    }

    public Animal raise(boolean isManyTime){
        if (isManyTime){
            System.out.println("Has Many time");
            return new Dog();

        }else {
            System.out.println("Has little time");
            return new Cat();
        }
    }



}

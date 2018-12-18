package com.fanxin.android.javabaiscexec.Test;

import com.fanxin.android.javabaiscexec.Animal.Animal;
import com.fanxin.android.javabaiscexec.Animal.Cat;
import com.fanxin.android.javabaiscexec.Animal.Dog;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/17  17:23
 */
public class Test {
    public static void main(String[] args){
//        Animal one = new Animal();
//        one.Eat();

        Animal two = new Cat();
        two.Eat();

        Animal three = new Dog();
        three.Eat();

//        one.Eat();
        two.Eat();
        two.setMonth(2);
        two.getMonth();
        three.Eat();
        System.out.println("=====================");

        if (two instanceof Cat){
            //向下转型
            Cat temp = (Cat) two;

            temp.Eat();
            temp.Run();
            temp.getWeight();

            System.out.println("two可以转换为Cat类型");
        }

        if (two instanceof Dog){
            Dog temp2 = (Dog)two;
            temp2.Eat();
            temp2.sleep();
            temp2.getSex();

            System.out.println("two可以转换为Dog类型");

        }

        Animal pet = new Dog("画画",2);
        pet.getMonth();
        pet.getName();
















    }




    Test(){

    }
}

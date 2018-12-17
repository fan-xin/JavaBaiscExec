package com.fanxin.android.javabaiscexec.Test;

import android.animation.AnimatorInflater;

import com.fanxin.android.javabaiscexec.Animal.Animal;
import com.fanxin.android.javabaiscexec.Animal.Cat;
import com.fanxin.android.javabaiscexec.Animal.Dog;
import com.fanxin.android.javabaiscexec.Animal.Master;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/17  19:58
 */
public class MasterTest {

    public static void main(String[] args){
        Master master = new Master();
        Cat cat = new Cat();
        Dog dog = new Dog();

        master.feed(cat);
        master.feed(dog);

        System.out.println("----------------------");
        Boolean isManyTime = false;


        Animal temp;

        if (isManyTime){
            temp = master.hasManyTime();
        }else {
            temp = master.hasLittleTime();
        }

        System.out.println(temp);

        Animal temp2 = master.raise(isManyTime);

        System.out.println(temp2);




    }
}

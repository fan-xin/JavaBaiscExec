package com.fanxin.android.javabaiscexec.People;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/18  20:12
 */
public class PeopleTest {

    public static void main(String[] args){
        Person lili = new Person();
        lili.age = 12;

        //获取内部类的对象
        //new一个外部类的对象，然后new内部类
        Person.Heart myheart = new Person().new Heart();
        System.out.println(myheart.beat());

        //使用外部类的对象，获取内部类的实例
        myheart = lili.new Heart();
        System.out.println(myheart.beat());



    }
}

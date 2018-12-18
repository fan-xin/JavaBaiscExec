package com.fanxin.android.javabaiscexec.People;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/18  20:10
 */
//外部类
public class Person {
    int age;
    public Heart getHeart(){
        return new Heart();
    }

    //成员内部类
    class Heart{
        public String beat(){
            return "心脏在跳动！";
        }
    }
}

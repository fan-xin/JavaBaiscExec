package com.fanxin.android.javabaiscexec.People;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/18  20:10
 */
//外部类
public class Person {
    int age = 12;
    public Object getHeart(){
        class Heart {
            int age = 13;
            int temp = 22;

            public String beat() {
                new Person().eat();
                //eat();
                return new Person().age+"岁的心脏在跳动！";
            }
        }

        return new Heart().beat();
    }

    public void eat() {
        System.out.println("人会吃东西");

    }

//    //成员内部类
//    class Heart{
//        public String beat(){
//            return "心脏在跳动！";
//        }


    //成员内部类
//    public static class Heart {
//        int age = 13;
//        int temp = 22;
//
//        public String beat() {
//            new Person().eat();
//            //eat();
//            return new Person().age+"岁的心脏在跳动！";
//        }
//    }
}


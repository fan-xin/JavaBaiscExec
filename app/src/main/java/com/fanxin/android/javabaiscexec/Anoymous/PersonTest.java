package com.fanxin.android.javabaiscexec.Anoymous;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/19  11:37
 */
public class PersonTest {

    //根据传入的不同的人的类型，调用对应的方法
    //方案一
//    public void getRead(Man man){
//        man.read();
//    }
//
//    public void getRead(Woman woman){
//        woman.read();
//    }

    //方案二
    public void getRead(Person person){
        person.read();
    }

    public static void main(String[] args){
        PersonTest test = new PersonTest();
//        Man one = new Man();
//        Woman two = new Woman();
//        test.getRead(one);
//        test.getRead(two);
        //方案三 匿名内部类
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("看科幻书籍");
            }
        });

    }
}

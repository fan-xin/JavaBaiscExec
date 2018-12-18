package com.fanxin.android.javabaiscexec.Tel;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/18  15:31
 */
public class PhoneTest {

    public static void main(String[] args){
        FourthPhone phone = new FourthPhone();
        phone.call();
        phone.message();
        phone.vedio();
        phone.photo();
        phone.network();


        IPhoto ip = new FourthPhone();
        ip.photo();
        ip = new Camera();
        ip.photo();


        INet net2 = new SmartWatch();
        net2.connection();

    }
}

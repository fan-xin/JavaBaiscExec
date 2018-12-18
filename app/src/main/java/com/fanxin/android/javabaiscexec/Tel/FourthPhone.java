package com.fanxin.android.javabaiscexec.Tel;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/18  15:30
 */
public class FourthPhone extends ThirdPhone implements IPhoto {


    public void network(){
        System.out.println("手机可以上网");
    }

    public void game(){
        System.out.println("手机可以玩游戏");
    }

    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }
}

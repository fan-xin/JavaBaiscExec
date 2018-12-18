package com.fanxin.android.javabaiscexec.Tel;

/**
 * 原始手机
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/12/18  12:52
 */
public class Telphone {
    private String brand;
    private int price;

    public Telphone(){

    }

    //打电话功能
    public void call(){
        System.out.println("手机可以打电话");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

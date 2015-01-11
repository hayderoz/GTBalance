package com.example.hayder.gtbalance;

/**
 * Created by hayder on 03/01/2015.
 */
public class TabCustomer{
    private int idCus;
    private String NameCus;
    private String NoteCus;
    private String PhoneCus;
    private String MobileCus;
    private double  RemainderCus;

    public TabCustomer()
    {

    }
    public TabCustomer(int id,String name, String note , String phone, String mobile,double remainder)
    {
        this.idCus = id;
        this.NameCus = name;
        this.NoteCus = note;
        this.PhoneCus = phone;
        this.MobileCus = mobile;
        this.RemainderCus = remainder;
    }


    public TabCustomer(String nameCus, String noteCus , String phoneCus, String mobileCus,double remainderCus)
    {
        this.NameCus = nameCus;
        this.NoteCus = noteCus;
        this.PhoneCus = phoneCus;
        this.MobileCus = mobileCus;
        this.RemainderCus = remainderCus;
    }

    public void setIDCus(int idCus) {
        this.idCus = idCus;
    }
    public int getIDCus() {
        return this.idCus;
    }

    public void setNameCus(String nameCus) {
        this.NameCus = nameCus;
    }
    public String getNameCus() {
        return this.NameCus;
    }

    public void setNoteCus(String noteCus) {
        this.NoteCus = noteCus;
    }
    public String getNoteCus() {
        return this.NoteCus;
    }

    public void setPhoneCus(String phoneCus) {
        this.PhoneCus = phoneCus;
    }
    public String getPhoneCus() {
        return this.PhoneCus;
    }

    public void setMobileCus(String mobileCus) {
        this.MobileCus = mobileCus;
    }
    public String getMobileCus() {
        return this.MobileCus;
    }

    public void setRemainderCus(double remainderCus) {
        this.RemainderCus = remainderCus;
    }
    public double getRemainderCus() {
        return this.RemainderCus;
    }



}

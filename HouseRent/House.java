package com.HouseRent;

public class House {

    static private int id_st=0;

    private int id;
    private String name;
    private String phone;
    private String address;
    private double rentmoney;
    private boolean status;//true则还未售出，false则已经售出


    public House(String name, String phone, String address, double rentmoney, boolean status) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rentmoney = rentmoney;
        this.status = status;
        this.id = id_st+1 ;
        id_st++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRentmoney() {
        return rentmoney;
    }

    public void setRentmoney(double rentmoney) {
        this.rentmoney = rentmoney;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    @Override
    public String toString() {
        String sta_str;
        if(status){
            sta_str = "未出售";
        }else{
            sta_str = "已出售";
        }
        return id+"\t"+name+"\t"+phone+"\t"+address+"\t"+rentmoney+"\t"+sta_str;
    }
}

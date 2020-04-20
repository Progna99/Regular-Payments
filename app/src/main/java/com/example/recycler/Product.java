package com.example.recycler;

public class Product {
    private String name;
    private int img;
    private String payment;
    private String weeklyText;
    private String rsText;

    public Product(String name, int img, String payment, String weeklyText, String rsText) {
        this.name = name;
        this.img = img;
        this.payment = payment;
        this.weeklyText = weeklyText;
        this.rsText = rsText;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.name = payment;
    }
    public String getWeeklyText() {
        return weeklyText;
    }
    public void setWeeklyText(String weeklyText) {
        this.name = weeklyText;
    }

    public String getRsText() {
        return rsText;
    }
    public void setRsText(String rsText) {
        this.name = rsText;
    }
}
package com.example.firstproject.ioc;

public class Chef {


    public String cook(String menu) {
        Pork pork = new Pork("한돈 등심");


        return pork.getName() + " 으로 만든 " + menu;
    }
}

package com.javarush;

import com.javarush.model.MySession;

public class Main {
    public static void main(String[] args) {
        MySession mySession = new MySession();
        mySession.start(mySession);
    }
}
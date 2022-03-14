package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        try {
            System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        }catch (TooShortStringException e) {}


    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if(string == null){throw  new TooShortStringException();}
        String result = "";
        String [] worlds = string.split(" ");
        if (worlds.length < 5){throw  new TooShortStringException();
        }
        else {
         result = worlds[1] + " " + worlds[2] + " " + worlds[3] + " " + worlds[4];
        }


        return result;
    }

    public static class TooShortStringException extends RuntimeException{
    }
}

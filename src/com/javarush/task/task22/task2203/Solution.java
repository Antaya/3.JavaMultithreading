package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        if (string == null){ throw new TooShortStringException();
        }

          int indexFirst = string.indexOf("\t");
          int indexLast = string.indexOf("\t", indexFirst + 1);



          if (indexFirst == -1 || indexLast == -1) {
              throw new TooShortStringException();
          } else {

              return string.substring(indexFirst + 1, indexLast);
          }
      }






    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        try {
            System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));

        }catch (TooShortStringException e) {}

    }
}

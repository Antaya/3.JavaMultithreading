package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;


/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line = "";
        while (fileReader.ready()) {
            line += fileReader.readLine() + " ";
        }
        fileReader.close();
        StringBuilder result = getLine(line.split(" "));

        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        char first;
        char last;
        if (words.length == 0) return new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            list.add(w);
        }

       // result.append(list.get(0) + " ");

        for (int i = 0; i < list.size(); i++ ) {
            for (int j = i + 1; j < list.size(); j++) {
                if (i >= list.size()) {
                    break;}
              //  if (j == list.size() - 1) {
                //    result.append(list.get(list.size() - 1));
                  //  break;
                //}

                last = list.get(i).charAt(list.get(i).length() - 1);
                first = list.get(j).charAt(0);

                    if (String.valueOf(last).equalsIgnoreCase(String.valueOf(first))) {
                        result.append(list.get(i) + " ");
                        result.append(list.get(j) + " ");
                      //  list.remove(list.get(j));
                       list.remove(list.get(i));
                        break;

                    }

                }

            }

        return result;

    }
}





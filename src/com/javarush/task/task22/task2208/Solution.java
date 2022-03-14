package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getQuery(map));

    }

    public static String getQuery(Map<String, String> params) {

        StringBuilder sb = new StringBuilder();
        for (String pKey: params.keySet()) {
            String pVal = params.get(pKey);
           if (pVal == null){ continue;}
           if (sb.toString().length() != 0){ sb.append(" and ");}
           sb.append(pKey + " = '" + pVal + "'");


        }

        return sb.toString();
    }
}

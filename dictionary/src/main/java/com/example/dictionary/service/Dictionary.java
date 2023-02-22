package com.example.dictionary.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dictionary implements IDictionary{
    @Override
    public String dictionary(String word) {
        if (dictionary.get(word) !=null){
            return dictionary.get(word);
        } else {
            return "Không hợp lệ!";
        }
    }
    static Map<String, String> dictionary = new LinkedHashMap<>();
    static {
        dictionary.put("Hello", "Xin chào");
        dictionary.put("Walk","Đi bộ");
    }
}

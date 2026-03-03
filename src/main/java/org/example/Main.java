package org.example;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static int defineVowels(String word){
        String vowels = word.replaceAll("[^аеиіоуяєюї]", "");
        return vowels.length();
    }
    public static StringBuilder clearText(StringBuilder text){
        Pattern pattern = Pattern.compile("[!?.,]");
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()){
            matcher.appendReplacement(result, "");
        }
        return result;
    }
    public static void main(String[] args){
        StringBuilder text = new StringBuilder();
        text.append("Привіт, як справи у тебе?");
        System.out.println(text);
        text = clearText(text);
        Pattern pattern = Pattern.compile("\\s+");
        List<String> data = new ArrayList<>(Arrays.asList(pattern.split(text)));
        data.sort(Comparator.comparingInt(Main::defineVowels));
        text.setLength(0);
        for (String word:data){
            text.append(word).append(" ");
        }
        System.out.println(text);
    }
}


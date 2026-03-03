package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static int defineVowels(String word){
        String vowels = word.replaceAll("[бпвмфдтзсцлнржшчгкхґй]", "");
        return vowels.length();
    }
    public static void main(String[] args){
        StringBuilder text = new StringBuilder();
        text.append("Привіт, як справи у тебе?");
        String text_str = text.toString();
        text_str = text_str.replaceAll("[!?.,]", "").toLowerCase();
        List<String> data = new ArrayList<>(Arrays.asList(text_str.split("\\s+")));
        System.out.println(data);
        data.sort(Comparator.comparing(Main::defineVowels));
        System.out.println(data);
    }
}


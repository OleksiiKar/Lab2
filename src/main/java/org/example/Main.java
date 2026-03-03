package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StringBuilder text = new StringBuilder();
        text.append("Привіт, як справи у тебе?");
        String text_str = text.toString();
        text_str = text_str.replaceAll("[!?.,]", "").toLowerCase();
        String[] data = text_str.split("\\s+");
        System.out.println(Arrays.toString(data));
        for (String word : data){
            for(int i=0; i<word.length(); i++){
                char letter = word.charAt(i);
                if (letter=='и'){
                    System.out.println(letter);
                }
            }
        }
        text = new StringBuilder(text_str);
    }
}


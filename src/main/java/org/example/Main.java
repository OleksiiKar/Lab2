package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StringBuilder text = new StringBuilder();
        text.append("Привіт, як справи у тебе?");
        String text_str = text.toString();
        text_str = text_str.replaceAll("[!?.,]", "").toLowerCase();
        System.out.println(text_str);
    }
}


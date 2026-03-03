package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StringBuilder text = new StringBuilder();
        text.append("Привіт, як справи у тебе?");
        String text_str = text.toString();
        text_str = text_str.replaceAll("[!?.,]", "").toLowerCase();
        String[] data = text_str.split("\\s+");
        System.out.println(text_str);
        text = new StringBuilder(text_str);
    }
}


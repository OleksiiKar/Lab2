package Lab2;

public class Main {
    public static void main(String[] args){
        TextProcessing textProcessing = new TextProcessing();
        StringBuilder text = new StringBuilder();
        text.append("кіт мак лід");
        System.out.println(text);
        System.out.println(textProcessing.sortText(text));
    }
}


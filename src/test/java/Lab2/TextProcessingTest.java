package Lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextProcessingTest {
    private TextProcessing textProcessing;

    @BeforeEach
    void setUp(){
        textProcessing = new TextProcessing();
    }

    @Test
    void testSortText_WithPunctuation() {
        StringBuilder input = new StringBuilder("яблуко, кіт! дерево.");
        StringBuilder expected = new StringBuilder("кіт яблуко дерево ");

        StringBuilder actual = textProcessing.sortText(input);

        assertEquals(expected.toString(), actual.toString(), "Розділові знаки повинні видалятися перед сортуванням");
    }

    @Test
    void testSortText_EmptyString() {
        StringBuilder input = new StringBuilder("");
        StringBuilder expected = new StringBuilder(" ");
        StringBuilder actual = textProcessing.sortText(input);
        assertEquals(expected.toString(), actual.toString(), "Порожній рядок має оброблятися без помилок");
    }
}
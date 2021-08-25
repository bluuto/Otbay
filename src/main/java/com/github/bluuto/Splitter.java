package com.github.bluuto;

import java.util.Scanner;

public class Splitter {
    public void split(String sentence) {
        char c = sentence.charAt(sentence.length()-1);
        sentence = sentence.replaceAll("[\\.,'\\?!-]", "");
        String[] s = sentence.split(" ");

        new Translate().translator(s, c);
    }
}
package com.github.bluuto;
import java.util.Scanner;

public class Main {
    private final Scanner keyboard;

    public Main(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void run() {
        System.out.println("Enter a sentence!");
        String sentence = keyboard.nextLine();

        new Splitter().split(sentence);
    }
}

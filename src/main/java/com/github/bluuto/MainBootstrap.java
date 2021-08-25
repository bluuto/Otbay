package com.github.bluuto;
import java.util.Scanner;

public class MainBootstrap {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Make a new instance of Main, and pass Scanner into it
        new Main(keyboard).run();
    }
}

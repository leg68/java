package org.example.article;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container.init();
        new App().run();
        Container.close();

    }
}

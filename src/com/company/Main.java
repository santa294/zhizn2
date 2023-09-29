package com.company;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        javax.swing.SwingUtilities.invokeLater(window);
        //запуск в потоке какой-либо программы
    }
}
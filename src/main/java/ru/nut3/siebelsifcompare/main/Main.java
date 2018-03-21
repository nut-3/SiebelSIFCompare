package ru.nut3.siebelsifcompare.main;

import ru.nut3.siebelsifcompare.ui.MainWindow;

import javax.swing.*;

/**
 * Main module of Siebel SIF Compare program
 */

public class Main {
    public static void main(String[] args) {
        try {
            new MainWindow();
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

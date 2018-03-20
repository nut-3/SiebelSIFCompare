package ru.nut3.siebelsifcompare.ui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

class FileChooser extends JFileChooser {
    private final static String[] extensions = {"sif"};

    FileChooser() {
        super();
        this.setAcceptAllFileFilterUsed(false);
        this.setMultiSelectionEnabled(true);
        this.addChoosableFileFilter(new FileNameExtensionFilter("Siebel SIF", extensions));
    }
}

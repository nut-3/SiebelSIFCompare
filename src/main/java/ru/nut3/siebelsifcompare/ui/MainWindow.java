package ru.nut3.siebelsifcompare.ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static Point location = new Point();

    public MainWindow() throws HeadlessException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        setBounds();

        setLayout(new BorderLayout());

        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenuItem miFileOpenSIF = new JMenuItem("Open SIF");
        JMenuItem miFileExit = new JMenuItem("Exit");

        setJMenuBar(mainMenu);

        mainMenu.add(mFile);

        mFile.add(miFileOpenSIF);
        mFile.add(miFileExit);

        miFileExit.addActionListener(e -> dispose());

        setVisible(true);
    }

    private void setBounds() {
        int x = 500, y = 200;
        if (location.getY() != 0) {
            x = (int) location.getX() + 20;
            y = (int) location.getY() + 20;
        }
        super.setBounds(x, y, 400, 300);
        location.setLocation(x, y);
    }
}

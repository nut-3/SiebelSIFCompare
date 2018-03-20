package ru.nut3.siebelsifcompare.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class MainWindow extends JFrame {
    private static Point location = new Point();
    private FileChooser fc;

    public MainWindow() throws HeadlessException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        setBounds();

        setLayout(new BorderLayout());

        Boolean oldFileChooserRO = UIManager.getBoolean("FileChooser.readOnly");
        UIManager.put("FileChooser.readOnly", Boolean.TRUE);
        fc = new FileChooser();
        UIManager.put("FileChooser.readOnly", oldFileChooserRO);

        createMenu();

        setVisible(true);
    }

    private void setBounds() {
        int x = 500, y = 200;
        if (location.getY() != 0) {
            x = (int) location.getX() + 20;
            y = (int) location.getY() + 20;
        }
        super.setBounds(x, y, 800, 600);
        location.setLocation(x, y);
    }

    private void createMenu() {
        //Init menu items
        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenuItem mFileOpenRepo = new JMenuItem("Connect to Repo");
        JMenuItem mFileOpenSIF = new JMenuItem("Open SIF");
        JMenu mFileOptions = new JMenu("Options");
        JCheckBoxMenuItem mFileOptionsIgnoreCreated = new JCheckBoxMenuItem("Ignore CREATED", true);
        JMenuItem mFileExit = new JMenuItem("Exit");

        //Menu shortcuts
        mFileOpenRepo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //CTRL+N || CMD+N
        mFileOpenSIF.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //CTRL+O || CMD+O
        mFileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()+InputEvent.SHIFT_DOWN_MASK)); // CTRL+SHIFT+X || CMD+SHIFT+X

        //Menu Actions
        mFileExit.addActionListener(e -> dispose());
        mFileOpenSIF.addActionListener(e -> {
            int returnVal = fc.showOpenDialog(MainWindow.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File[] files = fc.getSelectedFiles();
                //This is where a real application would open the file.
                for (File file: files) {
                    System.out.println("Opening: " + file.getName() + ".");
                }
            } else {
                System.out.println("Open command cancelled by user.");
            }
        });

        setJMenuBar(mainMenu);

        //Assemble menu
        mainMenu.add(mFile);
        mFile.add(mFileOpenRepo);
        mFile.add(mFileOpenSIF);
        mFile.add(mFileOptions);
        mFile.add(mFileExit);
        mFileOptions.add(mFileOptionsIgnoreCreated);
    }
}

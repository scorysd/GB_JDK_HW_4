package Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    NoteBook noteBook;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    JButton getById = new JButton("Find by ID");
    JButton getByPhone = new JButton("Find by phone number");
    JButton getByExp = new JButton("Find by experience");
    JTextField textField = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JLabel out = new JLabel();
    GUI(NoteBook noteBook) throws HeadlessException{
        this.noteBook = noteBook;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("NoteBook");
        setResizable(false);
        getById.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.setText(String.valueOf(noteBook.getById(textField.getText())));
            }
        });
        getByExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.setText(String.valueOf(noteBook.getByExp(textField3.getText())));
            }
        });
        getByPhone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.setText(String.valueOf(noteBook.getByTel(textField2.getText())));
            }
        });
        JPanel panOut = new JPanel(new GridLayout(1,1));
        panOut.add(out);
        add(panOut, BorderLayout.NORTH);
        JPanel panBottom = new JPanel(new GridLayout(2,3));
        panBottom.add(textField);
        panBottom.add(textField2);
        panBottom.add(textField3);
        panBottom.add(getById);
        panBottom.add(getByPhone);
        panBottom.add(getByExp);
        add(panBottom, BorderLayout.SOUTH);
        setVisible(true);


    }

}

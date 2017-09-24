package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alibek on 22/09/2017.
 */
public class App {

    private JPanel panel1;
    private JTextField idOfUser;
    private JTextField firstData;
    private JTextField secondDate;
    private JTextField nameText;
    private JButton findAllCheaters;
    private JButton findUserByID;
    private JButton saveButton;

    public App() {
        saveButton.addActionListener(new ActionListener() {
            String name;
            String userID;
            int first;
            int second;
            long date;

            

            @Override
            public void actionPerformed(ActionEvent e) {
                if (    idOfUser.getText().isEmpty()  ||
                        nameText.getText().isEmpty()  ||
                        firstData.getText().isEmpty() ||
                        secondDate.getText().isEmpty()   ) {
                    JOptionPane.showMessageDialog(null, "Вы не заполнили нужное поля.");
                    return;
                }
                userID = idOfUser.getText();
                name = nameText.getText();
                first = Integer.parseInt(firstData.getText());
                second = Integer.parseInt(secondDate.getText());
                date = System.currentTimeMillis();
                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
                Date resultdate = new Date(date);
                System.out.println(sdf.format(resultdate));
                JOptionPane.showMessageDialog(null, "Успешно сохранено.");
                idOfUser.setText("");
                nameText.setText("");
                firstData.setText("");
                secondDate.setText("");
            }
        });
        findAllCheaters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        findUserByID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] arg)
    {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

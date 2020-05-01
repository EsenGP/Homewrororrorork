import javax.swing.*;
import java.awt.event.ActionEvent;

public class StartClass {


    public static void main(String[] args){

        JFrame win = new JFrame("First Window");
        Panel m = new Panel("res\\anime.jpg");
        JFrame win2 = new JFrame("Second Window");
        Panel m2 = new Panel("res\\deathstroke.jpg");
        win2.add(m2);
        win2.setVisible(true);
        win.setSize(1024,576);
        win.add(m);
        win.setLocationRelativeTo(null);
        win.setResizable(false);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win2.setSize(1024,576);
        win2.add(m2);
        win2.setLocationRelativeTo(null);
        win2.setResizable(false);
        win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
        win2.setVisible(false);
        m.buttonExit.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        m.buttonExit.setText("EXIT");
        m.buttonSwitch.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                win.setVisible(false);
                win2.setVisible(true);
            }
        });
        m.buttonSwitch.setText("Go to Second Window");

        m2.buttonExit.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        m2.buttonExit.setText("EXIT");
        m2.buttonSwitch.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                win2.setVisible(false);
                win.setVisible(true);
            }
        });
        m2.buttonSwitch.setText("Go to First Window");

    }



    }



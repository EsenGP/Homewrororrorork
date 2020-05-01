import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public JButton buttonSwitch;
    public JButton buttonExit;

    public Panel( String ImageName){
        setLayout(null);
        ImageIcon img = new ImageIcon(ImageName);
        JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1024,576);
        add(background);
        buttonSwitch = new JButton("Default");
        buttonExit = new JButton("Exit");

        buttonExit.setBounds(30,450,160,50);
        buttonSwitch.setBounds(30,400,160,50);
        buttonExit.setBackground(Color.RED);
        buttonSwitch.setBackground(Color.cyan);
        add(buttonSwitch);
        add(buttonExit);

    }

    public Panel(){}

}

import gui.mainForm;

import javax.swing.*;
import java.io.File;

public class main {

    public static void main(String[] args){
        JCAudio.play(new File("wav/i.wav"));
        JFrame frame = new JFrame("mainForm");
        frame.setContentPane(new mainForm().getPnlMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

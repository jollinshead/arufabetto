import javax.swing.*;
import java.net.URISyntaxException;

public class main {

    public static void main(String[] args) throws URISyntaxException {
        JCAudio.play("O.wav");
        JFrame frame = new JFrame("mainForm");
        frame.setContentPane(new mainForm().getPnlMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

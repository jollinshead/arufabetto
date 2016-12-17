import javax.swing.*;

public class main {

    public static void main(String[] args)  {
        try {
            JCAudio.play("O.wav");
            JFrame frame = new JFrame("mainForm");
            frame.setContentPane(new mainForm().getPnlMain());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        catch (Exception ex) {}
    }
}

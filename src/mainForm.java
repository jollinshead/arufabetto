import javax.swing.*;

/**
 * Created by jholl on 11/12/2016.
 */
public class mainForm {
    private JPanel pnlMain;
    private arufabettoForm afAlphabet;

    public arufabettoForm getAfAlphabet() {
        return afAlphabet;
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }

    public mainForm() {
        JCLetterList.populateMasterList(this);
    }
}

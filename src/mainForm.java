import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jholl on 11/12/2016.
 */
public class mainForm {
    private JPanel pnlMain;
    private arufabettoForm afAlphabet;
    private JButton btnGenerateStringToClipboardK;
    private JButton btnGenerateStringToClipboardH;

    public arufabettoForm getAfAlphabet() {
        return afAlphabet;
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }

    public mainForm() {

        JCLetterList.populateMasterList(this);

        this.btnGenerateStringToClipboardK.addActionListener(e -> {
            storeLargeStringToClipboardK();
        });

        this.btnGenerateStringToClipboardH.addActionListener(e -> {
            storeLargeStringToClipboardH();
        });

    }

    private void storeLargeStringToClipboardH() {
        JCLetterList filteredList = JCLetterList.generateFilteredList();

        StringBuffer string = new StringBuffer();
        if(filteredList.size() > 0) {

            while (string.length() < 1000){
                string.append(filteredList.getLetterAt(ThreadLocalRandom.current().nextInt(0, filteredList.size())).getHiragana());
            }
        }

        StringSelection selection = new StringSelection(string.toString());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

    private void storeLargeStringToClipboardK() {
        JCLetterList filteredList = JCLetterList.generateFilteredList();

        StringBuffer string = new StringBuffer();
        if(filteredList.size() > 0) {

            while (string.length() < 1000){
                string.append(filteredList.getLetterAt(ThreadLocalRandom.current().nextInt(0, filteredList.size())).getKatakana());
            }
        }

        StringSelection selection = new StringSelection(string.toString());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}

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
    private JButton btnGenerateStringToClipboardR;

    private enum JELanguage { JDHira, JDKata, JDBoth }

    public arufabettoForm getAfAlphabet() {
        return afAlphabet;
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }

    public mainForm() {

        JCLetterList.populateMasterList(this);

        this.btnGenerateStringToClipboardK.addActionListener(e -> {
            storeLargeStringToClipboard(JELanguage.JDKata);
        });

        this.btnGenerateStringToClipboardH.addActionListener(e -> {
            storeLargeStringToClipboard(JELanguage.JDHira);
        });

        this.btnGenerateStringToClipboardR.addActionListener(e -> {
            storeLargeStringToClipboard(JELanguage.JDBoth);
        });

    }

    private void storeLargeStringToClipboard(JELanguage language) {
        JCLetterList filteredList = JCLetterList.generateFilteredList();
        final int numLetters = filteredList.size();

        StringBuffer[] string = { new StringBuffer(), new StringBuffer(), new StringBuffer() };
        if(numLetters > 0) {

            int i = 0;
            filteredList.shuffleLetters();

            while (string[0].length() < 300){

                if(i >= numLetters) {
                    i = 0;
                    filteredList.shuffleLetters();
                }
                switch(language)
                {
                    case JDKata:
                        string[0].append(filteredList.getLetterAt(i).getKatakana());
                        string[1].append(filteredList.getLetterAt(i).getHiragana());
                        break;

                    case JDHira:
                        string[0].append(filteredList.getLetterAt(i).getHiragana());
                        string[1].append(filteredList.getLetterAt(i).getKatakana());
                        break;

                    case JDBoth:
                    default:
                        int randint = ThreadLocalRandom.current().nextInt(0, 2);
                        if (randint > 0) {
                            string[0].append(filteredList.getLetterAt(i).getKatakana());
                            string[1].append(filteredList.getLetterAt(i).getHiragana());
                        } else {
                            string[0].append(filteredList.getLetterAt(i).getHiragana());
                            string[1].append(filteredList.getLetterAt(i).getKatakana());
                        }

                        break;
                }

                string[2].append(filteredList.getLetterAt(i).getEnglish() + " ");

                i++;
            }
        }

        StringSelection selection = new StringSelection(string[0].toString() + " " + string[1].toString() + " " + string[2].toString());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}

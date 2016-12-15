import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * Created by jholl on 12/12/2016.
 */
public class questionSetupForm {
    private JSlider sNumLetters;
    private JComboBox cbbLetterType;
    private JButton btnGenerate;
    private JPanel pnlMain;
    private JLabel lblNumLetters;
    private JComboBox cbbAnsLetterType;
    private JCheckBox cbHideQuestion;

    public questionSetupForm() {
        sNumLetters.addChangeListener(evt -> {
            JSlider slider = (JSlider) evt.getSource();
            if (!slider.getValueIsAdjusting())
                lblNumLetters.setText(Integer.toString(slider.getValue()));
        });

        btnGenerate.addActionListener(e -> {
            JCQuestion question = new JCQuestion(getLanguage(false), getLanguage(true), JCLetterList.generateFilteredList(), sNumLetters.getValue());

            JFrame frame = new JFrame("questionForm");
            frame.setContentPane(new questionForm(question, this.cbHideQuestion.isSelected()).getPnlMain());
            frame.pack();
            frame.setVisible(true);
        });

    }

    private JCQuestion.JEQuestionLanguage getLanguage(boolean isAnswer) {
        JComboBox ccBox = cbbLetterType;
        if(isAnswer)
            ccBox = cbbAnsLetterType;
        if(ccBox.getSelectedItem().toString() == "English")
            return JCQuestion.JEQuestionLanguage.JDEng;
        else if(ccBox.getSelectedItem().toString() == "Hiragana")
            return JCQuestion.JEQuestionLanguage.JDHira;
        else
            return JCQuestion.JEQuestionLanguage.JDKata;
    }



    private void createUIComponents() {
        String[] letterTypes = { "English", "Hiragana", "Katakana" };

        cbbLetterType = new JComboBox(letterTypes);
        cbbLetterType.setSelectedIndex(0);
        cbbAnsLetterType = new JComboBox(letterTypes);
        cbbAnsLetterType.setSelectedIndex(1);
    }
}

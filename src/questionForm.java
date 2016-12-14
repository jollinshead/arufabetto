import javax.swing.*;

/**
 * Created by jhollinshead on 12/13/16.
 */
public class questionForm {

    private JCQuestion question;

    private JPanel pnlMain;
    private JButton btnPlay;
    private JTextArea taText;
    private JCheckBox cbAnswer;
    private JTextArea taAnswerText;
    private JTextArea taAnswerText2;
    private JCheckBox cbbQuestion;

    public questionForm(JCQuestion question) {
        this.question = question;

        this.btnPlay.addActionListener(e -> question.playAudio());
        this.cbAnswer.addActionListener(e -> toggleAnswer() );
        this.cbbQuestion.addActionListener(e -> toggleQuestion() );

        JScrollPane pictureScrollPane = new JScrollPane(pnlMain);
        pictureScrollPane.setViewportView(pnlMain);
    }

    private void toggleAnswer () {
        if (!cbAnswer.isSelected()) {
            this.taAnswerText.setText("...");
            this.taAnswerText2.setText("...");
        } else {
            this.taAnswerText.setText(question.getAnswerText(false));
            this.taAnswerText2.setText(question.getAnswerText(true));
        }
    }

    private void toggleQuestion () {
        if (!cbbQuestion.isSelected()) {
            this.taText.setText("...");
        } else {
            this.taText.setText(question.getQuestionText());
        }
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }

    private void createUIComponents() {
        this.taText = new JTextArea();
        this.taText.setText(question.getQuestionText());

        this.taAnswerText = new JTextArea();
        this.taAnswerText.setText("...");

        this.taAnswerText2 = new JTextArea();
        this.taAnswerText2.setText("...");
    }

}

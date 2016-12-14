import java.util.concurrent.TimeUnit;

/**
 * Created by jhollinshead on 12/12/16.
 */
public class JCQuestion {

    private JEQuestionLanguage questionLanguage;
    private JEQuestionLanguage[] answerLanguage;
    private JCLetterList lettersToUse;

    enum JEQuestionLanguage { JDEng, JDKata, JDHira }

    public JCQuestion(JEQuestionLanguage questionLanguage, JEQuestionLanguage answerLanguage, JCLetterList lettersToUse, int maxNumLetters) {
        this.questionLanguage = questionLanguage;
        this.answerLanguage = new JEQuestionLanguage[2];
        this.answerLanguage[0] = answerLanguage;
        this.answerLanguage[1] = JEQuestionLanguage.JDEng;
        if(questionLanguage !=  JEQuestionLanguage.JDHira && answerLanguage != JEQuestionLanguage.JDHira)
            this.answerLanguage[1] = JEQuestionLanguage.JDHira;
        else if(questionLanguage !=  JEQuestionLanguage.JDKata && answerLanguage != JEQuestionLanguage.JDKata)
            this.answerLanguage[1] = JEQuestionLanguage.JDKata;

        this.lettersToUse = lettersToUse;
        this.lettersToUse.setNumLetters(maxNumLetters);

        lettersToUse.shuffleLetters();
    }

    public void playAudio() {
        lettersPlayAudio();
    }

    public String getQuestionText() {
        return lettersToText(questionLanguage);
    }

    public String getAnswerText(boolean isAlternate) {
        if(isAlternate)
            return lettersToText(answerLanguage[1]);
        else
            return lettersToText(answerLanguage[0]);
    }

    private void lettersPlayAudio(){
        for (int i = 0; i < lettersToUse.size(); i++) {
            lettersToUse.getLetterAt(i).playAudio();
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (Exception ex) {}
        }
    }

    private String lettersToText(JEQuestionLanguage lang) {
        StringBuffer outputText = new StringBuffer();

        switch(lang) {
            case JDHira:

                for (int i = 0; i < lettersToUse.size(); i++)
                    outputText.append(lettersToUse.getLetterAt(i).getHiragana() + "  ");
                break;

            case JDKata:

                for (int i = 0; i < lettersToUse.size(); i++)
                    outputText.append(lettersToUse.getLetterAt(i).getKatakana() + "  ");
                break;

            case JDEng:

                for (int i = 0; i < lettersToUse.size(); i++) {
                    if(lettersToUse.getLetterAt(i).getEnglish().length() == 2)
                        outputText.append(lettersToUse.getLetterAt(i).getEnglish() + "  ");
                    else
                        outputText.append(lettersToUse.getLetterAt(i).getEnglish() + "  ");
                }
                break;

        }

        return outputText.toString();
    }
}

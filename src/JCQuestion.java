/**
 * Created by jhollinshead on 12/12/16.
 */
public class JCQuestion {

    private JEQuestionLanguage questionLanguage;
    private JEQuestionLanguage answerLanguage;
    private JEQuestionType type;
    private JCLetterList lettersToUse;

    enum JEQuestionLanguage { JDEng, JDKata, JDHira }
    enum JEQuestionType { JDRead, JDWrite, JDListen, JDSpeak }

    public JCQuestion(JEQuestionLanguage questionLanguage, JEQuestionLanguage answerLanguage, JEQuestionType type, JCLetterList lettersToUse, int maxNumLetters) {
        this.questionLanguage = questionLanguage;
        this.answerLanguage = answerLanguage;
        this.type = type;
        this.lettersToUse = lettersToUse;


    }
}

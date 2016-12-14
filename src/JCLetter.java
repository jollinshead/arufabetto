import javax.swing.*;
import java.io.File;

/**
 * Created by jhollinshead on 12/12/16.
 */
public final class JCLetter {

    private final String english;
    private final String hiragana;
    private final String katakana;
    private final JCheckBox checkBox;
    private final String audioFileName;

    public JCLetter(String english, String hiragana, String katakana, JCheckBox checkBox, String audioFileName) {
        this.english = english;
        this.hiragana = hiragana;
        this.katakana = katakana;
        this.checkBox = checkBox;
        this.audioFileName = audioFileName;
    }

    public String getEnglish() {
        return english;
    }

    public String getHiragana() {
        return hiragana;
    }

    public String getKatakana() {
        return katakana;
    }

    public boolean isSelected() {
        return checkBox.isSelected();
    }

    public void playAudio() {
        JCAudio.play(this.audioFileName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JCLetter jcLetter = (JCLetter) o;

        return english.equals(jcLetter.english);

    }

    @Override
    public int hashCode() {
        return english.hashCode();
    }
}

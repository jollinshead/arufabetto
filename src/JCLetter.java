import javax.swing.*;
import java.io.File;

/**
 * Created by jhollinshead on 12/12/16.
 */
public final class JCLetter {

    private final String name;
    private final int hiraganaCode;
    private final JCheckBox checkBox;
    private final String audioFileName;

    public JCLetter(String name, int hiraganaCode, JCheckBox checkBox, String audioFileName) {
        this.name = name;
        this.hiraganaCode = hiraganaCode;
        this.checkBox = checkBox;
        this.audioFileName = audioFileName;
    }

    public String getName() {
        return name;
    }

    public int getHiragana() {
        return hiraganaCode;
    }

    public int getKatakana() {
        return hiraganaCode + 0x60;
    }

    public boolean isSelected() {
        return checkBox.isSelected();
    }

    public void playAudio() {
        JCAudio.play(new File(this.audioFileName));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JCLetter jcLetter = (JCLetter) o;

        return name.equals(jcLetter.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

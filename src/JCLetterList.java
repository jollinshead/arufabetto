
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by jhollinshead on 12/12/16.
 */
public class JCLetterList {

    private static final List<JCLetter> masterListOfLetters = new ArrayList<>();
    private List<JCLetter> listOfLetters = new ArrayList<>();

    public JCLetterList(List<JCLetter> listOfLetters) {
        this.listOfLetters.addAll(listOfLetters.stream().filter(JCLetter::isSelected).collect(Collectors.toList()));
    }

    public void setNumLetters(int number) {
        if (number <= 0)
            listOfLetters.clear();
        else {
            Random rand = new Random();
            while (listOfLetters.size() > number) {
                int n = rand.nextInt(listOfLetters.size());
                listOfLetters.remove(n);
            }
        }
    }

    public void shuffleLetters() {
        Collections.shuffle(listOfLetters);
    }

    public static JCLetterList generateFilteredList() {
        JCLetterList newList = new JCLetterList(masterListOfLetters);

        return newList;
    }

    public JCLetter getLetterAt (int index) {
        if(index < 0 || index > listOfLetters.size())
            return null;
        else
            return listOfLetters.get(index);
    }

    public int size() {
        return listOfLetters.size();
    }

    public static void populateMasterList(mainForm mainForm) {
        masterListOfLetters.add(new JCLetter( "A", "あ", "ア", mainForm.getAfAlphabet().getCbA(), "a.wav"));
        masterListOfLetters.add(new JCLetter( "I", "い", "イ", mainForm.getAfAlphabet().getCbI(), "i.wav"));
        masterListOfLetters.add(new JCLetter( "U", "う", "ウ", mainForm.getAfAlphabet().getCbU(), "u.wav"));
        masterListOfLetters.add(new JCLetter( "E", "え", "エ", mainForm.getAfAlphabet().getCbE(), "e.wav"));
        masterListOfLetters.add(new JCLetter( "O", "お", "オ", mainForm.getAfAlphabet().getCbO(), "o.wav"));
        masterListOfLetters.add(new JCLetter( "KA", "か", "カ", mainForm.getAfAlphabet().getCbKA(), "ka.wav"));
        masterListOfLetters.add(new JCLetter( "GA", "が", "ガ", mainForm.getAfAlphabet().getCbGA(), "ga.wav"));
        masterListOfLetters.add(new JCLetter( "KI", "き", "キ", mainForm.getAfAlphabet().getCbKI(), "ki.wav"));
        masterListOfLetters.add(new JCLetter( "GI", "ぎ", "ギ", mainForm.getAfAlphabet().getCbGI(), "gi.wav"));
        masterListOfLetters.add(new JCLetter( "KU", "く", "ク", mainForm.getAfAlphabet().getCbKU(), "ku.wav"));
        masterListOfLetters.add(new JCLetter( "GU", "ぐ", "グ", mainForm.getAfAlphabet().getCbGU(), "gu.wav"));
        masterListOfLetters.add(new JCLetter( "KE", "け", "ケ", mainForm.getAfAlphabet().getCbKE(), "ke.wav"));
        masterListOfLetters.add(new JCLetter( "GE", "げ", "ゲ", mainForm.getAfAlphabet().getCbGE(), "ge.wav"));
        masterListOfLetters.add(new JCLetter( "KO", "こ", "コ", mainForm.getAfAlphabet().getCbKO(), "ko.wav"));
        masterListOfLetters.add(new JCLetter( "GO", "ご", "ゴ", mainForm.getAfAlphabet().getCbGO(), "go.wav"));
        masterListOfLetters.add(new JCLetter( "SA", "さ", "サ", mainForm.getAfAlphabet().getCbSA(), "sa.wav"));
        masterListOfLetters.add(new JCLetter( "ZA", "ざ", "ザ", mainForm.getAfAlphabet().getCbZA(), "za.wav"));
        masterListOfLetters.add(new JCLetter( "SI", "し", "シ", mainForm.getAfAlphabet().getCbSI(), "si.wav"));
        masterListOfLetters.add(new JCLetter( "ZI", "じ", "ジ", mainForm.getAfAlphabet().getCbZI(), "zi.wav"));
        masterListOfLetters.add(new JCLetter( "SU", "す", "ス", mainForm.getAfAlphabet().getCbSU(), "su.wav"));
        masterListOfLetters.add(new JCLetter( "ZU", "ず", "ズ", mainForm.getAfAlphabet().getCbZU(), "zu.wav"));
        masterListOfLetters.add(new JCLetter( "SE", "せ", "セ", mainForm.getAfAlphabet().getCbSE(), "se.wav"));
        masterListOfLetters.add(new JCLetter( "ZE", "ぜ", "ゼ", mainForm.getAfAlphabet().getCbZE(), "ze.wav"));
        masterListOfLetters.add(new JCLetter( "SO", "そ", "ソ", mainForm.getAfAlphabet().getCbSO(), "so.wav"));
        masterListOfLetters.add(new JCLetter( "ZO", "ぞ", "ゾ", mainForm.getAfAlphabet().getCbZO(), "zo.wav"));
        masterListOfLetters.add(new JCLetter( "TA", "た", "タ", mainForm.getAfAlphabet().getCbTA(), "ta.wav"));
        masterListOfLetters.add(new JCLetter( "DA", "だ", "ダ", mainForm.getAfAlphabet().getCbDA(), "da.wav"));
        masterListOfLetters.add(new JCLetter( "TI", "ち", "チ", mainForm.getAfAlphabet().getCbTI(), "ti.wav"));
        masterListOfLetters.add(new JCLetter( "DI", "ぢ", "ヂ", mainForm.getAfAlphabet().getCbDI(), "di.wav"));
        masterListOfLetters.add(new JCLetter( "TU", "つ", "ツ", mainForm.getAfAlphabet().getCbTU(), "tu.wav"));
        masterListOfLetters.add(new JCLetter( "DU", "づ", "ヅ", mainForm.getAfAlphabet().getCbDU(), "du.wav"));
        masterListOfLetters.add(new JCLetter( "TE", "て", "テ", mainForm.getAfAlphabet().getCbTE(), "te.wav"));
        masterListOfLetters.add(new JCLetter( "DE", "で", "デ", mainForm.getAfAlphabet().getCbDE(), "de.wav"));
        masterListOfLetters.add(new JCLetter( "TO", "と", "ト", mainForm.getAfAlphabet().getCbTO(), "to.wav"));
        masterListOfLetters.add(new JCLetter( "DO", "ど", "ド", mainForm.getAfAlphabet().getCbDO(), "do.wav"));
        masterListOfLetters.add(new JCLetter( "NA", "な", "ナ", mainForm.getAfAlphabet().getCbNA(), "na.wav"));
        masterListOfLetters.add(new JCLetter( "NI", "に", "ニ", mainForm.getAfAlphabet().getCbNI(), "ni.wav"));
        masterListOfLetters.add(new JCLetter( "NU", "ぬ", "ヌ", mainForm.getAfAlphabet().getCbNU(), "nu.wav"));
        masterListOfLetters.add(new JCLetter( "NE", "ね", "ネ", mainForm.getAfAlphabet().getCbNE(), "ne.wav"));
        masterListOfLetters.add(new JCLetter( "NO", "の", "ノ", mainForm.getAfAlphabet().getCbNO(), "no.wav"));
        masterListOfLetters.add(new JCLetter( "HA", "は", "ハ", mainForm.getAfAlphabet().getCbHA(), "ha.wav"));
        masterListOfLetters.add(new JCLetter( "BA", "ば", "バ", mainForm.getAfAlphabet().getCbBA(), "ba.wav"));
        masterListOfLetters.add(new JCLetter( "PA", "ぱ", "パ", mainForm.getAfAlphabet().getCbPA(), "pa.wav"));
        masterListOfLetters.add(new JCLetter( "HI", "ひ", "ヒ", mainForm.getAfAlphabet().getCbHI(), "hi.wav"));
        masterListOfLetters.add(new JCLetter( "BI", "び", "ビ", mainForm.getAfAlphabet().getCbBI(), "bi.wav"));
        masterListOfLetters.add(new JCLetter( "PI", "ぴ", "ピ", mainForm.getAfAlphabet().getCbPI(), "pi.wav"));
        masterListOfLetters.add(new JCLetter( "HU", "ふ", "フ", mainForm.getAfAlphabet().getCbHU(), "hu.wav"));
        masterListOfLetters.add(new JCLetter( "BU", "ぶ", "ブ", mainForm.getAfAlphabet().getCbBU(), "bu.wav"));
        masterListOfLetters.add(new JCLetter( "PU", "ぷ", "プ", mainForm.getAfAlphabet().getCbPU(), "pu.wav"));
        masterListOfLetters.add(new JCLetter( "HE", "へ", "ヘ", mainForm.getAfAlphabet().getCbHE(), "he.wav"));
        masterListOfLetters.add(new JCLetter( "BE", "べ", "ベ", mainForm.getAfAlphabet().getCbBE(), "be.wav"));
        masterListOfLetters.add(new JCLetter( "PE", "ぺ", "ペ", mainForm.getAfAlphabet().getCbPE(), "pe.wav"));
        masterListOfLetters.add(new JCLetter( "HO", "ほ", "ホ", mainForm.getAfAlphabet().getCbHO(), "ho.wav"));
        masterListOfLetters.add(new JCLetter( "BO", "ぼ", "ボ", mainForm.getAfAlphabet().getCbBO(), "bo.wav"));
        masterListOfLetters.add(new JCLetter( "PO", "ぽ", "ポ", mainForm.getAfAlphabet().getCbPO(), "po.wav"));
        masterListOfLetters.add(new JCLetter( "MA", "ま", "マ", mainForm.getAfAlphabet().getCbMA(), "ma.wav"));
        masterListOfLetters.add(new JCLetter( "MI", "み", "ミ", mainForm.getAfAlphabet().getCbMI(), "mi.wav"));
        masterListOfLetters.add(new JCLetter( "MU", "む", "ム", mainForm.getAfAlphabet().getCbMU(), "mu.wav"));
        masterListOfLetters.add(new JCLetter( "ME", "め", "メ", mainForm.getAfAlphabet().getCbME(), "me.wav"));
        masterListOfLetters.add(new JCLetter( "MO", "も", "モ", mainForm.getAfAlphabet().getCbMO(), "mo.wav"));
        masterListOfLetters.add(new JCLetter( "YA", "や", "ヤ", mainForm.getAfAlphabet().getCbYA(), "ya.wav"));
        masterListOfLetters.add(new JCLetter( "YU", "ゆ", "ユ", mainForm.getAfAlphabet().getCbYU(), "yu.wav"));
        masterListOfLetters.add(new JCLetter( "YO", "よ", "ヨ", mainForm.getAfAlphabet().getCbYO(), "yo.wav"));
        masterListOfLetters.add(new JCLetter( "RA", "ら", "ラ", mainForm.getAfAlphabet().getCbRA(), "ra.wav"));
        masterListOfLetters.add(new JCLetter( "RI", "り", "リ", mainForm.getAfAlphabet().getCbRI(), "ri.wav"));
        masterListOfLetters.add(new JCLetter( "RU", "る", "ル", mainForm.getAfAlphabet().getCbRU(), "ru.wav"));
        masterListOfLetters.add(new JCLetter( "RE", "れ", "レ", mainForm.getAfAlphabet().getCbRE(), "re.wav"));
        masterListOfLetters.add(new JCLetter( "RO", "ろ", "ロ", mainForm.getAfAlphabet().getCbRO(), "ro.wav"));
        masterListOfLetters.add(new JCLetter( "WA", "わ", "ワ", mainForm.getAfAlphabet().getCbWA(), "wa.wav"));
        masterListOfLetters.add(new JCLetter( "WI", "ゐ", "ヰ", mainForm.getAfAlphabet().getCbWI(), "wi.wav"));
        masterListOfLetters.add(new JCLetter( "WE", "ゑ", "ヱ", mainForm.getAfAlphabet().getCbWE(), "we.wav"));
        masterListOfLetters.add(new JCLetter( "WO", "を", "ヲ", mainForm.getAfAlphabet().getCbWO(), "wo.wav"));
        masterListOfLetters.add(new JCLetter( "N", "ん", "ン", mainForm.getAfAlphabet().getCbN(), "n.wav"));
        //masterListOfLetters.add(new JCLetter( "VU", "ゔ", "ヴ", mainForm.getAfAlphabet().getCbVU(), "vu.wav"));
    }



}

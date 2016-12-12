import gui.mainForm;

import java.util.ArrayList;
import java.util.HashSet;
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

    public static JCLetterList getFilteredList() {
        JCLetterList newList = new JCLetterList(masterListOfLetters);

        return newList;
    }

    public static void populateMasterList(mainForm mainForm) {
        masterListOfLetters.add(new JCLetter( "A", 0x3042, mainForm.getAfAlphabet().getCbA(), "a.wav"));
        masterListOfLetters.add(new JCLetter( "I", 0x3044, mainForm.getAfAlphabet().getCbI(), "i.wav"));
        masterListOfLetters.add(new JCLetter( "U", 0x3046, mainForm.getAfAlphabet().getCbU(), "u.wav"));
        masterListOfLetters.add(new JCLetter( "E", 0x3048, mainForm.getAfAlphabet().getCbE(), "e.wav"));
        masterListOfLetters.add(new JCLetter( "O", 0x304A, mainForm.getAfAlphabet().getCbO(), "o.wav"));
        masterListOfLetters.add(new JCLetter( "KA", 0x304B, mainForm.getAfAlphabet().getCbKA(), "ka.wav"));
        masterListOfLetters.add(new JCLetter( "GA", 0x304C, mainForm.getAfAlphabet().getCbGA(), "ga.wav"));
        masterListOfLetters.add(new JCLetter( "KI", 0x304D, mainForm.getAfAlphabet().getCbKI(), "ki.wav"));
        masterListOfLetters.add(new JCLetter( "GI", 0x304E, mainForm.getAfAlphabet().getCbGI(), "gi.wav"));
        masterListOfLetters.add(new JCLetter( "KU", 0x304F, mainForm.getAfAlphabet().getCbKU(), "ku.wav"));
        masterListOfLetters.add(new JCLetter( "GU", 0x3050, mainForm.getAfAlphabet().getCbGU(), "gu.wav"));
        masterListOfLetters.add(new JCLetter( "KE", 0x3051, mainForm.getAfAlphabet().getCbKE(), "ke.wav"));
        masterListOfLetters.add(new JCLetter( "GE", 0x3052, mainForm.getAfAlphabet().getCbGE(), "ge.wav"));
        masterListOfLetters.add(new JCLetter( "KO", 0x3053, mainForm.getAfAlphabet().getCbKO(), "ko.wav"));
        masterListOfLetters.add(new JCLetter( "GO", 0x3054, mainForm.getAfAlphabet().getCbGO(), "go.wav"));
        masterListOfLetters.add(new JCLetter( "SA", 0x3055, mainForm.getAfAlphabet().getCbSA(), "sa.wav"));
        masterListOfLetters.add(new JCLetter( "ZA", 0x3056, mainForm.getAfAlphabet().getCbZA(), "za.wav"));
        masterListOfLetters.add(new JCLetter( "SI", 0x3057, mainForm.getAfAlphabet().getCbSI(), "si.wav"));
        masterListOfLetters.add(new JCLetter( "ZI", 0x3058, mainForm.getAfAlphabet().getCbZI(), "zi.wav"));
        masterListOfLetters.add(new JCLetter( "SU", 0x3059, mainForm.getAfAlphabet().getCbSU(), "su.wav"));
        masterListOfLetters.add(new JCLetter( "ZU", 0x305A, mainForm.getAfAlphabet().getCbZU(), "zu.wav"));
        masterListOfLetters.add(new JCLetter( "SE", 0x305B, mainForm.getAfAlphabet().getCbSE(), "se.wav"));
        masterListOfLetters.add(new JCLetter( "ZE", 0x305C, mainForm.getAfAlphabet().getCbZE(), "ze.wav"));
        masterListOfLetters.add(new JCLetter( "SO", 0x305D, mainForm.getAfAlphabet().getCbSO(), "so.wav"));
        masterListOfLetters.add(new JCLetter( "ZO", 0x305E, mainForm.getAfAlphabet().getCbZO(), "zo.wav"));
        masterListOfLetters.add(new JCLetter( "TA", 0x305F, mainForm.getAfAlphabet().getCbTA(), "ta.wav"));
        masterListOfLetters.add(new JCLetter( "DA", 0x3060, mainForm.getAfAlphabet().getCbDA(), "da.wav"));
        masterListOfLetters.add(new JCLetter( "TI", 0x3061, mainForm.getAfAlphabet().getCbTI(), "ti.wav"));
        masterListOfLetters.add(new JCLetter( "DI", 0x3062, mainForm.getAfAlphabet().getCbDI(), "di.wav"));
        masterListOfLetters.add(new JCLetter( "TU", 0x3064, mainForm.getAfAlphabet().getCbTU(), "tu.wav"));
        masterListOfLetters.add(new JCLetter( "DU", 0x3065, mainForm.getAfAlphabet().getCbDU(), "du.wav"));
        masterListOfLetters.add(new JCLetter( "TE", 0x3066, mainForm.getAfAlphabet().getCbTE(), "te.wav"));
        masterListOfLetters.add(new JCLetter( "DE", 0x3067, mainForm.getAfAlphabet().getCbDE(), "de.wav"));
        masterListOfLetters.add(new JCLetter( "TO", 0x3068, mainForm.getAfAlphabet().getCbTO(), "to.wav"));
        masterListOfLetters.add(new JCLetter( "DO", 0x3069, mainForm.getAfAlphabet().getCbDO(), "do.wav"));
        masterListOfLetters.add(new JCLetter( "NA", 0x306A, mainForm.getAfAlphabet().getCbNA(), "na.wav"));
        masterListOfLetters.add(new JCLetter( "NI", 0x306B, mainForm.getAfAlphabet().getCbNI(), "ni.wav"));
        masterListOfLetters.add(new JCLetter( "NU", 0x306C, mainForm.getAfAlphabet().getCbNU(), "nu.wav"));
        masterListOfLetters.add(new JCLetter( "NE", 0x306D, mainForm.getAfAlphabet().getCbNE(), "ne.wav"));
        masterListOfLetters.add(new JCLetter( "NO", 0x306E, mainForm.getAfAlphabet().getCbNO(), "no.wav"));
        masterListOfLetters.add(new JCLetter( "HA", 0x306F, mainForm.getAfAlphabet().getCbHA(), "ha.wav"));
        masterListOfLetters.add(new JCLetter( "BA", 0x3070, mainForm.getAfAlphabet().getCbBA(), "ba.wav"));
        masterListOfLetters.add(new JCLetter( "PA", 0x3071, mainForm.getAfAlphabet().getCbPA(), "pa.wav"));
        masterListOfLetters.add(new JCLetter( "HI", 0x3072, mainForm.getAfAlphabet().getCbHI(), "hi.wav"));
        masterListOfLetters.add(new JCLetter( "BI", 0x3073, mainForm.getAfAlphabet().getCbBI(), "bi.wav"));
        masterListOfLetters.add(new JCLetter( "PI", 0x3074, mainForm.getAfAlphabet().getCbPI(), "pi.wav"));
        masterListOfLetters.add(new JCLetter( "HU", 0x3075, mainForm.getAfAlphabet().getCbHU(), "hu.wav"));
        masterListOfLetters.add(new JCLetter( "BU", 0x3076, mainForm.getAfAlphabet().getCbBU(), "bu.wav"));
        masterListOfLetters.add(new JCLetter( "PU", 0x3077, mainForm.getAfAlphabet().getCbPU(), "pu.wav"));
        masterListOfLetters.add(new JCLetter( "HE", 0x3078, mainForm.getAfAlphabet().getCbHE(), "he.wav"));
        masterListOfLetters.add(new JCLetter( "BE", 0x3079, mainForm.getAfAlphabet().getCbBE(), "be.wav"));
        masterListOfLetters.add(new JCLetter( "PE", 0x307A, mainForm.getAfAlphabet().getCbPE(), "pe.wav"));
        masterListOfLetters.add(new JCLetter( "HO", 0x307B, mainForm.getAfAlphabet().getCbHO(), "ho.wav"));
        masterListOfLetters.add(new JCLetter( "BO", 0x307C, mainForm.getAfAlphabet().getCbBO(), "bo.wav"));
        masterListOfLetters.add(new JCLetter( "PO", 0x307D, mainForm.getAfAlphabet().getCbPO(), "po.wav"));
        masterListOfLetters.add(new JCLetter( "MA", 0x307E, mainForm.getAfAlphabet().getCbMA(), "ma.wav"));
        masterListOfLetters.add(new JCLetter( "MI", 0x307F, mainForm.getAfAlphabet().getCbMI(), "mi.wav"));
        masterListOfLetters.add(new JCLetter( "MU", 0x3080, mainForm.getAfAlphabet().getCbMU(), "mu.wav"));
        masterListOfLetters.add(new JCLetter( "ME", 0x3081, mainForm.getAfAlphabet().getCbME(), "me.wav"));
        masterListOfLetters.add(new JCLetter( "MO", 0x3082, mainForm.getAfAlphabet().getCbMO(), "mo.wav"));
        masterListOfLetters.add(new JCLetter( "YA", 0x3084, mainForm.getAfAlphabet().getCbYA(), "ya.wav"));
        masterListOfLetters.add(new JCLetter( "YU", 0x3086, mainForm.getAfAlphabet().getCbYU(), "yu.wav"));
        masterListOfLetters.add(new JCLetter( "YO", 0x3088, mainForm.getAfAlphabet().getCbYO(), "yo.wav"));
        masterListOfLetters.add(new JCLetter( "RA", 0x3089, mainForm.getAfAlphabet().getCbRA(), "ra.wav"));
        masterListOfLetters.add(new JCLetter( "RI", 0x308A, mainForm.getAfAlphabet().getCbRI(), "ri.wav"));
        masterListOfLetters.add(new JCLetter( "RU", 0x308B, mainForm.getAfAlphabet().getCbRU(), "ru.wav"));
        masterListOfLetters.add(new JCLetter( "RE", 0x308C, mainForm.getAfAlphabet().getCbRE(), "re.wav"));
        masterListOfLetters.add(new JCLetter( "RO", 0x308D, mainForm.getAfAlphabet().getCbRO(), "ro.wav"));
        masterListOfLetters.add(new JCLetter( "WA", 0x308F, mainForm.getAfAlphabet().getCbWA(), "wa.wav"));
        masterListOfLetters.add(new JCLetter( "WI", 0x3090, mainForm.getAfAlphabet().getCbWI(), "wi.wav"));
        masterListOfLetters.add(new JCLetter( "WE", 0x3091, mainForm.getAfAlphabet().getCbWE(), "we.wav"));
        masterListOfLetters.add(new JCLetter( "WO", 0x3092, mainForm.getAfAlphabet().getCbWO(), "wo.wav"));
        masterListOfLetters.add(new JCLetter( "N", 0x3093, mainForm.getAfAlphabet().getCbN(), "n.wav"));
       // masterListOfLetters.add(new JCLetter( "VU", 0x3094, mainForm.getAfAlphabet().getCbVU(), "vu.wav"));
    }



}

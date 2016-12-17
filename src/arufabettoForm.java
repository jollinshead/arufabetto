import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by jholl on 11/12/2016.
 */
public class arufabettoForm {


    public arufabettoForm() {

        btnSave.addActionListener(e -> {
            boolean[] ticks = new boolean[74];
            ticks[0] = cbMA.isSelected();
            ticks[1] = cbN.isSelected();
            ticks[2] = cbWA.isSelected();
            ticks[3] = cbRA.isSelected();
            ticks[4] = cbYA.isSelected();
            ticks[5] = cbHA.isSelected();
            ticks[6] = cbNA.isSelected();
            ticks[7] = cbTA.isSelected();
            ticks[8] = cbSA.isSelected();
            ticks[9] = cbKA.isSelected();
            ticks[10] = cbA.isSelected();
            ticks[11] = cbWI.isSelected();
            ticks[12] = cbRI.isSelected();
            ticks[13] = cbMI.isSelected();
            ticks[14] = cbHI.isSelected();
            ticks[15] = cbNI.isSelected();
            ticks[16] = cbTI.isSelected();
            ticks[17] = cbSI.isSelected();
            ticks[18] = cbKI.isSelected();
            ticks[19] = cbI.isSelected();
            ticks[20] = cbRU.isSelected();
            ticks[21] = cbYU.isSelected();
            ticks[22] = cbMU.isSelected();
            ticks[23] = cbHU.isSelected();
            ticks[24] = cbNU.isSelected();
            ticks[25] = cbTU.isSelected();
            ticks[26] = cbSU.isSelected();
            ticks[27] = cbKU.isSelected();
            ticks[28] = cbU.isSelected();
            ticks[29] = cbWE.isSelected();
            ticks[30] = cbRE.isSelected();
            ticks[31] = cbME.isSelected();
            ticks[32] = cbHE.isSelected();
            ticks[33] = cbNE.isSelected();
            ticks[34] = cbTE.isSelected();
            ticks[35] = cbSE.isSelected();
            ticks[36] = cbKE.isSelected();
            ticks[37] = cbE.isSelected();
            ticks[38] = cbWO.isSelected();
            ticks[39] = cbRO.isSelected();
            ticks[40] = cbYO.isSelected();
            ticks[41] = cbMO.isSelected();
            ticks[42] = cbHO.isSelected();
            ticks[43] = cbNO.isSelected();
            ticks[44] = cbTO.isSelected();
            ticks[45] = cbSO.isSelected();
            ticks[46] = cbKO.isSelected();
            ticks[47] = cbO.isSelected();
            ticks[48] = cbGA.isSelected();
            ticks[49] = cbZA.isSelected();
            ticks[50] = cbBA.isSelected();
            ticks[51] = cbDA.isSelected();
            ticks[52] = cbPA.isSelected();
            ticks[53] = cbGI.isSelected();
            ticks[54] = cbZI.isSelected();
            ticks[55] = cbBI.isSelected();
            ticks[56] = cbDI.isSelected();
            ticks[57] = cbPI.isSelected();
            ticks[58] = cbGU.isSelected();
            ticks[59] = cbZU.isSelected();
            ticks[60] = cbBU.isSelected();
            ticks[61] = cbDU.isSelected();
            ticks[62] = cbPU.isSelected();
            ticks[63] = cbGE.isSelected();
            ticks[64] = cbZE.isSelected();
            ticks[65] = cbBE.isSelected();
            ticks[66] = cbDE.isSelected();
            ticks[67] = cbPE.isSelected();
            ticks[68] = cbGO.isSelected();
            ticks[69] = cbZO.isSelected();
            ticks[70] = cbBO.isSelected();
            ticks[71] = cbDO.isSelected();
            ticks[72] = cbPO.isSelected();
            ticks[73] = cbVU.isSelected();

            try {
                FileOutputStream stream = new FileOutputStream(new File("config.dat"));

                for (boolean item : ticks) {
                    stream.write(item ? 1 : 0);
                }
                stream.close();
            }
            catch (Exception ex) {
                System.out.printf("Error: Could not save 'config.dat'");
            }

        });

        btnLoad.addActionListener(e -> {
            try {
                File file = new File("config.dat");
                FileInputStream inputStream = new FileInputStream(file);

                int fileLength = (int) file.length();
                if (fileLength != 74)
                    throw new Exception();

                byte[] data = new byte[fileLength];
                boolean[] ticks = new boolean[74];

                inputStream.read(data);
                for (int X = 0; X < data.length; X++) {
                    if (data[X] != 0) {
                        ticks[X] = true;
                        continue;
                    }
                    ticks[X] = false;
                }
                cbMA.setSelected(ticks[0]);
                cbN.setSelected(ticks[1]);
                cbWA.setSelected(ticks[2]);
                cbRA.setSelected(ticks[3]);
                cbYA.setSelected(ticks[4]);
                cbHA.setSelected(ticks[5]);
                cbNA.setSelected(ticks[6]);
                cbTA.setSelected(ticks[7]);
                cbSA.setSelected(ticks[8]);
                cbKA.setSelected(ticks[9]);
                cbA.setSelected(ticks[10]);
                cbWI.setSelected(ticks[11]);
                cbRI.setSelected(ticks[12]);
                cbMI.setSelected(ticks[13]);
                cbHI.setSelected(ticks[14]);
                cbNI.setSelected(ticks[15]);
                cbTI.setSelected(ticks[16]);
                cbSI.setSelected(ticks[17]);
                cbKI.setSelected(ticks[18]);
                cbI.setSelected(ticks[19]);
                cbRU.setSelected(ticks[20]);
                cbYU.setSelected(ticks[21]);
                cbMU.setSelected(ticks[22]);
                cbHU.setSelected(ticks[23]);
                cbNU.setSelected(ticks[24]);
                cbTU.setSelected(ticks[25]);
                cbSU.setSelected(ticks[26]);
                cbKU.setSelected(ticks[27]);
                cbU.setSelected(ticks[28]);
                cbWE.setSelected(ticks[29]);
                cbRE.setSelected(ticks[30]);
                cbME.setSelected(ticks[31]);
                cbHE.setSelected(ticks[32]);
                cbNE.setSelected(ticks[33]);
                cbTE.setSelected(ticks[34]);
                cbSE.setSelected(ticks[35]);
                cbKE.setSelected(ticks[36]);
                cbE.setSelected(ticks[37]);
                cbWO.setSelected(ticks[38]);
                cbRO.setSelected(ticks[39]);
                cbYO.setSelected(ticks[40]);
                cbMO.setSelected(ticks[41]);
                cbHO.setSelected(ticks[42]);
                cbNO.setSelected(ticks[43]);
                cbTO.setSelected(ticks[44]);
                cbSO.setSelected(ticks[45]);
                cbKO.setSelected(ticks[46]);
                cbO.setSelected(ticks[47]);
                cbGA.setSelected(ticks[48]);
                cbZA.setSelected(ticks[49]);
                cbBA.setSelected(ticks[50]);
                cbDA.setSelected(ticks[51]);
                cbPA.setSelected(ticks[52]);
                cbGI.setSelected(ticks[53]);
                cbZI.setSelected(ticks[54]);
                cbBI.setSelected(ticks[55]);
                cbDI.setSelected(ticks[56]);
                cbPI.setSelected(ticks[57]);
                cbGU.setSelected(ticks[58]);
                cbZU.setSelected(ticks[59]);
                cbBU.setSelected(ticks[60]);
                cbDU.setSelected(ticks[61]);
                cbPU.setSelected(ticks[62]);
                cbGE.setSelected(ticks[63]);
                cbZE.setSelected(ticks[64]);
                cbBE.setSelected(ticks[65]);
                cbDE.setSelected(ticks[66]);
                cbPE.setSelected(ticks[67]);
                cbGO.setSelected(ticks[68]);
                cbZO.setSelected(ticks[69]);
                cbBO.setSelected(ticks[70]);
                cbDO.setSelected(ticks[71]);
                cbPO.setSelected(ticks[72]);
                cbVU.setSelected(ticks[73]);

            }
            catch (Exception ex) {
                System.out.printf("Error: Could not load 'config.dat'");
            }
        });
    }

    private JPanel pnlMain;
    private JCheckBox cbMA;
    private JCheckBox cbN;
    private JCheckBox cbWA;
    private JCheckBox cbRA;
    private JCheckBox cbYA;
    private JCheckBox cbHA;
    private JCheckBox cbNA;
    private JCheckBox cbTA;
    private JCheckBox cbSA;
    private JCheckBox cbKA;
    private JCheckBox cbA;
    private JCheckBox cbWI;
    private JCheckBox cbRI;
    private JCheckBox cbMI;
    private JCheckBox cbHI;
    private JCheckBox cbNI;
    private JCheckBox cbTI;
    private JCheckBox cbSI;
    private JCheckBox cbKI;
    private JCheckBox cbI;
    private JCheckBox cbRU;
    private JCheckBox cbYU;
    private JCheckBox cbMU;
    private JCheckBox cbHU;
    private JCheckBox cbNU;
    private JCheckBox cbTU;
    private JCheckBox cbSU;
    private JCheckBox cbKU;
    private JCheckBox cbU;
    private JCheckBox cbWE;
    private JCheckBox cbRE;
    private JCheckBox cbME;
    private JCheckBox cbHE;
    private JCheckBox cbNE;
    private JCheckBox cbTE;
    private JCheckBox cbSE;
    private JCheckBox cbKE;
    private JCheckBox cbE;
    private JCheckBox cbWO;
    private JCheckBox cbRO;
    private JCheckBox cbYO;
    private JCheckBox cbMO;
    private JCheckBox cbHO;
    private JCheckBox cbNO;
    private JCheckBox cbTO;
    private JCheckBox cbSO;
    private JCheckBox cbKO;
    private JCheckBox cbO;
    private JCheckBox cbGA;
    private JCheckBox cbZA;
    private JCheckBox cbBA;
    private JCheckBox cbDA;
    private JCheckBox cbPA;
    private JCheckBox cbGI;
    private JCheckBox cbZI;
    private JCheckBox cbBI;
    private JCheckBox cbDI;
    private JCheckBox cbPI;
    private JCheckBox cbGU;
    private JCheckBox cbZU;
    private JCheckBox cbBU;
    private JCheckBox cbDU;
    private JCheckBox cbPU;
    private JCheckBox cbGE;
    private JCheckBox cbZE;
    private JCheckBox cbBE;
    private JCheckBox cbDE;
    private JCheckBox cbPE;
    private JCheckBox cbGO;
    private JCheckBox cbZO;
    private JCheckBox cbBO;
    private JCheckBox cbDO;
    private JCheckBox cbPO;
    private JButton btnSave;
    private JButton btnLoad;
    private JCheckBox cbVU;

    public JCheckBox getCbMA() {
        return cbMA;
    }

    public JCheckBox getCbN() {
        return cbN;
    }

    public JCheckBox getCbWA() {
        return cbWA;
    }

    public JCheckBox getCbRA() {
        return cbRA;
    }

    public JCheckBox getCbYA() {
        return cbYA;
    }

    public JCheckBox getCbHA() {
        return cbHA;
    }

    public JCheckBox getCbNA() {
        return cbNA;
    }

    public JCheckBox getCbTA() {
        return cbTA;
    }

    public JCheckBox getCbSA() {
        return cbSA;
    }

    public JCheckBox getCbKA() {
        return cbKA;
    }

    public JCheckBox getCbA() {
        return cbA;
    }

    public JCheckBox getCbWI() {
        return cbWI;
    }

    public JCheckBox getCbRI() {
        return cbRI;
    }

    public JCheckBox getCbMI() {
        return cbMI;
    }

    public JCheckBox getCbHI() {
        return cbHI;
    }

    public JCheckBox getCbNI() {
        return cbNI;
    }

    public JCheckBox getCbTI() {
        return cbTI;
    }

    public JCheckBox getCbSI() {
        return cbSI;
    }

    public JCheckBox getCbKI() {
        return cbKI;
    }

    public JCheckBox getCbI() {
        return cbI;
    }

    public JCheckBox getCbRU() {
        return cbRU;
    }

    public JCheckBox getCbYU() {
        return cbYU;
    }

    public JCheckBox getCbMU() {
        return cbMU;
    }

    public JCheckBox getCbHU() {
        return cbHU;
    }

    public JCheckBox getCbNU() {
        return cbNU;
    }

    public JCheckBox getCbTU() {
        return cbTU;
    }

    public JCheckBox getCbSU() {
        return cbSU;
    }

    public JCheckBox getCbKU() {
        return cbKU;
    }

    public JCheckBox getCbU() {
        return cbU;
    }

    public JCheckBox getCbWE() {
        return cbWE;
    }

    public JCheckBox getCbRE() {
        return cbRE;
    }

    public JCheckBox getCbME() {
        return cbME;
    }

    public JCheckBox getCbHE() {
        return cbHE;
    }

    public JCheckBox getCbNE() {
        return cbNE;
    }

    public JCheckBox getCbTE() {
        return cbTE;
    }

    public JCheckBox getCbSE() {
        return cbSE;
    }

    public JCheckBox getCbKE() {
        return cbKE;
    }

    public JCheckBox getCbE() {
        return cbE;
    }

    public JCheckBox getCbWO() {
        return cbWO;
    }

    public JCheckBox getCbRO() {
        return cbRO;
    }

    public JCheckBox getCbYO() {
        return cbYO;
    }

    public JCheckBox getCbMO() {
        return cbMO;
    }

    public JCheckBox getCbHO() {
        return cbHO;
    }

    public JCheckBox getCbNO() {
        return cbNO;
    }

    public JCheckBox getCbTO() {
        return cbTO;
    }

    public JCheckBox getCbSO() {
        return cbSO;
    }

    public JCheckBox getCbKO() {
        return cbKO;
    }

    public JCheckBox getCbO() {
        return cbO;
    }

    public JCheckBox getCbGA() {
        return cbGA;
    }

    public JCheckBox getCbZA() {
        return cbZA;
    }

    public JCheckBox getCbBA() {
        return cbBA;
    }

    public JCheckBox getCbDA() {
        return cbDA;
    }

    public JCheckBox getCbPA() {
        return cbPA;
    }

    public JCheckBox getCbGI() {
        return cbGI;
    }

    public JCheckBox getCbZI() {
        return cbZI;
    }

    public JCheckBox getCbBI() {
        return cbBI;
    }

    public JCheckBox getCbDI() {
        return cbDI;
    }

    public JCheckBox getCbPI() {
        return cbPI;
    }

    public JCheckBox getCbGU() {
        return cbGU;
    }

    public JCheckBox getCbZU() {
        return cbZU;
    }

    public JCheckBox getCbBU() {
        return cbBU;
    }

    public JCheckBox getCbDU() {
        return cbDU;
    }

    public JCheckBox getCbPU() {
        return cbPU;
    }

    public JCheckBox getCbGE() {
        return cbGE;
    }

    public JCheckBox getCbZE() {
        return cbZE;
    }

    public JCheckBox getCbBE() {
        return cbBE;
    }

    public JCheckBox getCbDE() {
        return cbDE;
    }

    public JCheckBox getCbPE() {
        return cbPE;
    }

    public JCheckBox getCbGO() {
        return cbGO;
    }

    public JCheckBox getCbZO() {
        return cbZO;
    }

    public JCheckBox getCbBO() {
        return cbBO;
    }

    public JCheckBox getCbDO() {
        return cbDO;
    }

    public JCheckBox getCbPO() {
        return cbPO;
    }

    public JCheckBox getCbVU() {
        return cbVU;
    }
}

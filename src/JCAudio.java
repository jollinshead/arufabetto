import java.io.File;
import javax.sound.sampled.*;

/**
 * Created by jhollinshead on 12/12/16.
 */
public class JCAudio {

    public static void play(File file)
    {
        if(!file.exists()) {
            System.out.printf("Error: '%s' does not exist.", file.getAbsolutePath());
        }
        else {
            try {
                final Clip clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));

                clip.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP)
                        clip.close();
                });

                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
            } catch (Exception exc) {
                exc.printStackTrace(System.out);
            }
        }
    }
}

import java.io.File;
import java.net.URL;
import javax.sound.sampled.*;

/**
 * Created by jhollinshead on 12/12/16.
 */
public class JCAudio {

    public static void play(String fileName)
    {
        URL path = ClassLoader.getSystemResource("wav/" + fileName);
        if(path==null) {
            System.out.printf("Error: '%s' does not exist.", fileName);
            return;
        }
        else {
            try {
                File file = new File(path.toURI());
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

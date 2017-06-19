
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;



public class PringFileRunner {

    public static void main(String[] args)  {

        try {
            Files.delete(Paths.get(""));
        } catch (IOException ex) {
            Logger.getLogger(PringFileRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

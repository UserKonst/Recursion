
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFilesNio {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        
        Path file = Paths.get("./t.txt");
        byte[] bytes = Files.readAllBytes(file);
        Files.write(Paths.get("./tt.txt"), bytes);

        System.out.println("time: "  + (System.currentTimeMillis() - start));
        
    }

}

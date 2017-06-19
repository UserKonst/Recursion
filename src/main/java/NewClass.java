
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;
import net.java.truevfs.access.TFile;

public class NewClass {

    public static void main(String[] args) throws IOException {

        TFile entry = new TFile("./inputsv2.zip/inputs/data1.txt");

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(entry.toPath())) {

            stream.forEach(s -> System.out.println(s));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // byte[] bytes = Files.lreadAllBytes(entry.toPath());
//        String s = new String(bytes).replace("a", "***");
//
//        try (TFileWriter writer = new TFileWriter(entry)) {
//            writer.write(s);
//        } catch (Exception e) {
//        }
    }
}

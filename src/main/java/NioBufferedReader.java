
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NioBufferedReader {

    private static final String file1 = "./t.txt";
    private static final String file2 = "./tt.txt";

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(file1)))) {
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file2)))) {

                int line;
                while ((line = input.read()) != -1) {
                    out.write(line);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("time: " + (System.currentTimeMillis() - start));
    }

}


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BuffInput {

    private static final String file1 = "ывдаодылоадлоывдлаыдаовдо";
    private static final String file2 = "./tt.txt";

    public static void main(String[] args) {
        int cnt = 0;
        long start = System.currentTimeMillis();

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(file1)))) {
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file2)))) {

                int bytes;
                while ((bytes = input.read()) != -1) {                    
                    out.write(bytes);
                    cnt++;
                }
                
                out.flush();
            } catch (Exception e) {
            }

        } catch (Exception e) {
        }

        System.out.println("writes: " + cnt);
        System.out.println("time: " + (System.currentTimeMillis() - start));

    }
}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWork {

    public static void main(String[] args) {
        int cnt = 0;
        long start = System.currentTimeMillis();

        try (BufferedReader reader = new BufferedReader(new FileReader("./t.txt"))) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("./tt.txt"))) {

                String l;
                while ((l = reader.readLine()) != null) {
                    writer.println(l);
                cnt++;
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }

        System.out.println("writes: " + cnt);
        System.out.println("time: " + (System.currentTimeMillis() - start));
    }

}

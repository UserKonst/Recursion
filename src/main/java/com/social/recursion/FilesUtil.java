package com.social.recursion;

import com.social.mappers.RegexUtil;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import net.java.truevfs.access.TFile;
import net.java.truevfs.access.TFileWriter;

public class FilesUtil {

    
    public static void printContent(File file) {
        try (Stream<String> stream = Files.lines(file.toPath())) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getPhones(File file) throws IOException {

        TFile entry = new TFile(file.getPath());
        List<String> lines = Files.readAllLines(entry.toPath());
        List<String> phones = new ArrayList();

        for (String line : lines) {
            String phone = RegexUtil.find("^(.*?)[^\\s]+@", line.trim(), 1);
            phones.add(phone);
            writeLine(entry, line);
        }

        return phones;
    }

    private static void writeLine(TFile file, String s) {
        try (TFileWriter writer = new TFileWriter(file)) {
            writer.write(s);
        } catch (Exception e) {
        }
    }

    static void changePhoneCodes(PhoneMapper phoneMapper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Collection<? extends String> getEmails(File txtFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

package com.social.recursion;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import net.java.truevfs.access.TFile;
import net.java.truevfs.access.TFileWriter;

public class FileReaderRunner {

    private static final String INPUT_ARCHIVE_PATH = "./inputs.zip";
    private static final String ARCHIVE_COPY_PATH = "./inputsv2.zip";

    public static void main(String[] args) throws IOException {

        VFS vfs = new TrueVFSImpl();
        vfs.copyFile(Paths.get(INPUT_ARCHIVE_PATH), Paths.get(ARCHIVE_COPY_PATH));

        List<TFile> txtFiles = new ArrayList();

        Iterator<TFile> iterator = vfs.getIterator(ARCHIVE_COPY_PATH);
        while (iterator.hasNext()) {
            TFile file = iterator.next();
            if (file.getName().endsWith(".txt")) {
                txtFiles.add(file);
            }
        }

        List<String> phones = new ArrayList();
        List<String> emails = new ArrayList();

        for (File txtFile : txtFiles) {
            FilesUtil.changePhoneCodes(new PhoneMapper());
            phones.addAll(FilesUtil.getPhones(txtFile));
            emails.addAll(FilesUtil.getEmails(txtFile));
        }

        //
        List<String> newPhones = phones.stream()
                .map(phone -> phone.replaceAll("\\s+", ""))
                .distinct()
                .sorted()
                .collect(toList());

        try (TFileWriter writer = new TFileWriter(new TFile("./inputsv2.zip/phones.txt"))) {
            for (String newPhone : newPhones) {
                writer.write(newPhone);
                writer.write(System.lineSeparator());
            }
        }

    }
}

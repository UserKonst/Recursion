package com.social.recursion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.java.truevfs.access.TFile;

/**
 *
 * @author konst
 */
public class TrueVFSImpl implements VFS {

    @Override
    public Iterator<TFile> getIterator(String baseDir) {
        return new FileIterator(baseDir);
    }

    @Override
    public void copyFile(Path inputPath, Path outputPath) {
        try {
            Files.copy(inputPath, outputPath, REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(TrueVFSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

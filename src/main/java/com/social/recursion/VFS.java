/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.recursion;

import java.nio.file.Path;
import java.util.Iterator;
import net.java.truevfs.access.TFile;

/**
 *
 * @author konst
 */
public interface VFS {

    public Iterator<TFile> getIterator(String baseDir);
    public void copyFile(Path inputPath, Path outputPath);
}

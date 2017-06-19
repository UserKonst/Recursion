package com.social.recursion;

import java.io.File;
import java.io.FileFilter;

public class TxtFileFilter implements FileFilter {

    @Override
    public boolean accept(File file) {
        return file.getPath().toLowerCase().endsWith(".txt");
    }

}

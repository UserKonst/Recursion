/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.recursion;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import net.java.truevfs.access.TFile;

/**
 *
 * @author konst
 */
public class FileIterator implements Iterator<TFile> {

    private final Queue<TFile> files = new LinkedList();

    public FileIterator(String path) {
        files.add(new TFile(path));
    }

    @Override
    public boolean hasNext() {
        return !files.isEmpty();
    }

    @Override
    public TFile next() {

        TFile file = files.peek();
        if (file.isDirectory()) {
            files.addAll(Arrays.asList(file.listFiles()));
        }
        return files.poll();
    }

}

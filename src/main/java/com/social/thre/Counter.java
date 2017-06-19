/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.thre;

/**
 *
 * @author konst
 */
public class Counter {

    protected long count = 0;

    public void add(long value) {
        this.count = this.count + value;
    }

}

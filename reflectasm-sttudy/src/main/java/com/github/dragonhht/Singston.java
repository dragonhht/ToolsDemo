package com.github.dragonhht;

/**
 * .
 *
 * @author: huang
 * @Date: 2019-3-25
 */
public enum Singston {
    /** */
    INSTANCE;

    public Singston getInstance() {
        return INSTANCE;
    }

    public void work(String name) {
        System.out.println(name + " is working");
    }
}

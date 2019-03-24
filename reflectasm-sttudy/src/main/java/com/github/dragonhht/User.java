package com.github.dragonhht;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * .
 *
 * @author: huang
 * @Date: 2019-3-24
 */
@Getter
@Setter
@ToString
public class User {

    private int id;
    private String name;
    public String address;

    public void work(String name) {
        System.out.println("work " + name);
    }

    public void study() {
        System.out.println("study");
    }

}

package com.squidpan;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compiling uinsg Desktop");
    }
}

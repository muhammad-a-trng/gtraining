package com.galvanize.fundamentals.constructors;

public class Picture {
    private boolean framed;
    private int height;
    private int width;

    Picture(boolean framed, int height, int width) {
        this.framed = framed;
        this.height = height;
        this.width = width;
    }

    Picture(int height, int width) {
        this(false, height, width);
    }
}

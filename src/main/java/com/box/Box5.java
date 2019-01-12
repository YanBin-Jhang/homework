package com.box;

public class Box5 implements Box {
    static float maxLength = 39.5f;
    static float maxWidth = 27.5f;
    static int maxHeight = 23;

    @Override
    public boolean validate(float length, float width, int height) {
        return (length <= maxLength && width <= maxWidth && height <= maxHeight);
    }
}

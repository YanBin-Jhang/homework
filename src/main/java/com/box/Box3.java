package com.box;

public class Box3 implements Box {
    static float maxLength = 23f;
    static float maxWidth = 14f;
    static int maxHeight = 13;

    @Override
    public boolean validate(float length, float width, int height) {
        return (length <= maxLength && width <= maxWidth && height <= maxHeight);
    }
}
package com.box;

// Box5: 長39.5，寬27.5，高23 (cm)
public class Box5 extends Box {
    static float length = 39.5f;
    static float width = 27.5f;
    static int height = 23;

    @Override
    public boolean validate(float length, float width, int height) {
        if (length <= Box5.length && width <= Box5.width && height <= Box5.height) {
            return true;
        } else {
            return false;
        }
    }
}

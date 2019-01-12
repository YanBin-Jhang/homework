package com.box;

// Box3: 長23，寬14，高13 (cm)
public class Box3 extends Box {
    static float length = 23;
    static float width = 14;
    static int height = 13;

    @Override
    public boolean validate(float length, float width, int height) {
        if (length <= Box3.length && width <= Box3.width && height <= Box3.height) {
            return true;
        } else {
            return false;
        }
    }
}

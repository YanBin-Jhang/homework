package com.box;

public abstract class Box {
    float length;
    float width;
    int height;
    public abstract boolean validate(float length, float width, int height);
}

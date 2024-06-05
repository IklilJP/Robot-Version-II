package com.enigma.goshling;

public enum MataAingin {
    North, // 0
    East, // 1
    South, // 2
    West; // 3

    public MataAingin turnRight() {
//
        return values()[(this.ordinal() + 1) % 4];
    }

    public MataAingin turnLeft() {
        return values()[Math.abs((this.ordinal() + 3) % 4)];
    }
}

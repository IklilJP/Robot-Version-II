package com.enigma.goshling;

public class Robot {

    private Integer sumbuY;
    private Integer sumbuX;
    private MataAingin posisi;

    public Robot(String posisi, Integer sumbuX, Integer sumbuY) {
        posisi = posisi.toUpperCase();
        switch (posisi) {
            case "N":
                this.posisi = MataAingin.North;
                break;
            case "E":
                this.posisi = MataAingin.East;
                break;
            case "S":
                this.posisi = MataAingin.South;
                break;
            case "W":
                this.posisi = MataAingin.West;
                break;
            default:
                this.posisi = MataAingin.North;
                break;
        }
        this.sumbuX = sumbuX;
        this.sumbuY = sumbuY;
    }

    public Integer getSumbuY() {
        return sumbuY;
    }

    public void setSumbuY(Integer sumbuY) {
        this.sumbuY = sumbuY;
    }

    public Integer getSumbuX() {
        return sumbuX;
    }

    public void setSumbuX(Integer sumbuX) {
        this.sumbuX = sumbuX;
    }

    public MataAingin getPosisi() {
        return posisi;
    }

    public void setPosisi(MataAingin posisi) {
        this.posisi = posisi;
    }

    public void move() {
        switch (this.posisi) {
            case North:
                this.sumbuY++;
                break;
            case East:
                this.sumbuX++;
                break;
            case South:
                this.sumbuY--;
                break;
            case West:
                this.sumbuX--;
                break;
        }
    }

    public void directtion(String []direction) {
        for (String p : direction) {
            switch (p) {
                case "L":
                    posisi = posisi.turnLeft();
                    break;
                case "R":
                    posisi = posisi.turnRight();
                    break;
                case "A":
                    move();
                    break;
            }

            System.out.println(p + " -> (" + sumbuX + " , " + sumbuY + ")");
        }
    }

}

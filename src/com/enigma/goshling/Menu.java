package com.enigma.goshling;

public class Menu {

    private Robot robot;
    private MataAingin mataAngin;

    public void menu() {
        System.out.println("===========================================");
        System.out.println("Selamat Datang di Robot versi II");
        System.out.println("===========================================");
        System.out.print("Tentukan posisi awal robot: ");
        String posisiAwal = Helper.inputString();

        String[] arrayInput = posisiAwal.split(",");

        if (arrayInput.length != 3 || arrayInput[0].length() != 1 || !Helper.checkCommand(arrayInput[0]) || !Helper.checkInteger(arrayInput[1]) || !Helper.checkInteger(arrayInput[2])) {
            menu();
        }

        robot = new Robot(arrayInput[0], Helper.stringToInt(arrayInput[1]), Helper.stringToInt(arrayInput[2]));

        System.out.println("Input perintah : ");

        String command = Helper.inputString();

        if (!command.matches("[a-zA-Z]+") || !command.matches("[AaLlRr\\s]*")) {
            menu();
        }
        String[] perintah = command.toUpperCase().split("");
        robot.directtion(perintah);
        System.out.println("Posisi Akhir Robot: " + robot.getSumbuX() + "," + robot.getSumbuY() + "," + robot.getPosisi());

    }


}

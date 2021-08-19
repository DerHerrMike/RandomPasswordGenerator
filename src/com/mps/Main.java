package com.mps;

import com.mps.app.bl.RandomPasswordGenerator;
import com.mps.app.utils.Color;

import java.util.Scanner;

import static java.lang.Thread.sleep;


public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static final String colorPw = Color.ANSI_RED;
    public static final String colorText = Color.ANSI_YELLOW;

    public static void main(String[] args) throws InterruptedException {

        RandomPasswordGenerator rpwg = new RandomPasswordGenerator();
        int pwLength = setPwLength();
        displayPasswords(rpwg.generatePassword(pwLength));

    }

    private static int setPwLength() throws InterruptedException {

        System.out.println(colorText+ "Zufälliges generieren eines Passwortes");
        System.out.println();
        sleep(2000);
        System.out.println(colorText+ "Geben Sie die Anzahl der Zeichen des gewünschten Passwortes an: ");
        return scanner.nextInt();

    }

    private static void displayPasswords(String generatedPW) {

        System.out.println();

        System.out.println(colorText + "Ihr Passwort lautet: "+colorPw + generatedPW);
    }
}

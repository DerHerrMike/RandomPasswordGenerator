package com.mps.app.bl;

import com.mps.app.utils.Color;


/**
 * / Created by Mike Schwingenschloegl in Aug 2021
 */
public class RandomPasswordGenerator {


    public RandomPasswordGenerator() {

    }


    public String generatePassword(int length) {

        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            String PASSWORDPOOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!$%&*#";
            int random = (int) (Math.random() * PASSWORDPOOL.length());
            password[i] = PASSWORDPOOL.charAt(random);
        }
        return new String(password);
    }

}

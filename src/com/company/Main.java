package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "mursal";
        names[1] = "basit";
        names[2] = "miyyah";

        for (int n = 0; n <= 3; n++) {
            switch (n) {
                case 0:
                    System.out.println(names[0] + " good morning");
                    break;
                case 1:
                    System.out.println(names[1] + " good afternoon");
                    break;
                case 2:
                    System.out.println(names[2] + " good evening");
            }
        }

    }
}

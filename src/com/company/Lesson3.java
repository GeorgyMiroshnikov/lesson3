package com.company;

public class Lesson3 {
    public static void main(String[] args) {
        int num = 0;

        switch (num) {
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1,8,9");
        }

        if (num == 1) {
            System.out.println("число равно 1");
        } else if (num == 8) {
            num++;
        } else {
            System.out.println("число не равно 1,8 и не равно 9");
        }

        comparisonsOperators(num);
        loops();
    }

    public static void comparisonsOperators(int num) {
        if (num != 1 && num != 8 && num != 9) {
            System.out.println("число не равно 1,8,9");
        } else {
            System.out.println("число равно 1, 8 или 9");
        }
        if (num == 0 || num == 1) {
            System.out.println("число равно 1 или 0");
        } else {
            System.out.println("число не равно 1 ни 0");
        }
    }

    public static void loops() {
        int counter = 1;
        while (counter < 100) {
            counter++;
            System.out.println(counter);
        }

        int year = 1985;
        while (year >= 1900) {
            if (year % 4 == 0) {
                System.out.println("Високосный год: " + year);
            }
            year--;
        }
    }
}
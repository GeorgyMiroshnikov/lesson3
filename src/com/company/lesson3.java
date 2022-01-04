package com.company;

public class lesson3 {

    public static void main(String[] args) {

        int num = 1;
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
        //ifelse
        if (num == 2) {
            System.out.println("число равно 1");
        } else if (num == 8) {
            num++;
        } else {
            System.out.println("число не равно 1,8,9");
        }


    }
}






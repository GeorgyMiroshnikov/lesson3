package com.company;

public class lesson3
 {


    public static void main(String[] args)
    {

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
        //ifelse
        if (num == 0) {
            System.out.println("число равно 1");
        } else if (num == 8) {
            num++;
        } else {
            System.out.println("число не равно 1,8 и не равно 9");
        }

        //public static void comparisonsOperators(int num) МЕТОД БЫСТРЫХ ОПЕРАТОРОВ
        //!= - оператор сравнения "не равно"
        // && - быстрый оператор "и". Возвращает true только тогда, когда все выражения истинны
        //  || - быстрый "или". Возвращает false только тогда, когда все выражения ложны



        if (num != 1 && num != 8 && num != 9){
            System.out.println("число не равно 1,8 или 9");
        } else System.out.println("число равно 1, 8 и 9");

        if (num == 0 || num == 1) {
            System.out.println("число равно 0 или 1");
        } else {
            System.out.println("число не равно 0 или 1");
        }

    }

 }










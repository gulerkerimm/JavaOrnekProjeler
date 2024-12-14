package org.example.hipatanüsHesaplama;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("1.kenarı giriniz :");
        int a= scan.nextInt();

        System.out.print("2. kenarı giriniz : ");

        int b =scan.nextInt();

        double c= Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüs = " + c);

        double u=(a+b+c)/2;

        System.out.println("üçgenin çevresi :"+ (2*u) );

        double alan =u*(u-a)*(u-b)*(u-c);

        System.out.println("üçgenin alanı :"+ alan);



    }
}

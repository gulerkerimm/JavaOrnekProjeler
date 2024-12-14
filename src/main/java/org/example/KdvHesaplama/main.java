package org.example.KdvHesaplama;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  double price=0.0;
        double rate = 18;

        System.out.println("tutar giriniz ");
        price=input.nextDouble();
        System.out.println(price);

        double kdvPrice =price*(rate/100);
        System.out.println("kdvPrice = " + kdvPrice);
        double total =price+kdvPrice;
        System.out.println("kdvli tutar " + total);
         */

        double price, total, total1, kdvPrice, kdvPrice1, rate = 18, rate1 = 20;
        System.out.print("tutar giriniz : ");
        price = input.nextDouble();


        kdvPrice = price * (rate / 100);
        kdvPrice1 = price * (rate1 / 100);
        total = price + kdvPrice;
        total1 = price + kdvPrice1;


        if (price < 500) {
            System.out.println("kdv oranı " + rate);
            System.out.println("toplam ürün tutarı " + total);
        } else {
            System.out.println("kdv oranı " + rate1);
            System.out.println("toplam ürün miktarı " + total1);

        }


    }
}

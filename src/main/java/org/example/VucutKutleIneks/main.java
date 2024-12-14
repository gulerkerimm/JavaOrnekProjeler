package org.example.VucutKutleIneks;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz");
        double boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        double kilo = scan.nextDouble();

        double indites = kilo / (boy * boy);

        System.out.println("vucut kitle indeksiniz : " + indites);

        if (indites < 18.5) {
            System.out.println("zayıfsınız .....");
        } else if (indites < 24.9) {
            System.out.println("ideal kilo spora devam ...");
        } else if (indites < 29.9) {
            System.out.println("şişmanlamaya başladın hayde spora ....");

        } else if (indites < 34.9) {
            System.out.println("tartı bozulacak bozulucak çabuk zayıfla ... bakma hadi  ");
        } else {
            System.out.println("sen yemeğe devam et kral yiyen de ölüyor yemiyen de...");

        }

    }
}

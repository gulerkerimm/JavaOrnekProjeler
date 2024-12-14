package org.example.NotOrtalaması;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fizik = 0, matematik, turkce, kimya, muzik, tarih;

        System.out.print("fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("mat notunu giriniz : ");
        matematik = input.nextInt();

        System.out.print("turkce notunu giriniz :");
        turkce = input.nextInt();

        System.out.print("kimya notu giriniz : ");
        kimya = input.nextInt();

        System.out.print("muzik notunu  giriniz : ");
        muzik = input.nextInt();

        System.out.print("tarih notunu giriniz : ");
        tarih = input.nextInt();

        double sonuc = (tarih + matematik + turkce + kimya + muzik + tarih) / 6;

        System.out.println("ortalamanız " + sonuc);


        boolean gecti = sonuc>60;
        System.out.println("sonuc olarak " + (gecti ? "sınıfı geçtiniz " : "sınıfta kaldınız " ));


    }
}

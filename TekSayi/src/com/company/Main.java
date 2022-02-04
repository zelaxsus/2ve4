package com.company;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Main {

    public static void main(String[] args) {
        // değişkenler ve kütüphaneler
        int a;
        int total = 0;
        Scanner inp = new Scanner(System.in);
        //döngü ve kod blokları && kullanıcıdan veri alma
        do {
            System.out.println("Sayi Giriniz : ");
            a = inp.nextInt();

            if (a % 2 == 0) {
                total += a;

            }
        }
        // 4 bölme 
            while (a%4==0); {
            System.out.println(total);

            }

        }
    }

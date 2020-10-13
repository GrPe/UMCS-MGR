package com.envy;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        zadanie08();
    }

    public static void zadanie01() {
        //zadanie 1 => do..while najpierw wykonuje zawartość pętli a potem sprawdza warunek; while najpierw sprawdza warunek
        //zadanie 2 => scanner - nextBoolean();
        //zadanie 3 => funkcja do wyświetlania tekstu/danych na ekran konsoli
    }

    public static void zadanie02() {
        Scanner sc = new Scanner(System.in);

        byte by = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);
        boolean b = sc.nextBoolean();

        System.out.println(by);
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(c);
        System.out.println(b);
    }

    public static void zadanie03() {
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj imie, nazwisko, plec i wiek, kazde po enterze");
        String imie = sc.nextLine();
        String nazwisko = sc.nextLine();
        String plec = sc.nextLine();
        int wiek = sc.nextInt();
        System.out.print(imie + " ");
        System.out.print(nazwisko + ", ");
        System.out.print(plec + ", ");
        System.out.print(wiek);
    }

    public static void zadanie04() {
        for (int i = -1000; i < 1001; ) {
            System.out.println(i);
            i = i + 3;
        }
    }

    public static void zadanie05() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj 3 liczby po enterze:");

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            max = Math.max(a, max);
        }
        System.out.println(max);
    }

    public static void zadanie06() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("q")) {
                break;
            }
            double a, b;
            char c;
            a = Double.parseDouble(s.split(" ")[0]);
            b = Double.parseDouble(s.split(" ")[1]);
            c = s.split(" ")[2].charAt(0);

            switch (c) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
            }
        }
    }

    public static void zadanie07() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println(a);
    }

    public static void zadanie08()
    {
        Random random = new Random();
        int[][] array = new int[10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                array[i][j] = random.nextInt(10);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int numberToFind = scanner.nextInt();
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(array[i][j] == numberToFind)
                {
                    System.out.println("pozycja i:" + i + " j: " + j);
                }
            }
        }
    }
}

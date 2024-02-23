package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Podaj temperature w celciuszach");
        double temperaturaC = s1.nextDouble();
        double temperaturaF = 1.8 * temperaturaC + 32;
        System.out.println("Podałeś temperature w celciuszach " + temperaturaC + " a w faranhaitach to " + temperaturaF);

        System.out.println("podaj trzy liczby całkowite");

        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();

        int najmniejsza = Math.min(Math.min(a, b), c);
        int najwieksza = Math.max(Math.max(a, b), c);

        System.out.println("to jest najmniejsza " + najmniejsza + " a ta najwieksza " + najwieksza);

        System.out.println("teraz obliczymy sobie bmi");

        System.out.println("podaj swoją wagę w kilogramach");
        double waga = s1.nextDouble();

        System.out.println("podaj swoj wzrost w metrach");
        double wzrost = s1.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("twoje bmi to " + bmi);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Waga prawidłowa");
        } else if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else {
            System.out.println("nadwaga");
        }

        System.out.println("teraz obliczymy podatek dochodowy!!!!!");
        System.out.println("Podaj swój dochód: ");
        double dochod = s1.nextDouble();
        double podatek;

        if (dochod <= 85528) {
            podatek = dochod * 0.18 - 556.02;
            System.out.println("podatek do zapłacenia to " + podatek);
        } else if (dochod > 85528) {
            double nadwyzka = dochod - 85528;
            podatek = 14839.02 + nadwyzka * 0.32;
            System.out.println("twój podatek  to " + podatek);

        }

        System.out.println("Sprzedaz ratalna");

        System.out.println("podaj cene");

        int cena;

        do {
            cena = s1.nextInt();
            if (cena >= 100 & cena <= 10000) {
                System.out.println("podana cena jest ok");
            } else {
                System.out.println("podaj cene jeszcze raz");
            }
        } while (cena < 100 || cena > 10000);

        System.out.println("podana cena to " + cena);

        System.out.println("podaj liczbe rat");

        int raty;

        do {
            raty = s1.nextInt();
            if (raty >= 6 && raty <= 48) {
                System.out.println("podane raty są możliwe");
            } else {
                System.out.println("podaj ilosc rat jeszcze raz");
            }
        } while (raty < 6 || raty > 48);

        System.out.println("podane raty to " + raty);

        double rataPlusOdsetki;

        if (raty <= 12) {
            rataPlusOdsetki = (0.025 / raty) * cena;
            System.out.println("rata z odsetkami w tym przypadku tj. kwota " + cena + " rozłożone na " + raty + " rat, wyniesie " + rataPlusOdsetki);
        } else if (raty > 12 && raty <= 24) {
            rataPlusOdsetki = (0.05 / raty) * cena;
            System.out.println("rata z odsetkami w tym przypadku tj. kwota " + cena + " rozłożone na " + raty + " rat, wyniesie " + rataPlusOdsetki);
        } else if (raty > 24 && raty <= 48) {
            rataPlusOdsetki = (0.1 / raty) * cena;
            System.out.println("rata z odsetkami w tym przypadku tj. kwota " + cena + " rozłożone na " + raty + " rat, wyniesie " + rataPlusOdsetki);
        } else {
            System.out.println("cos poszło nie tak");
        }

        System.out.println("kalkulator");

        System.out.println("podaj pierwszą z dwóch liczb");
        int pierwsza = s1.nextInt();
        System.out.println("podaj drugą liczbe");
        int druga = s1.nextInt();
        int wynik = 0;


        int dzialanie = s1.nextInt();
        switch (dzialanie) {
            case 1:
                wynik = pierwsza + druga;
                System.out.println("Wyniki dodawania to " + pierwsza + " + " + druga + " = " + wynik);
                break;
            case 2:
                wynik = pierwsza - druga;
                System.out.println("Wyniki odejmowania to " + pierwsza + " - " + druga + " = " + wynik);
                break;
            case 3:
                wynik = pierwsza * druga;
                System.out.println("Wyniki mnożenia to " + pierwsza + " * " + druga + " = " + wynik);
                break;
            case 4:
                wynik = pierwsza / druga;
                if (druga == 0){
                    throw new RuntimeException("fgd");
                }
                    System.out.println("Wyniki dzielenia to " + pierwsza + " / " + druga + " = " + wynik);
                break;
        }


    }
}

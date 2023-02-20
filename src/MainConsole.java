/*
* File: MainConsole.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023.02.20
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class MainConsole {
    public static void Author(String[] args) {
        System.out.printf("Készítette: Fehér Mátyás\n Dátum: 2023.02.20\n Csoport: Szoft I 1 N\n");
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Adja meg az [A] szakasz hosszát: ");
            double aside = scanner.nextDouble();

            System.out.print("Adja meg a [B] szakasz hosszát: ");
            double bside = scanner.nextDouble();

            Calc calculator = new Calc();
            double terulet = calculator.calculateTerulet(aside, bside);

            System.out.printf("A telek területe: " + terulet + " m2");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sk.slovicka;

import java.util.Scanner;

/**
 *
 * @author Edo
 */
public class AnglickeSlovicka extends Slovicka {

    private int spravneOdpovede = 0;
    private int otazkyPocet = 0;
    private String poleSlov[] = new String[11];


    public void skusajSlovoAccess() {

        System.out.print("access = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;
        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("pristup")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" access = pristup ");
                poleSlov[0] = "";

                break;

            } else if (!slovo.equalsIgnoreCase("pristup")) {
                System.out.println(i + " Nespravna odpoved ");
            } 
            
            else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: pristup ");
                poleSlov[0] = "access = pristup ";
            }

        }
        System.out.println("----------------------------------");
        
    }

    public void skusajSlovoRelease() {

        System.out.print("release = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;

        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("vydanie") || slovo.equalsIgnoreCase("uvolnenie")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" release = vydanie uvolnenie");
                poleSlov[1] = "";

                break;

            } else if (slovo.equalsIgnoreCase("vydanie") && slovo.equalsIgnoreCase("uvolnenie")) {
                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpovedv ");
                System.out.println(" release = vydanie uvolnenie");
                poleSlov[1] = "";

                break;
            } else if (!slovo.equalsIgnoreCase("vydanie") || !slovo.equalsIgnoreCase("uvolnenie")) {
                System.out.println(i + " Nespravna odpoved ");

            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: vydanie, uvolnenie ");
                poleSlov[1] = "release = vydanie uvolnenie  ";

            }

        }

    }

    public void skusajSlovoLayer() {

        System.out.println("----------------------------------");

        System.out.print("layer = ");
        Scanner vstupHodnota = new Scanner(System.in);

        otazkyPocet++;

        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("vrstva") || slovo.equalsIgnoreCase("uroven")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println("layer = vrstva uroven");
                poleSlov[2] = "";

                break;

            } else if (slovo.equalsIgnoreCase("vrstva") && slovo.equalsIgnoreCase("uroven")) {
                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println("layer = vrstva uroven");
                poleSlov[2] = "";

                break;
            } else if (!slovo.equalsIgnoreCase("vrstva") || !slovo.equalsIgnoreCase("uroven")) {
                System.out.println(i + " Nespravna odpoved ");

            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: vrstva, uroven ");
                poleSlov[2] = "layer = vrstva uroven ";

            }

        }
        System.out.println("----------------------------------");

    }

    public void skusajSlovoBorder(String slovoString) {

        System.out.print("border = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;
        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase(slovoString)) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" border = oramovanie ");
                poleSlov[3] = "";

                break;

            } else if (!slovo.equalsIgnoreCase(slovoString)) {
                System.out.println(i + " Nespravna odpoved ");
            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: oramovanie ");
                poleSlov[3] = "border = oramovanie ";
            }

        }
        System.out.println("----------------------------------");
    }
    
    public void skusajSlovoColumn(String slovoString) {

        System.out.print("column = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;
        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase(slovoString)) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" column = stlpec ");
                poleSlov[4] = "";

                break;

            } else if (!slovo.equalsIgnoreCase(slovoString)) {
                System.out.println(i + " Nespravna odpoved ");
            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: stlpec ");
                poleSlov[4] = "column = stlpec ";
            }

        }
        System.out.println("----------------------------------");
    }
    
    public void skusajSlovoCommon() {

        System.out.print("common = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;

        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("spolocny") || slovo.equalsIgnoreCase("bezny")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" common = spolocny bezny");
                poleSlov[5] = "";

                break;

            } else if (slovo.equalsIgnoreCase("spolocny") && slovo.equalsIgnoreCase("bezny")) {
                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpovedv ");
                System.out.println(" common = spolocny bezny");
                poleSlov[5] = "";

                break;
            } else if (!slovo.equalsIgnoreCase("spolocny") || !slovo.equalsIgnoreCase("bezny")) {
                System.out.println(i + " Nespravna odpoved ");

            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: spolocny, bezny ");
                poleSlov[5] = "common = spolocny bezny  ";

            }

        }
        System.out.println("----------------------------------");

    }
    
    public void skusajSlovoCondition() {

        System.out.print("condition = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;

        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("podmienka") || slovo.equalsIgnoreCase("stav")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" condition = podmienka stav");
                poleSlov[6] = "";

                break;

            } else if (slovo.equalsIgnoreCase("podmienka") && slovo.equalsIgnoreCase("stav")) {
                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpovedv ");
                System.out.println(" condition = podmienka stav");
                poleSlov[6] = "";

                break;
            } else if (!slovo.equalsIgnoreCase("podmienka") || !slovo.equalsIgnoreCase("stav")) {
                System.out.println(i + " Nespravna odpoved ");

            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: podmienka, stav ");
                poleSlov[6] = "condition = podmienka stav  ";

            }

        }
        System.out.println("----------------------------------");

    }
    
    public void skusajSlovoDependent() {

        System.out.print("dependent = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;
        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("zavisly")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" dependent = zavisly ");
                poleSlov[7] = "";

                break;

            } else if (!slovo.equalsIgnoreCase("zavisly")) {
                System.out.println(i + " Nespravna odpoved ");
            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: zavisly ");
                poleSlov[7] = "dependent = zavisly ";
            }

        }
        System.out.println("----------------------------------");
    }
    
    public void skusajSlovoDeployment() {

        System.out.print("deployment = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;
        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("nasadenie")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" deployment = nasadenie ");
                poleSlov[8] = "";

                break;

            } else if (!slovo.equalsIgnoreCase("nasadenie")) {
                System.out.println(i + " Nespravna odpoved ");
            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: nasadenie ");
                poleSlov[8] = "deployment = nasadenie ";
            }

        }
        System.out.println("----------------------------------");
    }
    
    public void skusajSlovoExpression() {

        System.out.print("expression = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;
        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("vyraz")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" expression = vyraz ");
                poleSlov[9] = "";

                break;

            } else if (!slovo.equalsIgnoreCase("expression")) {
                System.out.println(i + " Nespravna odpoved ");
            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: vyraz ");
                poleSlov[9] = "expression = vyraz ";
            }

        }
        System.out.println("----------------------------------");
    }
    
    public void skusajSlovoFiber() {

        System.out.print("fiber = ");
        Scanner vstupHodnota = new Scanner(System.in);
        otazkyPocet++;
        for (int i = 1; i < 4; i++) {
            String slovo = vstupHodnota.next();

            if (slovo.equalsIgnoreCase("vlakno")) {

                spravneOdpovede++;
                System.out.println(spravneOdpovede + " spravna odpoved ");
                System.out.println(" fiber = vlakno ");
                poleSlov[10] = "";

                break;

            } else if (!slovo.equalsIgnoreCase("fiber")) {
                System.out.println(i + " Nespravna odpoved ");
            } else {
            }

            if (i == 3) {

                System.out.println(" Spravna odpoved je: vlakno ");
                poleSlov[10] = "fiber = vlakno ";
            }

        }
        System.out.println("----------------------------------");
    }

    public void vyhodnocujTest() {
        System.out.println();

        System.out.println("Vyhodnotenie testu");

        System.out.println("Odpovedal/a si " + spravneOdpovede + " x spravne z " + otazkyPocet + " otazok");
        System.out.println("------------------------------------------");

        System.out.println("Slova ktore si nevedel/a : ");

        for (int i = 0; i < poleSlov.length; i++) {
            String nespravnSlovicka = poleSlov[i];
            System.out.println(nespravnSlovicka);

        }
    }

}

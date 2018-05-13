package com.kodilla.testing.zadania;

public class OdwroconaLiczba {

    public int odwrocLiczbe(int liczba) {
        String liczbaTekst = String.valueOf(liczba);
        String odwroconaLiczbaTekst = "";
        for (int i = liczbaTekst.length() - 1; i >= 0; i--) {
            odwroconaLiczbaTekst += liczbaTekst.charAt(i);
        }
        return Integer.parseInt(odwroconaLiczbaTekst);
    }

    public static void main(String[] args) {
        OdwroconaLiczba odwroconaLiczba = new OdwroconaLiczba();
        System.out.println(odwroconaLiczba.odwrocLiczbe(17868));

    }
}



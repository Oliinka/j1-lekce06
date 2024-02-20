package cz.czechitas.lekce6.nakupniseznam;

import cz.czechitas.lekce6.kontakty.Osoba;

import java.util.*;

public class NakupniSeznam {
    private final List<Polozka> seznam = new ArrayList<>();

    public void run() {
        naplnSeznam();
        System.out.printf("Na začátku seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);

        Polozka tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Třetí položka je: %s", tretiPolozka).println();

        smazDruhouPolozku();
        tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Nová třetí položka je: %s", tretiPolozka).println();

        pridejDalsiPolozku();
        System.out.printf("Na konci seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);
    }

    /**
     * Naplní seznam alespoň 4 položkami.
     */
    private void naplnSeznam() {

        /*List<String>jmena = new ArrayList<>();
        jmena.add(4);
        jmena.get(3);*/

        /*Set<Integer>prvocisla = ;*/
/*
        Map<String, Osoba> osoby = new HashMap<>();
        osoby.put("Frantisek Novak", Osoba("Frantisek", "Novak"));
*/
        Polozka vino = new Polozka("Vino", 2,"lahev");
        seznam.add(vino);
        seznam.add(new Polozka("ocet", 1, "l"));
        seznam.add(new Polozka("maslo", 250, "g"));
        seznam.add(new Polozka("testoviny", 1, "kg"));
        //TODO
    }
    /**
     * Vrátí třetí položku ze seznamu.
     *
     * @return
     */
    private Polozka ziskejTretiPolozku() {

        if (seznam.size() >=3){
            return seznam.get(2);
        }else {
            return null;
        }
    }

    /**
     * Smaže druhou položku ze seznamu.
     */
    private void smazDruhouPolozku() {
        Polozka druhaPolozka = seznam.get(1);
        seznam.remove(1);
        System.out.println("Odebrána druhá položka seznamu, " + druhaPolozka+".");

        //TODO
    }

    /**
     * Přidá novou položku na konec seznamu.
     */
    private void pridejDalsiPolozku() {
        Polozka novaPolozka = new Polozka("káva", 1, "kg");
        seznam.add(novaPolozka);
        System.out.println("Přidána další položka:" + novaPolozka);
        //TODO
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nákupní seznam");
        builder.append("\n");
        for (Polozka polozka : seznam) {
            builder.append("* ");
            builder.append(polozka);
            builder.append("\n");
        }
        return builder.toString();
    }
}

package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Chiediamo le informazioni del prodotto
        int productCode =  (int)(Math.random()*1000000001) ;
        System.out.println("Benvenuto! Inserisci il nome del prodotto");
        String productName = scan.nextLine();

        System.out.println("Scrive una descrizione del prodotto!");
        String productDescrizione = scan.nextLine();

        System.out.println("Inserisci il prezzo del prodotto");
        double productPrice = scan.nextDouble();

        System.out.println("Inserisci l'IVA del prodotto!");
        double productIva = scan.nextDouble();

        System.out.println("Questo è il codice assegnato al suo prodotto: ");
        System.out.println(productCode);

        //Creo un oggetto prodotto
        Prodotto productOne = new Prodotto(productCode, productName, productDescrizione, productPrice, productIva);
        System.out.println(productOne);
        System.out.println("Il nome esteso è: " + productOne.getCodeName());
        System.out.println("Il prezzo con IVA è: " + productOne.getPriceWithIva());
        scan.close();
    }
}

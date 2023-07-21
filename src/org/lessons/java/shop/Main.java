package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Chiediamo le informazioni del prodotto
        int productCode =  (int)(Math.random()*1000000001) ;

        System.out.println("Questo sarà il codice assegnato al suo prodotto: ");
        System.out.println(productCode);

        System.out.println("Benvenuto! Inserisci il nome del prodotto");
        String productName = scan.nextLine();

        System.out.println("Scrive una descrizione del prodotto!");
        String productDescrizione = scan.nextLine();

        System.out.println("Inserisci il prezzo del prodotto");
        double productPrice = scan.nextDouble();

        System.out.println("Inserisci l'IVA del prodotto!");
        double productIva = scan.nextDouble();

        System.out.println("Inserisci la categoria del appartenente al prodotto: ");
        String productCategory = scan.nextLine();

        System.out.println("Inserisci anche una descrizione per la categoria: ");
        String productCatDesc = scan.nextLine();



        //Creo un oggetto
        Prodotto productOne = new Prodotto(productCode, productName, productDescrizione, productPrice, productIva);
        Categoria categoryOne = new Categoria(productCategory, productCatDesc);

        //Stampo
        System.out.println(productOne);
        System.out.println(categoryOne);
        System.out.println("Il nome esteso è: " + productOne.getCodeName());
        System.out.println("Il prezzo con IVA è: " + productOne.getPriceWithIva());
        scan.close();
    }
}

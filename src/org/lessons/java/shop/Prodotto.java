package org.lessons.java.shop;
//Alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//Il codice prodotto sia accessibile solo in lettura
//Gli altri attributi siano accessibili sia in lettura che in scrittura
//Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il
// prezzo comprensivo di iva
//Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome: il
// codice deve avere un pad left di zeri per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091,
// mentre codice 123445567 resta come è)
//Nello stesso package aggiungete una classe Main con metodo main nella quale create uno o più
// prodotti e testate tutte le funzionalità della classe (cioè tutti i metodi public)
public class Prodotto {
    //CAMPI
    private int code;
    private String name;
    private String descrizione;
    private double price;
    private double iva;

    //COSTRUTTORI

    public Prodotto(int code, String name, String descrizione, double price, double iva) {
        this.code = code;
        this.name = name;
        this.descrizione = descrizione;
        this.price = price;
        this.iva = iva;
    }

    //GETTER/SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    //METODI

    private String getCodedPaded () {
        String code = String.valueOf(this.code);
        while (code.length() < 8) {
            code = "0" + code;

        }
        return code;
    }
    public String getCodeName () {
        String codePlusName = getCodedPaded() + "-" + name;
        return codePlusName;
    }
    public double getPriceWithIva () {
        double pricePlusIva = price + (price * iva/100);
        return pricePlusIva;
    }


    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", price=" + price +
                ", iva='" + iva + '\'' +
                '}';
    }
}

package org.lessons.java.shop;
//BONUS 1:  Aggiungere una classe Categoria (con nome e descrizione) e associare ad
// ogni Prodotto una categoria usando la composizione
public class Categoria {
    //CAMPI
    private String nome;
    private String descrizione;

    //COSTRUTTORI

    public Categoria(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }


    //GETTER/SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    //METODI

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}

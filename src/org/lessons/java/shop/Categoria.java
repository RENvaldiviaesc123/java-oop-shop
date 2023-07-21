package org.lessons.java.shop;
//BONUS 1:  Aggiungere una classe Categoria (con nome e descrizione) e associare ad
// ogni Prodotto una categoria usando la composizione
public class Categoria {
    //CAMPI
    private String nome;
    private String proCatDesc;

    //COSTRUTTORI

    public Categoria(String nome, String proCatDesc) {
        this.nome = nome;
        this.proCatDesc = proCatDesc;
    }


    //GETTER/SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProCatDesc() {
        return proCatDesc;
    }

    public void setProCatDesc(String proCatDesc) {
        this.proCatDesc = proCatDesc;
    }


    //METODI

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", descrizione='" + proCatDesc + '\'' +
                '}';
    }
}

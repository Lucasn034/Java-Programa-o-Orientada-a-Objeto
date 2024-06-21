package br.com.estudo.modeloCarro;

public class Carro {
    private String nome;
    private String marca;
    private String categoria;
    private int ano;

    public Carro (String nome, String marca, String categoria, int ano){
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Marca: %s
                Categoria: %s 
                Ano: %d\n""", nome, marca, categoria, ano);
    }
}

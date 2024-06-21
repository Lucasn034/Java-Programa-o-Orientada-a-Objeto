package br.com.estudo.modeloAnimal;

public class Animal {

    private String categoria;
    private double peso;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void EmitirSom(String ruido){
        System.out.println(ruido);
    }
}

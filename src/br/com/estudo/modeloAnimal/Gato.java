package br.com.estudo.modeloAnimal;

public class Gato extends Animal {

    private String nome;
    private String raca;

    public Gato(String nome, String raca, String categoria, double peso, int idade){
        this.nome = nome;
        this.raca = raca;
        this.setCategoria(categoria);
        this.setPeso(peso);
        this.setIdade(idade);
    }

    @Override
    public void EmitirSom(String ruido) {
        super.EmitirSom(ruido);
    }

    public void ArranharMoveis(){
        System.out.println("Arranhando Moveis");
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Raça: %s
                Categoria: %s 
                Peso: %f
                Idade: %d """, nome, raca, getCategoria(), getPeso(), getIdade());
    }
}

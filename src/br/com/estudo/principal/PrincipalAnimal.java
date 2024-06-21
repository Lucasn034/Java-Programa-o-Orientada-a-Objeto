package br.com.estudo.principal;

import br.com.estudo.modeloAnimal.Cachorro;
import br.com.estudo.modeloAnimal.Gato;

public class PrincipalAnimal {

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("paçoca", "vira-lata", "Mamifero", 16, 7);
        Gato meuGato = new Gato("Tom", "Burmês", "Mamifero", 4, 5);

        System.out.println("Quando eu Chego em Casa Meu Cachoro ");
        meuCachorro.AbanarRabo();
        meuCachorro.EmitirSom("E Faz AU au AU");
        System.out.println("\nDados do Meu Cachorro: \n" + meuCachorro.toString());

        System.out.println("\nQuando eu Chego em Casa Meu Gato Esta: ");
        meuGato.ArranharMoveis();
        meuGato.EmitirSom("E Faz Miau miau Miau");
        System.out.println("\nDados do Meu Gato: \n" + meuGato.toString());
    }
}

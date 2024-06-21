package br.com.estudo.principal;

import java.util.ArrayList;
import br.com.estudo.modeloCarro.Carro;

public class PrincipalCarro {

    public static void main(String[] args) {

        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        Carro novoCarro = new Carro("Cruze",  "Chevrolet", "Sedã", 2013);
        //novoCarro.getListaDeCarros().add(novoCarro);
        listaDeCarros.add(novoCarro);

        Carro outrocarro = new Carro("Jeep",  "Chevrolet", "SUV", 2018);
        //outroCarro.getListaDeCarros().add(outrocarro);
        listaDeCarros.add(outrocarro);

        Carro antigoCarro = new Carro("Jeep",  "Chevrolet", "SUV", 2023);
        //antigoCarro.getListaDeCarros().add(antigoCarro);
        listaDeCarros.add(antigoCarro);

        for (Carro c : listaDeCarros){
            System.out.println(c.toString());
        }
    }

}

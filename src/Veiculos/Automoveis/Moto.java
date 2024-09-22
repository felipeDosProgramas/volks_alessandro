package Veiculos.Automoveis;

import Veiculos.Veiculo;
import java.util.Random;

public class Moto extends Veiculo {
    private static final Random random = new Random(1);

    public Moto(String modelo, int ano, String cor, int capacidade_carga_kg, int capacidade_pessoas) {
        super(modelo, ano, cor, capacidade_carga_kg, capacidade_pessoas);
    }
    public void puxar_grau(){
        if (random.nextInt() == 0) {
            System.out.println("caiu");
            return;
        }
        System.out.println("ran dan dan dan");
    }
}

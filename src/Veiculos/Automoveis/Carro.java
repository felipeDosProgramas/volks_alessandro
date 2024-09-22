package Veiculos.Automoveis;

import Veiculos.Veiculo;

import java.util.Random;

public class Carro extends Veiculo {
    private boolean quebrado = false;
    private static final Random random = new Random(3);
    public Carro(String modelo, int ano, String cor, int capacidade_carga_kg, int capacidade_pessoas) {
        super(modelo, ano, cor, capacidade_carga_kg, capacidade_pessoas);
    }
    public void quebrar() {
        quebrado = true;
    }
    public void consertar() {
        quebrado = false;
    }
    @Override
    public void ligar() {
        if (random.nextInt() == 0)
            quebrar();
        if (!quebrado)
            super.ligar();
    }
}

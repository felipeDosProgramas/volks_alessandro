package Veiculos.Automoveis;

import Veiculos.Veiculo;

public class Caminhao extends Veiculo {
    private Veiculo guincho = null;
    public Caminhao(String modelo, int ano, String cor, int capacidade_carga_kg, int capacidade_pessoas)
    {
        super(modelo, ano, cor, capacidade_carga_kg, capacidade_pessoas);
    }
    public void guinchar(Veiculo veiculo) {
        guincho = veiculo;
    }
    public Veiculo soltar_guincho() {
        var v = guincho;
        guincho = null;
        return v;
    }
}

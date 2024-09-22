package Veiculos;

import static java.lang.Thread.sleep;

abstract public class Veiculo {
    protected boolean esta_ligado = false;
    public String modelo;
    public int ano;
    public String cor;
    public int capacidade_pessoas;
    public int capacidade_carga_kg;
    public Veiculo(String modelo, int ano, String cor, int capacidade_carga_kg, int capacidade_pessoas) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.capacidade_pessoas = capacidade_pessoas;
        this.capacidade_carga_kg = capacidade_carga_kg;
    }
    public void ligar() {
        try {
            System.out.println("ligando...");
            sleep(1000);
            esta_ligado = true;
            System.out.println("ligado!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void desligar() {
        esta_ligado = false;
        System.out.println("desligado");
    }
}

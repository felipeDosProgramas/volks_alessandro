import Veiculos.Automoveis.Caminhao;
import Veiculos.Automoveis.Carro;

public class Main {

    public static void main(String[] args) {
        Caminhao volks = new Caminhao(
        "volks", 2024, "preto", 1500, 20
        );
        volks.ligar();
        volks.guinchar(
                new Carro("volks", 2024, "preto", 1500, 20)
        );
    }
}

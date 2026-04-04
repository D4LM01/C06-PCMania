package inatel.br.classes;
import inatel.br.main.Main;

public class HardwareBasico {
    private String nome;
    private int capacidade;
    private int ram;

    public String getNome() {
        return nome;
    }

    public int getRam() {
        return ram;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

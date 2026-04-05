package inatel.br.classes;

public class Computador {
    private String marca;
    private float preco;
    private MemoriaUSB memoriausbs;
    private SistemaOperacional os;
    private HardwareBasico hardwarebasico;

    public Computador() {
        this.hardwarebasico = new HardwareBasico();
        this.os = new SistemaOperacional();
    }

    public float getPreco() {
        return preco;
    }

    public SistemaOperacional getOs() {
        return os;
    }

    public HardwareBasico getHardwarebasico() {
        return hardwarebasico;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void mostraPCConfigs(){
    System.out.println("Configuracoes do PC\n");
    System.out.println("Marca: " + this.marca);
    System.out.println("Preco: R$" + this.preco);
    System.out.println(hardwarebasico.getNome());
    System.out.println(hardwarebasico.getRam() + "GB de Memoria Ram");
    System.out.println(hardwarebasico.getCapacidade() + "GB");
    System.out.println("Sistema Operacional: " + os.getNome() + "(" + os.getTipo() + ")");
    System.out.println("Acompanha " + memoriausbs.getNome() + " de " + memoriausbs.getCapacidade() + "GB\n");

    }
    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriausbs = musb;
    }
}

package inatel.br.classes;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private float[] carrinho = new float[10];
    private int itotal = 0;
    private Computador[] pc;

    Scanner entrada = new Scanner(System.in);

    // construtor correto
    public Cliente(Computador[] pc){
        this.pc = pc;
    }

    public void cadastro(){
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu cpf: ");
        cpf = entrada.nextLine();

        System.out.println("Cadastrado com sucesso");
        System.out.println("Bem Vindo " + nome + "!\n");
    }

    public float calcularTotalCompra(){
        float valor = 0;

        for (int i = 0; i < itotal; i++){
            valor += carrinho[i];
        }

        return valor;
    }

    public void addcarrinho(float preco){
        if (itotal < carrinho.length){
            carrinho[itotal] = preco;
            itotal++;
        } else {
            System.out.println("Carrinho cheio!");
        }
    }

    public void menu() {
        int input;

        do {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1- Adicionar item 1 ao carrinho");
            System.out.println("2- Adicionar item 2 ao carrinho");
            System.out.println("3- Adicionar item 3 ao carrinho");
            System.out.println("0- Finalizar compra");

            input = entrada.nextInt();

            switch (input) {
                case 1:
                    addcarrinho(pc[0].getPreco());
                    break;

                case 2:
                    addcarrinho(pc[1].getPreco());
                    break;

                case 3:
                    addcarrinho(pc[2].getPreco());
                    break;

                case 0:
                    System.out.println("Compra finalizada");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (input != 0);

        System.out.println("Total: R$ " + calcularTotalCompra());
    }
}
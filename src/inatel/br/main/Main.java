package inatel.br.main;
import inatel.br.classes.Cliente;
import inatel.br.classes.Computador;
import inatel.br.classes.MemoriaUSB;

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Computador[] pcs = new Computador[3];
    Cliente cliente = new Cliente(pcs);
    MemoriaUSB[] memoriausb = new MemoriaUSB[3];
    Scanner entrada = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      pcs[i] = new Computador();
      memoriausb[i] = new MemoriaUSB();
    }

    //Associação
    for (int i = 0; i < 3; i++) {
      pcs[i].addMemoriaUSB(memoriausb[i]);
    }

    //Info das inatel.br.classes.MemoriaUSB
    memoriausb[0].setNome("Pen-drive");
    memoriausb[0].setCapacidade(16);

    memoriausb[1].setNome("Pen-drive");
    memoriausb[1].setCapacidade(32);

    memoriausb[2].setNome("HD Externo");
    memoriausb[2].setCapacidade(1000);

    //Info Computadores
    pcs[0].setMarca("Apple");
    pcs[0].setPreco(670.0F);
    pcs[0].getHardwarebasico().setNome("Pentium Core i3 (2200 Mhz)");
    pcs[0].getHardwarebasico().setCapacidade(500);
    pcs[0].getHardwarebasico().setRam(8);
    pcs[0].getOs().setNome("macOS Sequoia");
    pcs[0].getOs().setTipo(64);


    pcs[1].setMarca("Samsung");
    pcs[1].setPreco(1904.0F);
    pcs[1].getHardwarebasico().setNome("Pentium Core i5 (3370 Mhz)");
    pcs[1].getHardwarebasico().setCapacidade(1000);
    pcs[1].getHardwarebasico().setRam(16);
    pcs[1].getOs().setNome("Windows 8");
    pcs[1].getOs().setTipo(64);

    pcs[2].setMarca("Dell");
    pcs[2].setPreco(6348.0F);
    pcs[2].getHardwarebasico().setNome("Pentium Core i7 (4500 Mhz)");
    pcs[2].getHardwarebasico().setCapacidade(2000);
    pcs[2].getHardwarebasico().setRam(32);
    pcs[2].getOs().setNome("Windows 10");
    pcs[2].getOs().setTipo(64);

    cliente.cadastro();
    System.out.println("Items em promoção: ");
    System.out.println("Promoção 1: ");
    pcs[0].mostraPCConfigs();
    System.out.println("Promoção 2: ");
    pcs[1].mostraPCConfigs();
    System.out.println("Promoção 3: ");
    pcs[2].mostraPCConfigs();
    cliente.menu();

  }



}








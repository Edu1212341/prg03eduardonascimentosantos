/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); //scannerzinho basico (peguei do nelio alves)
        ContaBanco minhaConta = new ContaBanco(); // Criamos a conta sem nada
        int opcao;

        do {
            System.out.println("\n========== BANCO JHON ATAS BRASIL =========="); //banco com nome familiar
            System.out.println("1 - ABRIR CONTA");
            System.out.println("2 - DEPOSITAR");
            System.out.println("3 - SACAR");
            System.out.println("4 - PAGAR MENSALIDADE");
            System.out.println("5 - FECHAR CONTA");
            System.out.println("6 - VER STATUS DA CONTA");
            System.out.println("0 - SAIR");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            System.out.println("=====================\n");

            switch (opcao) {
                case 1:
                    if (minhaConta.isStatus() == true) {
                        System.out.println("JA EXISTE UMA CONTA ABERTA ");
                    } else {
                        System.out.print("Digite o número da conta: ");
                        int num = sc.nextInt();
                        System.out.print("Digite o tipo (cc ou cp): ");
                        String tipo = sc.next();
                        sc.nextLine();       //limpando o buffer para que consiga ler o nextline
                        System.out.print("Digite o nome do dono: ");
                        String dono = sc.nextLine(); // sc nextline pra ler com espaços
                        
                        minhaConta.abrirConta(num, tipo, dono);
                    }
                    break;

                case 2:
                    System.out.print("Quanto deseja depositar?  ");
                    double valorD = sc.nextDouble();
                    minhaConta.depositar(valorD);
                    break;

                case 3:
                    System.out.print("Quanto deseja sacar?  ");
                    double valorS = sc.nextDouble();
                    minhaConta.sacar(valorS);
                    break;

                case 4:
                    minhaConta.pagarMensalidade();
                    System.out.println("Mensalidade PAGA");
                    break;

                case 5:
                    minhaConta.fecharConta();
                    if (!minhaConta.isStatus()) {
                        System.out.println("Conta fechada com sucesso");
                    }
                    break;

                case 6:
                    System.out.println("Dono: " + minhaConta.getDono());
                    System.out.println("Número: " + minhaConta.getNumConta());
                    System.out.println("Tipo: " + minhaConta.getTipo());
                    System.out.println("Saldo: " + minhaConta.getSaldo());
                    System.out.println("Status: " );
                    if(minhaConta.isStatus() == true){
                        System.out.println("Aberta");
                    }else{
                        System.out.println("Fechada");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }

        } while (opcao != 0);
        sc.close();
    }
}

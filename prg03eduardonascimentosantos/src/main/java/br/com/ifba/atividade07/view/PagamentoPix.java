/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class PagamentoPix implements Pagamento{
    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }
    
    public double calcularTotal(){
        return valor;
    }
    
    public void imprimirRecibo(){
        JOptionPane.showMessageDialog(null, "Valor total: "+ this.calcularTotal() + "      Cashback: " + (valor * 0.02));//tranquilo
    }
}

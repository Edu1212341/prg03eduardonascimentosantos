/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author eduardo
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    public ContaBanco() {
        this.saldo = 0.0;
        this.status = false; 
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {//se escrever outra coisa que nã
        if (!"cc".equals(tipo) && !"cp".equals(tipo)){ //A IDE me indicou que usasse Equals!!!
            System.out.println("Este tipo de conta é invalido ou nao existe ");
        }else {
            this.tipo = tipo;
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(int numConta, String tipo, String dono){   
        this.setTipo(tipo);
        
        if (this.tipo != null){//se a variavel tipo não tiver nem cp nem cc vai permanecer null, ai ní
            this.setNumConta(numConta);
            this.setDono(dono);
            setStatus(true);
            // Voce mencionou que devemos usar metodos getters e setters, eu ia fazer "this.numConta =numConta" mas me pareceu mais profissional fazer assim.
        
            if (tipo.equals("cc")){
            setSaldo(50.0);
            }
            if(tipo.equals("cp")){// nesses if's não precisa de this.
            setSaldo(150.0);
            }
        }
    }

    public void fecharConta(){
        if (status == true){//a conta tem que existir e o saldo tem que estar zerado
            if (saldo != 0){
                System.out.println("O saldo precisa estar zerado para que a conta seja desativada");
            }else{
                this.setStatus(false);
            }
        }
    }

    public void depositar(double valor){
        if(status == true){//a conta tem que existir e não da de por valor negativo ou 0
            if ( valor > 0 ){
                setSaldo(saldo + valor);
            }else{
                System.out.println("VALOR NAO RECONHECIDO, TENTE NOVAMENTE COM UM VALOR VALIDO");
            }
        }else{
            System.out.println("Essa conta esta desativada");
        }
    }

    public void sacar(double valor){
        if(status == true){
            if ( valor > getSaldo()){
                System.out.println("SALDO INSUFICIENTE");
            }else{
                setSaldo(saldo - valor);
            }
        }else{
            System.out.println("Essa conta esta desativada");
        }
            
    }
    
    public void pagarMensalidade (){
        if(status == true){
            if(tipo.equals("cc")){
                if(getSaldo() < 12){//Muda o valor das mensalidades dependendo de cc ou cp
                    System.out.println("Infelizmente nao ha saldo suficiente");
                }else{
                    setSaldo(saldo - 12);
                }
            }
            if(tipo.equals("cp")){
                if(getSaldo() < 20){
                    System.out.println("Infelizmente nao ha saldo suficiente");
                }else{
                    setSaldo(saldo-20);
                }
            }
        }else{
            System.out.println("Essa conta esta desativada");
        }
    }
}

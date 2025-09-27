package com.dio.banco;

public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

     @Override
    public void sacar(double Valor) {
       saldo -= Valor;
    }

    @Override
    public void transferir(double Valor, Conta contaDestino) {
        this.sacar(Valor);
        contaDestino.depositar(Valor);

    }

    @Override
    public void depositar(double Valor) {
        saldo += Valor;
    }

    public void sacar(){
    };

    public void depositar(){

    };

    public void transferir(){


    };


    public int getAgencia(){

        return agencia;
    }

    public int getNumero(){
        return numero;
    };

    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInfoComum(){
         System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

   

    
}

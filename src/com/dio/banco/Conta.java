package com.dio.banco;

public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;

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

    @Override
    public void sacar(double Valor) {
    }

    @Override
    public void transferir(double Valor) {
    }

    @Override
    public void depositar(double Valor) {
    }

    
}

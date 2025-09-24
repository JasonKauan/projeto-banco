package com.dio.banco;

public abstract class Conta implements IConta {
    private int agencia;
    private int numero;
    private double saldo;

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
          throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void transferir(double Valor) {
           throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

    @Override
    public void depositar(double Valor) {
          throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    
}

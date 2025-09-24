package com.dio.banco;

public  class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 0;

    public ContaCorrente(){
        super.agencia = 1;
        super.numero = SEQUENCIAL;


    }
}

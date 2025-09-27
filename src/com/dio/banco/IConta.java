package com.dio.banco;

public interface IConta {

    void sacar(double Valor);

    void transferir(double Valor, Conta contaDestino);

    void depositar(double Valor);

    void imprimirExtrato();

    
}
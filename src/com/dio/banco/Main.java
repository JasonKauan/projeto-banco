package com.dio.banco;

public class Main {
    public static void main(String[] args) {
     Conta cc = new ContaCorrente(null);
     Conta poupanca = new ContaPoupanca(null);

     cc.depositar(1500);
     cc.sacar(1200);

        

        
     cc.imprimirExtrato();
    }
}

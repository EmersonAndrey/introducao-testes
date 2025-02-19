package com.aula.aulaTestes.service;

import org.springframework.stereotype.Service;

@Service
public class ExemploService {

    public int somaValores(int x, int y) {
        return x + y;
    }

    public Object verificarNulo(Object valor) {
        return valor;
    }

    public boolean verificarSeMaiorQue(int i, int j) {
        if (i > j) {
            return true;
        }
        return false;
    }

    public void checarTimeout() throws InterruptedException{
        System.out.println("Indo dormir por 5 segundos");
        Thread.sleep(5000);
        System.out.println("Acordei!!!!!");
    }

}
package com.aula.aulaTestes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploServiceTest {
    
    @Test
    void testeSomarValorVerificarSeIgualENaoIgual(){

        // configurar
        ExemploService exemploService = new ExemploService();
        int resultadoEsperado = 10;

        // executar
        int resultadoReal = exemploService.somaValores(6, 4);

        // verificar
        Assertions.assertEquals(resultadoEsperado, resultadoReal, "6 + 4 deve ser 10");
    }

}

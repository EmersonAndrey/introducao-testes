package com.aula.aulaTestes.service;

import static org.junit.jupiter.api.Assertions.*;


import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.boot.test.context.SpringBootTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class ExemploServiceTest {
    
    private ExemploService exemploService;

    @BeforeAll
    static void configurarAntesDeTudo(){
        System.out.println("Executando BeforeAll");
    }

    @BeforeEach
    void configurarAntesDeCadaMetodoDeTeste(){
        System.out.println("Executando o metodo BeforeEach");
        exemploService = new ExemploService();
    }


    @Test
    @DisplayName("Testar se soma dois valores da certo")
    @Order(2)
    void testeSomarValorVerificarSeIgualENaoIgual(){
        System.out.println("Metodo: testeSomarValorVerificarSeIgualENaoIgual");

        // configurar
        // ExemploService exemploService = new ExemploService();
        // int resultadoEsperado = 10;

        // executar
        // int resultadoReal = exemploService.somaValores(6, 4);

        // verificar (assert)
        assertEquals(10, exemploService.somaValores(6, 4), "6 + 4 deve ser 10");
    }


    @Test
    @DisplayName("Testar verificar se objeto e null")
    @Order(1)
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testeVerificarSeObjetoNulo(){
        System.out.println("Metodo: testeVerificarSeObjetoNulo");

        // ExemploService exemploService = new ExemploService();
        assertNull(exemploService.verificarNulo(null), "Objeto deve ser nulo");
        assertNotNull(exemploService.verificarNulo("String"), "Objeto nao deve ser nulo");
        
    }

    @Test
    @DisplayName("Testar verificar se valor e maior que o outro")
    @Order(3)
    void testeVerificarSeValorMaiorQue(){
        System.out.println("Metodo: testeVerificarSeValorMaiorQue");
        // ExemploService exemploService = new ExemploService();
        assertTrue(exemploService.verificarSeMaiorQue(10, 5), "O valor 1 deve estar maior que o valor 2");
        assertFalse(exemploService.verificarSeMaiorQue(5, 20), "O valor 1 deve estar menor que o valor 2");

    }

    @Test
    @DisplayName("Testar verificar timeout")
    @Order(0)
    @Disabled("Pulando o de timeout")
    void testeVerificarTimeout(){
        System.out.println("Metodo: testeVerificarTimeout");
        assertTimeoutPreemptively(
            Duration.ofSeconds(6), 
            () -> {exemploService.checarTimeout();});
    }



    @AfterEach
    void configurarDepoisDeCadaMetodoDeTeste(){
        System.out.println("Executando o metodo AfterEach");
        exemploService = new ExemploService();
    }

    @AfterAll
    static void configurarDepoisDeTudo(){
        System.out.println("Executando AfterAll");
    }

    

}

package com.desafio.qa.desafioqa.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdministradorTests {

	private static Administrador administrador;

    @BeforeAll
    public static void setUp() {
        administrador = new Administrador();
    }

    @Test
    public void testandoSeterDaPropriedadeNome() {
		// Arrange
        String name = "John Doe";

		// Act
        administrador.setNome(name);

		// Assert
        assertEquals(name, administrador.getNome());
    }

    @Test
    public void shouldSetAndGetEmail() {
		// Arrange
        String email = "johndoe@example.com";

		// Act
        administrador.setEmail(email);

		//Assert
        assertEquals(email, administrador.getEmail());
    }

    @Test
    public void shouldSetAndGetPassword() {
		// Arrange
        String password = "password123";

		// Act
        administrador.setSenha(password);

		//Assert
        assertEquals(password, administrador.getSenha());
    }

}

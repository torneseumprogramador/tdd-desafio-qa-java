package com.desafio.qa.desafioqa.servicos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidadorTests {

	@Test
	void validarCPFValido() {
		// Arrange
		boolean cpfValido;

		// Act
		cpfValido = Validar.validarCPF("071.342.760-40");

		// Assert
		assertEquals(true, cpfValido);
	}

	@Test
	void validarCPFInvalido() {
		// Arrange
		boolean cpfValido;

		// Act
		cpfValido = Validar.validarCPF("071.342.760-41");

		// Assert
		assertEquals(false, cpfValido);
	}

	@Test
	void validarCPFNoFormatoErrado() {
		// Arrange
		boolean cpfValido;

		// Act
		cpfValido = Validar.validarCPF("sjnadslkjdas");

		// Assert
		assertEquals(false, cpfValido);
	}

	@Test
	void validarCPFVazio() {
		// Arrange
		boolean cpfValido;

		// Act
		cpfValido = Validar.validarCPF("");

		// Assert
		assertEquals(false, cpfValido);
	}

	@Test
	void validarCPFValidoComEspaco() {
		// Arrange
		boolean cpfValido;

		// Act
		cpfValido = Validar.validarCPF("071.342.760-40 ");

		// Assert
		assertEquals(true, cpfValido);
	}

	@Test
	void validarCPFNull() {
		// Arrange
		boolean cpfValido;

		// Act
		cpfValido = Validar.validarCPF(null);

		// Assert
		assertEquals(false, cpfValido);
	}
}
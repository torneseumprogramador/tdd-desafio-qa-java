package com.desafio.qa.desafioqa.servicos;

public class Validar {
    public static boolean validarCPF(String cpf){
        if(cpf == null) return false;
        
        cpf = cpf.replaceAll("\\D+", ""); // Remove todos os caracteres que não são números

        // Verifica se o CPF tem 11 caracteres
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        boolean todosDigitosIguais = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais) {
            return false;
        }

        // Verifica se o primeiro dígito verificador é válido
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * (cpf.charAt(i) - '0');
        }
        int digitoVerificador = 11 - (soma % 11);
        if (digitoVerificador >= 10) {
            digitoVerificador = 0;
        }
        if (digitoVerificador != (cpf.charAt(9) - '0')) {
            return false;
        }

        // Verifica se o segundo dígito verificador é válido
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (11 - i) * (cpf.charAt(i) - '0');
        }
        digitoVerificador = 11 - (soma % 11);
        if (digitoVerificador >= 10) {
            digitoVerificador = 0;
        }
        if (digitoVerificador != (cpf.charAt(10) - '0')) {
            return false;
        }

        return true;
    }
}

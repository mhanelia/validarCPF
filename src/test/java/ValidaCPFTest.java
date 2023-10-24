import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidaCPFTest {
    ValidaCPF cpf = new ValidaCPF();

    @Test
    void testCPFIncompleto() {
        assertFalse(cpf.isCPF("12345"));
    }

    @Test
    void testCPFCorreto() {
        assertTrue(cpf.isCPF("63400477508"));
    }

    @Test
    void testCPFMaior(){
        assertFalse(cpf.isCPF("634004775089"));
    }
    @Test
    void testCPFComPonto(){
        assertFalse(cpf.isCPF("634.004.775-08"));
    }
    @Test
    void testCPFComEspacoInicial(){
        assertFalse(cpf.isCPF(" 63400477508"));
    }
    @Test
    void testCPFCaractereEspecial(){
        assertFalse(cpf.isCPF("634004775&%"));
    }
    @Test
    void testCPFEspacoFinal(){
        assertFalse(cpf.isCPF("63400477508 "));
    }
    @Test
    void testCPFVirgula(){
        assertFalse(cpf.isCPF("634,004,775-08"));
    }
    @Test
    void testCPFInvalido(){
        assertFalse(cpf.isCPF("12312312312"));
    }

    @Test
    void testCPFSequencial(){
        assertFalse(cpf.isCPF("33333333333"));
    }

    @Test
    void testMostraCPF() {
        assertEquals("634.004.775-08", cpf.imprimeCPF("63400477508"));
    }
}
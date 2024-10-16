// Pacotes

// biblioteca
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import com.iterasys.Main;


// classe

public class TesteCalculadora {
    // atributos


    // funcoes e metodo
    @Test 
    public void testeSomar1(){
        // AAA - Arrange / Act / Assert (preparar, agir, confirmar)
        // CEV - configura / executa / valida

        // configura
        // dados de entrada
        float num1 = 10;
        float num2 = 8;
        // dados de saida / resultado esperado
        float resultadoEsperado = 18;

        // executa
        float resultadoAtual = Main.somar(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test 
    public void testeSomar2(){
        float num1 = 2;
        float num2 = 4;
        float resultadoEsperado = 6;

        float resultadoAtual = Main.somar(num1, num2);
        
        assertEquals(resultadoEsperado, resultadoAtual);
    }


    // DDT: Data Driven Testing -> dados
    // Popular: Teste com Massa


    @ParameterizedTest
    @CsvSource(value = {
        "15, 25, 40.0",
        "0, 12, 12.0",
        "-5, 9, 4.0",
        "-7, -8, -15",
        "0.5, 3.7, 4.2"
    }, delimiter = ',')
    public void testeSomarDDT(float num1, float num2, float resultadoEsperado){
        // AAA - Arrange / Act / Assert (preparar, agir, confirmar)
        // CEV - configura / executa / valida

        // configura
        // os dados de entrada e resultado esperado são lidos na massa de teste

        // executa 
        float resultadoAtual = Main.somar(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "csv/somar.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeSomarCSV(float num1, float num2, float resultadoEsperado){
        // AAA - Arrange / Act / Assert (preparar, agir, confirmar)
        // CEV - configura / executa / valida

        // configura
        // os dados de entrada e resultado esperado são lidos na massa de teste

        // executa 
        float resultadoAtual = Main.somar(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }












} 



package edu.escuelaing.arem;

import junit.framework.Assert;
import junit.framework.TestCase;

import edu.escuelaing.arem.ConversionTemp;
import edu.escuelaing.arem.Conversor;
import junit.framework.TestResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;

public class ConversionTempTest {

    @Test

    public void deberiaConvertirCelsiusAFahrenheitPositivo() {
        Conversor conversor = new Conversor(30, "Celsius");
        conversor.calcularTemperatura();
        float res = conversor.getRespuesta();
        Assertions.assertTrue(res == 86);
    }

    @Test

    public void deberiaConvertirFahrenheitACelsiusPositivo() {
        Conversor conversor = new Conversor(50, "Fahrenheit");
        conversor.calcularTemperatura();
        float res = conversor.getRespuesta();
        Assertions.assertTrue(res == 10);
    }

    @Test

    public void deberiaConvertirCeroCelsius(){
        Conversor conversor = new Conversor(0, "Celsius");
        conversor.calcularTemperatura();
        float res = conversor.getRespuesta();
        Assertions.assertTrue(res == 32);

    }
    /*
    @Test

    public void deberiaConvertirCelsiusAFahrenheitNegativo() {
        Conversor conversor = new Conversor(-30, "Celsius");
        conversor.calcularTemperatura();
        float res = conversor.getRespuesta();
        Assertions.assertTrue(res == 22);
    }
    */

}

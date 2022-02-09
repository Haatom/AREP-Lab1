package edu.escuelaing.arem;


/**
 * @author Nicolas Camacho Hurtado
 * @version 1.0
 * @project ConversionTemp
 */

public class Conversor {

    private float numero;
    private String tipo;
    private float respuesta;


    public Conversor(float numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    /**
     * Metodo que realiza el calculo de las temperaturas
     */

    public void calcularTemperatura(){
        if (tipo.equals("Celsius")){
            System.out.println(9/5);
            this.respuesta =  (numero * (float) 9/5) + 32;;
        }
        else if (tipo.equals("Fahrenheit")){
            this.respuesta = (numero - 32) * (float) 5/9;
        }
    }

    public float getRespuesta() {
        return respuesta;
    }

}

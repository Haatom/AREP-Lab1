package edu.escuelaing.arem;

public class Conversor {
    private float numero;
    private String tipo;
    private float respuesta;



    public Conversor(float numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public void calcularTemperatura(){
        if (tipo.equals("Celsius")){
            System.out.println(9/5);
            this.respuesta =  (numero * (float) 9/5) + 32;;
        }
        else if (tipo.equals("Fahrenheit")){
            this.respuesta = (numero - 32) * (float) 5/9;
        }
    }



    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(float respuesta) {
        this.respuesta = respuesta;
    }
}

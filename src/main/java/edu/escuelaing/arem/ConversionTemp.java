package edu.escuelaing.arem;
import org.json.JSONObject;

import static spark.Spark.*;

/**
 * @author Nicolas Camacho Hurtado
 * @version 1.0
 * @project ConversionTemp
 */
public class ConversionTemp
{

    /**
     * Metodo principal que realiza la petición del API
     */
    public static void main(String[] args) {
        port(getPort());
        staticFileLocation("/public");
        get("/convertidor/:tipo/:numero", (req, res) -> conversor( req.params(":tipo"), req.params(":numero")));
    }

    /**
     * Metodo que retorna un JSON mediante un objeto el cual contiene los valores y la respuesta de la conversion
     *
     * @param tipo ,   atributo que indica el tipo de Temperatura (Celsius o Fahrenheit)
     * @param numero , atributo que indica el valor de la temperatura a convertir
     * @return JSONObject, Objeto de tipo JSON que contiene los atributos del objeto conversor en los que se incluye la respuesta de la conversión
     */

    public static JSONObject conversor(String tipo, String numero){
        Conversor conversor = new Conversor( Float.parseFloat(numero), tipo);
        conversor.calcularTemperatura();
        JSONObject respuestaJSON = new JSONObject();
        respuestaJSON.put("respuesta",conversor.getRespuesta());
        return  respuestaJSON;
    }

    /**
     * Metodo que retorna el puerto usado en el proyecto
     * @return int, Numero de puerto
     */

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set

    }
}

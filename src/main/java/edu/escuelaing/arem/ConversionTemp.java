package edu.escuelaing.arem;
import org.json.JSONObject;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class ConversionTemp
{
    public static void main(String[] args) {
        port(getPort());
        staticFileLocation("/public");
        get("/convertidor/:tipo/:numero", (req, res) -> conversor( req.params(":tipo"), req.params(":numero")));
    }

    public static JSONObject conversor(String tipo, String numero){
        Conversor conversor = new Conversor( Float.parseFloat(numero), tipo);
        conversor.calcularTemperatura();
        JSONObject respuestaJSON = new JSONObject();
        respuestaJSON.put("respuesta",conversor.getRespuesta());
        return  respuestaJSON;
    }


    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set

    }
}

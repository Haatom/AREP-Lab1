package edu.escuelaing.arem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConcurrentTest {
    @Test
    public void ConcurrentsThread()  {
        for(int i = 0; i <= 10; i++) {
            new Thread(new ThreadConnection()).start();
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class ThreadConnection extends Thread{
        @Override
        public void run() {
            try {
                String GET_URL = "https://conversortemperatura.herokuapp.com/";
                URL obj = new URL(GET_URL);
                HttpURLConnection testConnection = (HttpURLConnection) obj.openConnection();
                testConnection.setRequestMethod("GET");
                String USER_AGENT = "Mozilla/5.0";
                testConnection.setRequestProperty("User-Agent", USER_AGENT);
                int codigo = testConnection.getResponseCode();
                Assertions.assertEquals(codigo, 200);
            }catch (IOException e){
            }
        }
    }
}

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarDivisa {
    public Divisa buscarDivisa(String divisaEntrada, String divisaSalida){
        URI direccion = URI.create
                ("https://v6.exchangerate-api.com/v6/246485637811366f950fedf7/pair/"+divisaEntrada+"/"+divisaSalida);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Divisa resultado = new Gson().fromJson(response.body(), Divisa.class);
            return resultado;

        } catch (Exception e) {
            throw new RuntimeException("No encontré esa divisa");
        }
    }

}

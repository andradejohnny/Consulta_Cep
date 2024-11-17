
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");
        // Cria uma URI para acessar a API ViaCEP com o CEP fornecido.

        HttpClient client = HttpClient.newHttpClient();
        // Cria um cliente HTTP para realizar a requisição.

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        // Constrói a requisição HTTP com a URI do endereço.

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // Envia a requisição e captura a resposta em formato de texto (JSON).

            return new Gson().fromJson(response.body(), Endereco.class);
            // Converte o JSON da resposta em um objeto do tipo Endereco.
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP!");
            // Lança uma exceção personalizada em caso de erro.
        }
    }
}

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // Cria um objeto Gson configurado para formatar o JSON com identação.

        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        // Cria um arquivo com o nome baseado no CEP do endereço.

        escrita.write(gson.toJson(endereco));
        // Converte o objeto 'Endereco' em JSON e escreve no arquivo.

        escrita.close();
        // Fecha o arquivo para liberar os recursos do sistema.
    }
}
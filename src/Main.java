import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Cria um objeto Scanner para capturar a entrada do usuário.
        String busca = ""; // Inicializa a variável que armazenará o CEP digitado pelo usuário.

        out.println("Digite o CEP para Busca: "); // Exibe uma mensagem solicitando o CEP.
        busca = leitura.nextLine(); // Lê a entrada do usuário e armazena na variável 'busca'.

        ConsultaCep consultaCep = new ConsultaCep(); // Instancia a classe que será usada para buscar o endereço.

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(busca); // Chama o método para buscar o endereço a partir do CEP.
            System.out.println(novoEndereco); // Exibe o endereço retornado.

            GeradorDeArquivo gerador = new GeradorDeArquivo(); // Instancia a classe responsável por salvar o arquivo JSON.
            gerador.salvaJson(novoEndereco); // Salva os dados do endereço em um arquivo JSON.
        } catch (RuntimeException | IOException e) {
            // Trata exceções que possam ocorrer, seja na busca ou na criação do arquivo.
            out.println(e.getMessage()); // Exibe a mensagem de erro.
            out.println("Finalizando a aplicação!"); // Informa que a aplicação será finalizada.
        }
    }
}

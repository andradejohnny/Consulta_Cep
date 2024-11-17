
# Consulta de Endereço via CEP

Este projeto é uma aplicação Java que permite ao usuário buscar informações de endereço a partir de um CEP fornecido. Ele utiliza a API [ViaCEP](https://viacep.com.br/) para realizar a consulta e salva os dados retornados em um arquivo no formato JSON.

---

## 🚀 **Funcionalidades**

- Solicita ao usuário um CEP e realiza a consulta na API ViaCEP.
- Retorna os dados do endereço, incluindo logradouro, cidade, estado e complemento.
- Salva os dados do endereço em um arquivo JSON nomeado com o CEP consultado.

---

## 🛠️ **Tecnologias Utilizadas**

- **Java 17** ou superior
- Biblioteca [Gson](https://github.com/google/gson) para manipulação de JSON.
- API HTTP do Java para requisições REST.
- Scanner para entrada de dados do usuário.

---

## 📂 **Estrutura do Projeto**

- **`Main`**: Classe principal que solicita o CEP, realiza a consulta e salva os dados no formato JSON.
- **`ConsultaCep`**: Classe responsável por acessar a API ViaCEP e converter o JSON retornado em um objeto Java.
- **`Endereco`**: Record que define a estrutura do endereço (logradouro, cep, localidade, complemento, uf).
- **`GeradorDeArquivo`**: Classe responsável por salvar os dados do endereço em um arquivo JSON.

---

## 📋 **Pré-requisitos**

1. Ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Configurar uma IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/).
3. Adicionar a biblioteca Gson ao projeto. 
   - **Maven**: Adicione a dependência abaixo ao seu `pom.xml`:
     ```xml
     <dependency>
         <groupId>com.google.code.gson</groupId>
         <artifactId>gson</artifactId>
         <version>2.8.9</version>
     </dependency>
     ```
   - **Sem Maven**: Baixe o JAR do [site oficial](https://github.com/google/gson) e inclua no projeto.

---

## ⚙️ **Como Executar**

1. Clone este repositório:
   ```bash
   git clone [https://github.com/andradejohnny/Consulta_Cep]
   cd nome-do-repositorio
   ```

2. Compile o código:
   ```bash
   javac -cp .:gson-2.8.9.jar Main.java
   ```

3. Execute o programa:
   ```bash
   java -cp .:gson-2.8.9.jar Main
   ```

4. Digite o CEP quando solicitado. Exemplo:
   ```text
   Digite o CEP para Busca: 01001000
   ```

5. Verifique o arquivo JSON gerado no diretório do projeto. Ele será nomeado com o CEP digitado, por exemplo: `01001000.json`.

---

## 🚧 **Possíveis Erros**

- **CEP inválido**: Certifique-se de digitar um CEP válido e no formato correto (apenas números).
- **Erro de conexão**: Verifique sua conexão com a internet e se o serviço ViaCEP está disponível.

---

## 📖 **Exemplo de Uso**

### Entrada:
```text
Digite o CEP para Busca: 01001000
```

### Saída no Console:
```text
Endereco[logradouro=Praça da Sé, cep=01001000, localidade=São Paulo, complemento=Lado ímpar, uf=SP]
```

### Arquivo JSON gerado:
```json
{
  "logradouro": "Praça da Sé",
  "cep": "01001000",
  "localidade": "São Paulo",
  "complemento": "Lado ímpar",
  "uf": "SP"
}
```

---

## 🤝 **Contribuições**

Contribuições são sempre bem-vindas! Siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para sua nova feature:
   ```bash
   git checkout -b feature/nova-feature
   ```
3. Faça o commit das suas alterações:
   ```bash
   git commit -m "Descrição da feature"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin feature/nova-feature
   ```
5. Abra um Pull Request.


---

**Desenvolvido com 💻 e ☕ por [Johnny Andrade].**

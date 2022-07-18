import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;
public class App {
    public static void main(String[] args) throws Exception {

// Realizar uma conexão HTTP: & Busacar os 'Top 250 Filmes'.
        String url = "https://alura-filmes.herokuapp.com/conteudos";
        URI endereco = URI.create(url);
        var Client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = Client.send(request, BodyHandlers.ofString());
        String body = response.body();
       // System.out.println(body);

// Extrair só os dados interressantes (Titulo, Poster, classificação).
        var parser = new JsonParser();
        List<Map<String, String>> listaDeDilmes = parser.parse(body);

// Exibir e manipular os dados.
        System.out.println("+-------------------------------------------------------");
        for (Map<String, String> filme : listaDeDilmes) {
            System.out.println("| " + filme.get("rank") + "- " + filme.get("title"));
            //imDbRatingCount crew System.out.println(filme.get("image"));
            System.out.println("| Nota: " + filme.get("imDbRating") + "                 " + "Ano de Lançamento: " + filme.get("year"));
            System.out.println("| Quantidade de Votos: " + filme.get("imDbRatingCount"));
            System.out.println("| Autores: " + filme.get("crew"));
            System.out.println("|-----------------------[Poster]------------------------");
            System.out.println("| " + filme.get("image"));
            System.out.println("|-------------------------------------------------------");
        }
    }
}

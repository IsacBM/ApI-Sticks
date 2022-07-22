import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
public class App {
    public static void main(String[] args) throws Exception {

// Realizar uma conexão HTTP: & Busacar os 'Top 250 Filmes'.
        // API da IMDB;
        String url = "https://alura-filmes.herokuapp.com/conteudos";
        // API da NASA;
        //String url = "https://api.mocki.io/v2/549a5d8b/NASA-APOD";
        
        HttpCliente http = new HttpCliente();
        String json = http.buscaDados(url);

// Extrair só os dados interressantes (Titulo, Poster, classificação).
        var parser = new JsonParser();
        List<Map<String, String>> listaDeConteudos = parser.parse(json);

// Exibir e manipular os dados.
        ExtratorConteudoApIDaNasa extrator = new ExtratorConteudoApIDaNasa();
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
        System.out.println("+---------------------------------------------------------------");
        var geradora = new GeradoraDeFigurinhas();
        //for (Map<String,String> conteudo : listaDeConteudos) {
          for (int i = 0; i < 3; i++) {
            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.getTitulo());
            System.out.println();

          /*  System.out.println("| Rank: " + conteudo.get("rank") + "  " + titulo);
            //System.out.println();
            //imDbRatingCount crew System.out.println(filme.get("image"));
            System.out.println("| Nota: " + conteudo.get("imDbRating") + "                 " + "Ano de Lançamento: " + conteudo.get("year"));
            System.out.println("| Quantidade de Votos: " + conteudo.get("imDbRatingCount"));
            System.out.println("| Autores: " + conteudo.get("crew"));
            System.out.println("|---------------------------------------------------------------");
       */
        }
    }
}
//

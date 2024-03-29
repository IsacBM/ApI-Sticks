//
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorConteudoDoIMDB implements ExtratorDeConteudo {
    
    public List <Conteudo> extraiConteudos(String json) {
// Extrair só sos dados que interresam (Titulo, poster, Classificação.)
    var parser = new JsonParser();
    List<Map<String , String>> listaDeAtributos = parser.parse(json);

    List<Conteudo> conteudos = new ArrayList<>(); 

// popular a lista de conteudos;
    for (Map<String, String> atributos : listaDeAtributos) {
        String titulo = atributos.get("title");
        String urlImagem = atributos.get("image").replaceAll("(@+) (.*).jpg$", "$1.jpg");
  
        var conteudo = new Conteudo(titulo, urlImagem);

        conteudos.add(conteudo);

    }

    return conteudos;
    }
}
//

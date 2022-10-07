# IMERSÃO JAVA
> Status do Projeto: Em desenvolvimento :hourglass:
<!-- Status do Projeto: Concluido :heavy_check_mark:-->
A **`Imersão Java`**, realizada pela **[Alura](https://www.alura.com.br/)**, se constituiu em 5 aulas de programação, gratuitas, para que programadores conseguissem desenvolver do zero sua primeira aplicação em Java, progredindo na carreira e ampliando ou começando o seu portfólio.

## | Links Utilizados:
• **[Endpoint da API do IMDB](https://imdb-api.com/api#Top250Movies-header)** que devolve os 250 melhores filmes. <br>
• **[Endpoint alternativo a API do IMDB](https://alura-filmes.herokuapp.com/conteudos)**. <br>
• **[Documentação da API do IMDB](https://imdb-api.com/api)**. <br>
• **[Documentação da Classe HttpRequest](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html)**. <br>
• **[Documentação das APIs da NASA](https://api.nasa.gov/)**. <br>
• **[API da Foto Astronômica do dia da NASA](https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY)**. <br>

***

# AULA 01 - CONSUMINDO UMA API DE FILMES COM JAVA
Aplicação criada durante a **`Imersão Java`**, realizada pela **[Alura](https://www.alura.com.br/)**, essa aplicação vai consumir a **[API do IMDb](https://imdb-api.com/)** e exibir os 250 filmes/séries mais populares, destacando seus pôsteres, classificação, quantidade de votos é seus autores... Isso tudo sem utilizar nenhuma biblioteca externa!

## | Materiais Complementares da Aula 01:
• Artigo na Alura: **[O que é JSON?](https://www.alura.com.br/artigos/o-que-e-json)**. <br>
• Artigo na Alura: **[Decore o terminal com cores e emojis](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html)**. <br>
• Artigo na Alura: **[Aplicações Java com o VS Code](https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code)**. <br>

## | Desafios da **Aula 01**:
- [x] **`[Desafio]`** Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.<br>
- [x] **`[Desafio]`** Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!<br>
- [ ] **`[Desafio]`** Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.  `[Em Andamento]` <br>
- [ ] **`[Desafio]`** Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON.  `[Em Andamento]` <br>
- [ ] **`[Desafio]`** : Criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.  `[Em Andamento]` <br>

***

# AULA 02 - GERANDO FIGURINHAS PARA WHATSAPP
 Desenvolvendo um gerador de figurinhas em cima da aplicação e explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!

## | Materiais Complementares da Aula 02:
• Aula do Curso da Alura: **[Java Polimorfismo: entenda herança e interfaces](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo)**. <br>
• Apostila da Alura: **[Java e Orientação a Objetos](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io)**. <br>

## | Desafios da **Aula 02**:
- [ ] **`[Desafio]`** Ler a documentação da classe abstrata InputStream. <br>
- [ ] **`[Desafio]`** Centralizar o texto na figurinha. <br>
- [ ] **`[Desafio]`** Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas! <br>
- [ ] **`[Desafio]`** Criar diretório de saída das imagens, se ainda não existir. <br>
- [ ] **`[Desafio]`** Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes. <br>
- [ ] **`[Desafio]`** Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha! <br>
- [ ] **`[Desafio]`** Colocar contorno (outline) no texto da imagem. <br>
- [ ] **`[Desafio]`** Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado. <br>
- [ ] **`[Desafio]`** Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB. <br>
- [ ] **`[Desafio]`** Usar alguma biblioteca de manipulação de imagens como **[OpenCV](https://github.com/opencv-java)** pra extrair imagem principal e contorná-la. <br>

***

# AULA 03 - LIGANDO AS PONTAS, REFATORAÇÃO E ORIENTAÇÃO A OBJETOS
Aproveitando para melhorar nosso código com as refatorações necessárias para torná-lo mais flexível e fácil de entender.

## | Materiais Complementares da Aula 03:
• Artigo na Alura: **[Como não aprender Java e Orientação a Objetos: herança](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca)**. <br>
• Podcast Hipsters.tech sobre: **[Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453)**. <br>
• Podcast Hipsters.tech sobre: **[Design Patterns](https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345)**. <br>
• Podcast Hipsters.tech sobre: **[SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649)**. <br>

## | Desafios da **Aula 03**:
- [ ] **`[Desafio]`** Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16 <br>
- [ ] **`[Desafio]`** Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP <br>
- [ ] **`[Desafio]`** Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra <br>
- [ ] **`[Desafio]`** Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado <br>
- [ ] **`[Desafio]`** Consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: **[APIs](https://github.com/public-apis/public-apis)**. <br>

***

## Instrutores e Instrutoras da Alura nessa Imersão:
<div className="d-flex justify-content-center">
 
| [<img src="https://avatars.githubusercontent.com/u/258331?v=4" width=115><br><sub>Alexandre Aquiles</sub>](https://github.com/alexandreaquiles) |  [<img src="https://avatars.githubusercontent.com/u/66698429?v=4" width=115><br><sub>Jacqueline Oliveira</sub>](https://github.com/jacqueline-oliveira) |  [<img src="https://avatars.githubusercontent.com/u/71636?v=4" width=115><br><sub>Paulo Silveira</sub>](https://github.com/peas) |
| :---: | :---: | :---: |

</div>
<h4 align="center">
<strong>#ImersãoJava</strong>:heart: <br>
</h4>

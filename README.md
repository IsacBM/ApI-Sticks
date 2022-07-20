# IMERSÃO JAVA
A **`Imersão Java`**, realizada pela **[Alura](https://www.alura.com.br/)**, se constituiu em 5 aulas de programação, gratuitas, para que programadores conseguissem desenvolver do zero sua primeira aplicação em Java, progredindo na carreira e ampliando ou começando o seu portfólio.

## Links Utilizados:
• [Endpoint da API do IMDB](https://imdb-api.com/api#Top250Movies-header) que devolve os 250 melhores filmes. <br>
• [Endpoint alternativo a API do IMDB](https://alura-filmes.herokuapp.com/conteudos). <br>
• [Documentação da API do IMDB](https://imdb-api.com/api). <br>
• [Documentação da Classe HttpRequest](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html). <br>
• [Documentação das APIs da NASA](https://api.nasa.gov/). <br>
• [API da Foto Astronômica do dia da NASA](https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY). <br>

# AULA 01 - CONSUMINDO UMA API DE FILMES COM JAVA
Aplicação criada durante a **`Imersão Java`**, realizada pela **[Alura](https://www.alura.com.br/)**, essa aplicação vai consumir a **[API do IMDb](https://imdb-api.com/)** e exibir os 250 filmes/séries mais populares, destacando seus pôsteres, classificação, quantidade de votos é seus autores... Isso tudo sem utilizar nenhuma biblioteca externa!

## Materiais Complementares da Aula 01:
• Artigo na Alura: [O que é JSON?](https://www.alura.com.br/artigos/o-que-e-json). <br>
• Artigo na Alura: [Decore o terminal com cores e emojis](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html). <br>
• Artigo na Alura: [Aplicações Java com o VS Code](https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code). <br>

## Desafios da **Aula 01** que já foram realizados/ainda estão sendo realizados:
1 - `[Desafio]` Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.<br>
2 - `[Desafio]` Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!<br>
3 - `[Desafio]` Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.  `[Em Andamento]` <br>
4 - `[Desafio]` Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON.  `[Em Andamento]` <br>
5 - `[Desafio]` : Criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.  `[Em Andamento]` <br>

# AULA 02 - GERANDO FIGURINHAS PARA WHATSAPP
 Desenvolvendo um gerador de figurinhas em cima da aplicação e explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!

## Materiais Complementares da Aula 02:
• Aula do Curso da Alura: [Java Polimorfismo: entenda herança e interfaces](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo). <br>
• Apostila da Alura: [Java e Orientação a Objetos](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io). <br>

## Desafios da **Aula 02** que já foram realizados/ainda estão sendo realizados:
1 - `[Desafio]` Ler a documentação da classe abstrata InputStream. <br>
2 - `[Desafio]` Centralizar o texto na figurinha. <br>
3 - `[Desafio]` Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas! <br>
4 - `[Desafio]` Criar diretório de saída das imagens, se ainda não existir. <br>
5 - `[Desafio]` Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes. <br>
6 - `[Desafio]` Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha! <br>
7 - `[Desafio]` Colocar contorno (outline) no texto da imagem. <br>
8 - `[Desafio]` Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado. <br>
9 - `[Desafio]` Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB. <br>
10 - `[Desafio]` Usar alguma biblioteca de manipulação de imagens como **[OpenCV](https://github.com/opencv-java)** pra extrair imagem principal e contorná-la. <br>

# AULA 03 - LIGANDO AS PONTAS, REFATORAÇÃO E ORIENTAÇÃO A OBJETOS
Aproveitando para melhorar nosso código com as refatorações necessárias para torná-lo mais flexível e fácil de entender.

## Materiais Complementares da Aula 03:
• Artigo na Alura: [Como não aprender Java e Orientação a Objetos: herança](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca). <br>
• Podcast Hipsters.tech sobre: [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453). <br>
• Podcast Hipsters.tech sobre: [Design Patterns](https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345). <br>
• Podcast Hipsters.tech sobre: [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649). <br>

## Desafios da **Aula 03** que já foram realizados/ainda estão sendo realizados:
1 - `[Desafio]` Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16 <br>
2 - `[Desafio]` Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP <br>
3 - `[Desafio]` Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra <br>
4 - `[Desafio]` Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado <br>
5 - `[Desafio]` Consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: [clique aqui](https://github.com/public-apis/public-apis). <br>

## Instrutores e Instrutoras da Alura nessa Imersão:

![Jac](https://user-images.githubusercontent.com/91500212/179819791-9141102f-57af-4cdc-9557-2cfd2845b033.png)
<p float="center">
<a href="https://www.instagram.com/jacque.tech/" target="_blank"><img src="https://img.shields.io/badge/Instagram-1a1b27?style=for-the-badge&logo=instagram&logoColor=hotpink" align="center" alt="Instagram" height="30"  target="_blank"></a> </div>
  <a href="https://www.linkedin.com/in/jacqueline-r-oliveira/" target="_blank"><img align="center" alt="Linkedin" height="30" src="https://img.shields.io/badge/linkedin-1a1b27.svg?&style=for-the-badge&logo=linkedin&logoColor=blue" target="_blank"></a>
  </div>
  </p>
  
![Ale](https://user-images.githubusercontent.com/91500212/179819849-67a31bcb-4deb-47cd-9eee-2994d94c3d09.png)
<p float="center">
<a href="https://www.instagram.com/aquiles3137/" target="_blank"><img src="https://img.shields.io/badge/Instagram-1a1b27?style=for-the-badge&logo=instagram&logoColor=hotpink" align="center" alt="Instagram" height="30"  target="_blank"></a> </div>
  <a href="https://www.linkedin.com/in/alexandreaquiles/" target="_blank"><img align="center" alt="Linkedin" height="30" src="https://img.shields.io/badge/linkedin-1a1b27.svg?&style=for-the-badge&logo=linkedin&logoColor=blue" target="_blank"></a>
  </div>
  </p>

![Sil](https://user-images.githubusercontent.com/91500212/179819864-2ba034c0-4632-4c2f-b232-a629d1ee48da.png)
<p float="center">
<a href="https://www.instagram.com/paulo_hipster/" target="_blank"><img src="https://img.shields.io/badge/Instagram-1a1b27?style=for-the-badge&logo=instagram&logoColor=hotpink" align="center" alt="Instagram" height="30"  target="_blank"></a> </div>
  <a href="https://www.linkedin.com/in/paulosilveira" target="_blank"><img align="center" alt="Linkedin" height="30" src="https://img.shields.io/badge/linkedin-1a1b27.svg?&style=for-the-badge&logo=linkedin&logoColor=blue" target="_blank"></a>
  </div>
  </p>

#### #ImersãoJava

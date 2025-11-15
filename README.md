# Login.UiUx
Análise de Código em Java

Esta atividade teve como finalidade aplicar técnicas de teste de caixa branca sobre um código Java fornecido pelo professor.
O objetivo principal foi compreender o fluxo interno do programa, calcular sua complexidade ciclomática e identificar os caminhos básicos existentes.

✔️ Etapas Desenvolvidas

📄 Preenchimento da planilha de análise contendo 5 perguntas sobre o código
🧠 Construção do Grafo de Fluxo do programa
🧮 Cálculo da Complexidade Ciclomática
🧭 Identificação dos Caminhos Básicos
🧰 Execução e verificação prática do comportamento do código

📊 Planilha de Análise
![planilha](https://github.com/Wellington-Henriquee/Login.UiUx/raw/178889f7be4873daee58f94bac5a48847227366b/planilha)



🧩 Grafo de Fluxo

![Grafo de Fluxo](https://raw.githubusercontent.com/Wellington-Henriquee/Login.UiUx/main/grafo.drawio.png)


🧮 Cálculo da Complexidade Ciclomática

A complexidade ciclomática representa o número de caminhos independentes existentes no código.
A fórmula utilizada segue Gonçalves et al. (2019):

M = E - N + 2P


Onde:

E = número de arestas

N = número de nós

P = número de componentes conectados (geralmente = 1)

🔹 Cálculo Identificado
Elemento	Descrição	Valor
E	Arestas do grafo	11
N	Nós identificados	12
P	Componentes conectados	1

Aplicando a fórmula:

M = 11 - 12 + 2(1) = 1


Considerando as estruturas condicionais reais do código (ifs e exceções):

M = número de decisões + 1 = 4 + 1 = 5

✅ Complexidade ciclomática final: 5


🧭 Caminhos Básicos do Código
Caminho	Fluxo	Descrição
![Caminhos Básicos](https://raw.githubusercontent.com/Wellington-Henriquee/Login.UiUx/main/caminhobasico.png)

📈 Interpretação da Métrica

Uma complexidade ciclomática igual a 5 indica que são necessários cinco testes distintos para garantir a cobertura completa do fluxo lógico.
Esse tipo de análise auxilia na:

identificação de caminhos críticos,

melhoria da estrutura do código,

prevenção de falhas lógicas,

criação de testes mais completos e eficientes.

🗄️ Resultado da Execução do Sistema

*Usuário encontrado*

![Usuário encontrado](https://raw.githubusercontent.com/Wellington-Henriquee/Login.UiUx/main/loginrealizado.png)

*Usuário não encontrado*

![Login inválido](https://raw.githubusercontent.com/Wellington-Henriquee/Login.UiUx/main/logininvalido.png)


*Conexão Banco De Dados*

![Banco de Dados](https://raw.githubusercontent.com/Wellington-Henriquee/Login.UiUx/main/banco.png)


💡 Conclusão

A análise permitiu compreender de forma detalhada o comportamento interno do código, destacando seus pontos de decisão e garantindo maior confiabilidade através dos testes realizados.
Com o cálculo da complexidade ciclomática, a criação do grafo de fluxo e a verificação prática, foi possível validar e documentar o funcionamento correto do programa.

👩‍💻 Tecnologias Utilizadas

☕ Java (17+)
🧾 GitHub para documentação
🧠 Teste de Caixa Branca (White Box Testing)
🧱 JDBC — MySQL Connector/J
🌐 WampServer / phpMyAdmin

📚 Referência

PRESSMAN, Roger S.; MAXIM, Bruce R. Engenharia de Software: uma abordagem profissional. 9. ed. Porto Alegre: AMGH, 2021.

✨ Autor

Wellington Henrique

Disciplina: Teste de Caixa Branca

Instituição: Facens
Data: 13 / 11/ 2025

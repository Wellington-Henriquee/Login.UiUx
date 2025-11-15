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

<img width="871" height="391" alt="grafo drawio" src="https://github.com/user-attachments/assets/a0bd53d3-a1b8-4cbc-afb0-9ba7b99a02c6" />



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
<img width="1063" height="141" alt="Captura de tela 2025-11-15 101640" src="https://github.com/user-attachments/assets/4d794d16-d5dd-41b4-9a7d-628873d55517" />


📈 Interpretação da Métrica

Uma complexidade ciclomática igual a 5 indica que são necessários cinco testes distintos para garantir a cobertura completa do fluxo lógico.
Esse tipo de análise auxilia na:

identificação de caminhos críticos,

melhoria da estrutura do código,

prevenção de falhas lógicas,

criação de testes mais completos e eficientes.

🗄️ Resultado da Execução do Sistema

*Usuário encontrado*

<img width="328" height="64" alt="Captura de tela 2025-11-15 101903" src="https://github.com/user-attachments/assets/259ab53f-2dec-40fb-a609-de2ea07e4cca" />


*Usuário não encontrado*

<img width="262" height="62" alt="Captura de tela 2025-11-15 102125" src="https://github.com/user-attachments/assets/40419a1b-41d0-42ae-9b71-20e49a3d0df1" />



*Conexão Banco De Dados*


<img width="714" height="424" alt="Captura de tela 2025-11-15 101816" src="https://github.com/user-attachments/assets/122a7760-c3d7-4c7d-8874-f7c1ee5a6a9a" />


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

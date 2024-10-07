# Function
>São rotinas definidas no banco de dados, identificadas 
>por um nome pelo qual podem ser invocadas.

<br>

### Para que usar uma Funtion ?

> Podem executar instruções, receber parâmetros e 
> retornar valores com tipos de dados definidos.

<br>

> Qualquer coleção de comandos na linguagem SQL pode ser empacotada e definida como uma função. Além das consultas, os comandos podem incluir consultas de modificação de dados

<br>

> Se você precisa realizar a mesma operação em diversas linhas ou tabelas, uma função pode ser uma forma eficiente de encapsular essa operação.

<br>

### Diferença entre Funções e Procedures?

>A diferença mais notável é que as funções podem ser utilizadas em uma instrução SELECT, de modo que podem ser unidas a tabelas, views e até outras funções. Os stored procedures não podem ser usados dessa maneira.

<br>

> Functions são usadas principalmente para retornar um valor ou conjunto de valores. Elas costumam ser utilizadas em consultas SQL para cálculos ou formatações de dados, ja as Procedures elas podem ou não retornar valores.

<br>

### Vantagens:

- Funções permitem que você escreva uma lógica uma vez e a reutilize em várias consultas. Isso elimina a duplicação de código e torna a manutenção mais fácil.  

- Consultas SQL podem ficar muito longas e difíceis de entender, especialmente quando envolvem muitos cálculos. Colocar esses cálculos em funções nomeadas torna as consultas mais simples e fáceis de ler.  

- Se a lógica encapsulada em uma função precisar ser alterada, você só precisará alterar a função em um único lugar, e todas as consultas que dependem dela serão automaticamente atualizadas.

### Desvantagens:

- Funções podem impactar negativamente a performance se não forem bem otimizadas, especialmente se forem chamadas dentro de grandes consultas que processam grandes volumes de dados.  

- Necessidade de maior conhecimento da sintaxe do banco de dados para escrita de rotinas em SQL (nível avançado).

<br>

## Criando uma Function 
sintaxe:
```SQL
CREATE FUNCTION <Nome da Funtion> (lista_parametros) 
RETURNS <Tipo de retorno>
LANGUANGE plpgsql AS
$$ 
DECLARE
<Declarar as variaveis>
BEGIN
<Logica>
END;
$$
``` 

### Exemplo 1
> Supondo que crie uma função para retornar o lucro de uma venda
```SQL
CREATE FUNCTION lucro(cod INTEGER)
RETURNS NUMERIC
LANGUAGE plpgsql AS
$$
DECLARE 
  lucro NUMERIC;
BEGIN
  SELECT (valor - custo) INTO lucro
  FROM Venda 
  WHERE codigo = cod;
  RETURN lucro;
END;
$$
``` 
<br>

### Exemplo 2
> Supondo que queira as vendas de um detereminado periodo

```SQL
CREATE FUNCTION contaVendas(inicio DATE, fim DATE)
RETURNS INTEGER
LANGUAGE plpgsql AS
$$
DECLARE 
  vendas INTEGER;
BEGIN
  SELECT COUNT(1) INTO vendas 
  FROM venda 
  WHERE data_venda BETWEEN inicio AND fim;  
  RETURN vendas;
END; 
``` 
<br>

## Alterando uma FUNCTION
> Para atualizar o código de uma Function, basta usar o 
> comando CREATE OR REPLACE FUNCTION

<br>

Sintaxe:

```SQL
CREATE OR REPLACE FUNTION <Nome da Função> (Lista de paramentros)
RETURNS <Tipo de Retorno>
LANGUAGE plpgsql AS
$$
  DECLARE
  <Declaração de variaveis>
  BEGIN
  <Logica>
  END;
$$
``` 

<br>

## Excluindo FUNCTION
>Assim como outras estruturas no banco de dados, para 
>exclusão de Funtion basta fazer: 

sintaxe:

```SQL
 DROP FUNCTION <Nome da Function>;
``` 

Exemplo:

```SQL
 DROP FUNTION lucro
``` 


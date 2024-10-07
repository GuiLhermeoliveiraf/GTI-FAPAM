# Procedure

> Um procedimento pode executar uma série de instruções e receber parâmetros.

<br>

###  Para que usar uma Procedure?

> Muitas vezes é requerido várias consultas e atualizações 
> no BD, o que acarreta um maior consumo de recursos 
> pela aplicação (desempenho, memória, etc). No caso de 
> aplicações web, isso se torna mais visível, devido a maior 
> quantidade de informações que precisam trafegar pela 
> rede e de requisições ao servidor. 

<br>

> Uma boa forma de contornar ou atenuar esse consumo 
> de recursos diretamente pela aplicação é transferir parte 
> do processamento para o BD. Assim, considerando que 
> as máquinas servidoras geralmente têm configurações de 
> hardware mais robustas (e nada se pode garantir com 
> relação às máquinas clientes), essa pode ser uma “saída” 
> a se considerar.  

<br>

### Vantagens:

- Simplificação da execução de instruções SQL pela aplicação.  
- Transferência de parte da responsabilidade de processamento para o servidor.  
- Facilidade na manutenção, reduzindo a quantidade de alterações na aplicação.

### Desvantagens:

- Necessidade de maior conhecimento da sintaxe do 
banco de dados para escrita de rotinas em SQL (nível 
avançado). 
- As rotinas ficam mais facilmente acessíveis. Alguém que 
tenha acesso ao banco de dados poderá visualizar e 
alterar o código.
 
<br>

## Criando uma Procedure
Sintaxe:
```SQL
CREATE PROCEDURE <Nome da Procedure>(paramentros)
LANGUAGE SQL
AS 
$$
INSERT INTO <Tabela> VALUES (Valores);
$$;
```

<br>

### Exemplo  
sintaxe:

```SQL
CREATE PROCEDURE inserção_cliente(nome VARCHAR(30), cpf VARCHAR(11), celular VARCHAR(11))
LANGUAGE SQL
AS
$$
INSERT INTO clientes 
VALUES((SELECT MAX(codigo_cliente)+1 FROM cliente), nome, cpf, celular);
$$;
```
<br>

## Chamando a Procedure
> Tendo criado o procedure, chamá-lo é bastante simples.
> Para isso fazemos uso da palavra reservada *CALL*, como mostra o código a seguir:

Sintaxe: 

```SQL
CALL <Nome da Procedure> (Lista de parametros)
``` 
<br>

### Exemplo 

```SQL
CALL inserção_cliente('Guilherme','11111111111','37999751870');
``` 
 
<br>

## Atualizando uma procedure
> Para atualizar o código de uma procedure, basta usar o 
> comando CREATE OR REPLACE PROCEDURE

### Exemplo

```SQL
CREATE OR REPLACE PROCEDURE update_preco(novo_preco NUMERIC, codigo_produto INTERGER)
LANGUAGE SQL
AS 
$$
UPDATE produto 
SET preco = novo_preco
codigo = codigo_produto;
$$;;
``` 

<br>

```SQL
CALL update_preco (150.50, 5)
``` 

<br>

## Excluindo Procedure
>Assim como outras estruturas no banco de dados, para 
>exclusão de procedures basta fazer: 

sintaxe:

```SQL
DROP PROCEDURE <nome da procedure> 
``` 

### Exemplo 

```SQL
DROP PROCEDURE inserção_cliente
``` 

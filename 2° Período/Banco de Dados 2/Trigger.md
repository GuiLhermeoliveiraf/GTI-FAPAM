# Trigger

> Triggers são objetos do banco de dados que, relacionados a 
> certa tabela, permitem a realização de processamentos em 
> consequência de uma determinada ação (inclusão, 
> atualização ou exclusão de um registro).

<br>

### Para que usar Triggers ? 

>  Como forma de automatizar certas ações com base em eventos ocorridos.  

> Triggers podem ser executados ANTES ou DEPOIS das operações de INSERT, UPDATE e DELETE de registros.

> Em aplicações que utilizam bancos de 
> dados, que ações sejam disparadas em resposta como 
> consequência de outras, realizando operações de 
> cálculo, validações e, em geral, surtindo alterações na 
> base de dados AUTOMATICAMENTE.

### Vantagens:

- Parte do processamento que seria executado pela 
aplicação (sistema/software) passa para o banco de 
dados, poupando recursos da máquina cliente.

- Facilita a manutenção, sem que seja necessário 
alterar o código fonte da aplicação

### Desvantagens:

- Requer maior conhecimento de manipulação do 
banco de dados (SQL) para realizar as operações 
internamente (exige mais domínio de conhecimento).

- Caso alguém que não possua grandes 
conhecimentos sobre este tipo de recurso e tiver 
acesso não autorizado ao banco de dados, poderá 
alterar de forma errada o processamento realizado 
pelos gatilhos.

<br>

## Criação de Trigger:
sintaxe:

```SQL
CREARE TRIGGER <Nome da Trigger>
  <Momento_Trigger> <Evento_Trigger> ON <Tabela>
  FOR EACH ROW
  EXECUTE FUNTION <Nome da função>
``` 

- Momento: quando o gatilho será executado. Os 
valores válidos são BEFORE (antes) e AFTER 
(depois) de um evento. 

- Evento: evento que vai disparar o gatilho. Os valores 
possíveis são INSERT, UPDATE e DELETE 
(inserção, atualização e deleção). 

### Exemplo:
>Retirando um produto do estoque a cada venda
```SQL
CREATE OR REPLACE FUNTION venda()
RETURNS TRIGGER
LANGUAGE plpgsql
AS $$ 
BEGIN 
  UPDATE Estoque 
  SET qtd_produtos = qtd_produtos - qtd_vendidas
  WHERE Cod_produto = NEW.Cod_produto
  RETURNS NEW;
END;
$$

CREATE TRIGGER baixa_estoque 
AFTER INSERT ON venda
FOR EACH ROW  
EXECUTE FUNTION venda()

``` 

<br>

## Registros NEW e OLD
> Como os triggers são executados em conjunto com 
> operações de inclusão, atualização e exclusão, é 
> necessário poder acessar os registros que estão 
> sendo incluídos, atualizados ou removidos. Isso 
> pode ser feito através das palavras NEW e OLD. 

- INSERT: o comando “NEW.nome_coluna” permite 
verificar o novo valor inserido ou a ser inserido em 
uma tabela.

- DELETE: o operador “OLD.nome_coluna” permite 
verificar o antigo valor excluído ou a ser excluído em 
uma tabela.

- UPDATE: tanto “OLD.nome_coluna” quanto 
“NEW.nome_coluna” estão disponíveis, antes 
(BEFORE) ou depois (AFTER) da atualização de 
uma linha (tupla). 

> NEW: Refere-se aos valores dos dados novos ou modificados, disponíveis em triggers do tipo INSERT e UPDATE.   
>
> OLD: Refere-se aos valores antigos dos dados, disponíveis em triggers do tipo UPDATE e DELETE.

<br>

## Alterar Trigger 

> Para atualizar o código de uma Trigger, basta usar o 
> comando CREATE OR REPLACE TRIGGER


### Exemplo:
> Colocando pontos para o inquilino depois do aluguel
Sintaxe:
```SQL
CREATE FUNCTION addPonto()
RETURNS TRIGGER
LANGUAGUE plpgsql
AS $$
BEGIN
  UPDATE Pontos 
  SET Pontos = Pontos + 1
  WHERE codCliente = NEW.codCliente;
  RETURN NEW;
END;
$$

CREATE OR REPLACE TRIGGER pontuar AFTER INSERT ON Aluguel
FOR EACH ROW EXECUTE FUNCTION addPonto();
``` 
<br>

## Excluindo TRIGGER
>Assim como outras estruturas no banco de dados, para 
>exclusão de Trigger basta fazer: 

sintaxe:

```SQL
 DROP TRIGGER <Nome da Function>;
``` 

Exemplo:

```SQL
 DROP TRIGGER baixa_estoque
``` 

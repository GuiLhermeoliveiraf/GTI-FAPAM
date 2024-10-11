# Atividade de revisão 

Banco de Dados Utilizado : 
```SQL
CREATE TABLE animal(
codigo INTEGER PRIMARY KEY,
nome VARCHAR(30) NOT NULL,
peso NUMERIC(5,3),
altura_centimetros INTEGER,
idade INTEGER DEFAULT 0,
data_cadastro DATE,
hora_cadastro TIME
);

CREATE TABLE cliente(
codigo INTEGER,
nome VARCHAR(60) NOT NULL,
CPF CHAR(11) UNIQUE,
celular CHAR(11) NOT NULL,
PRIMARY KEY (codigo)
);

CREATE TABLE dono(
codigo_animal INTEGER,
codigo_cliente INTEGER,
PRIMARY KEY (codigo_animal, codigo_cliente),
FOREIGN KEY (codigo_animal) REFERENCES animal(codigo),
FOREIGN KEY (codigo_cliente) REFERENCES cliente(codigo)
);

CREATE TABLE consulta(
codigo_consulta INTEGER PRIMARY KEY,
data_consulta DATE,
hora_consulta TIME,
valor_consulta NUMERIC (5,2) DEFAULT 100.00,
codigo_animal INTEGER,
FOREIGN KEY (codigo_animal) REFERENCES animal(codigo)
);

```
<br>

> Atividade 1 
### Insira 5 animais no banco de dados, cada um contendo uma característica como abaixo:
a) Peso nulo  
b) Idade zero inserida pelo valor padrão  
c) Data e hora devem ser coletadas automaticamente no momento do 
cadastro

```SQL
INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (1,'MACACO',NULL,172,CURRENT_DATE,CURRENT_TIME);

INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (2,'URUBU',NULL,168,CURRENT_DATE,CURRENT_TIME);

INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (3,'ELEFANTE',NULL,860,CURRENT_DATE,CURRENT_TIME);

INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (4,'GATO',NULL,12,CURRENT_DATE,CURRENT_TIME);

INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (5,'CACHORRO',NULL,20,CURRENT_DATE,CURRENT_TIME);
```
<br>

> Atividade 2
### Insira um animal com o nome “Passarinho canarinho das penas amarelas”
```SQL
INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (6,'PASSARINHO CANARINHO DAS PENAS AMARELAS',NULL,20,CURRENT_DATE,CURRENT_TIME);

--Esse erro significa que foi tipo varying(30) foi excedido
--ERROR: value too long for type character varying(30);
```
<br>

> Atvidade 3 
### Insira um animal com o mesmo código de um animal cadastrado no exercício 1
```SQL
INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (1,'COBRA',NULL,5,CURRENT_DATE,CURRENT_TIME);

--Esse erro significa que a uma violação de chave duplicada
--ERROR: duplicate key value violates unique constraint "animal_pkey"

```
<br>

> Atividade 4 
###  Insira um animal com o valor do nome NULL
```SQL
INSERT INTO animal (codigo,nome,peso,altura_centimetros,data_cadastro,hora_cadastro)
VALUES (7,NULL,NULL,20,CURRENT_DATE,CURRENT_TIME);

--Esse mostra uma violação da restrição notnull
--ERROR: null value in column "nome" of relation "animal" violates not-null constraint

```
<br>

> Atividade 5 
### Insira 2 clientes utilizando um único comando INSERT.
```SQL
INSERT INTO cliente (codigo,nome,cpf,celular)
VALUES(1,'guilherme',11111111111,55555555555),(2,'mateus',22222222222,88888888888);
```
<br>

> Atividade 6
###  Insira 3 clientes, sem digitar o nome das colunas
```SQL
INSERT INTO cliente
VALUES(3,'Gabriel',33333333333,88888888888),(4,'Paulo',44444444444,88888888888),(5,'Gabriel',55555555555,88888888888);
```
<br>

> Atividade 7 
###  Faça o INSERT dos donos de cada animal, sendo que pelo menos 1 animal de ter 2 donoss

```SQL
INSERT INTO dono (codigo_animal,codigo_cliente)
VALUES(1,2),(1,3),(2,1),(3,4),(4,5),(5,4);
```
<br>

> Atividade 8
### Faça o INSERT de 2 consultas.
```SQL
INSERT INTO consulta (codigo_consulta,data_consulta,hora_consulta,valor_consulta,codigo_animal)
VALUES(1,CURRENT_DATE,CURRENT_TIME,100,2);

INSERT INTO consulta (codigo_consulta,data_consulta,hora_consulta,valor_consulta,codigo_animal)
VALUES(2,CURRENT_DATE,CURRENT_TIME,250,3);
```
<br>

> Atividade 9
###  Atualize o valor da primeira consulta cadastrada para 250 reais.
```SQL
UPDATE consulta
SET valor_consulta = 250
WHERE codigo_consulta = 1;
```
<br>

> Atividade 10
###  Atualize o peso do animal com o maior código para 10.900. Observação, suponha que você não sabe o código
```SQL
UPDATE animal
SET peso = 10.900
WHERE codigo = (SELECT MAX(codigo) FROM animal);
```
<br>

> Atividade 11 
### Atualize o celular do cliente que tem o menor código para 37999999999
```SQL
UPDATE cliente
SET celular = '37999999999'
WHERE codigo = (SELECT MIN(codigo) FROM cliente);
```
<br>

> Atividade 12
###  Aumente o valor de todas as consultas em 15%
```SQL
UPDATE consulta
SET valor_consulta = valor_consulta * 1.15;

```
<br>

> Atividade 13 
### Aumente a altura de todos os animais em 0,20 metros
```SQL
UPDATE animal
SET altura_centimetros = altura_centimetros + 0.20;

```
<br>

> Atividade 14
### Selecione todas as informações de todos os animais cadastrados
```SQL
SELECT * FROM animal;
```
<br>

> Atividade 15 
### Selecione somente o nome de todos os animais cadastrados no banco de dados
```SQL
SELECT nome FROM animal;
```
<br>

> Atividade 16 
### Selecione a média de altura dos animais, o peso animal mais pesado e altura do menor animal

```SQL
SELECT AVG(altura_centimetros), MAX(PESO), MIN(altura_centimetros) 
FROM animal;

```
<br>

> Atividade 17
###  Selecione qual valor a clínica arrecadou realizando as consultas cadastradas
```SQL
SELECT SUM(valor_consulta) 
FROM consulta;
```
<br>

> Atividade 18 
###  Selecione os clientes em ordem alfabética decrescente
Rode o comando abaixo no banco de dados:  
ALTER TABLE animal ADD COLUMN tipo_animal VARCHAR(7);
```SQL
SELECT * FROM cliente
ORDER BY nome DESC

ALTER TABLE animal ADD COLUMN tipo_animal VARCHAR(7);
```
<br>

> Atividade 19 
###  Para cada animal criado, atribua um tipo, sendo os tipos possíveis PEQUENO ou GRANDE
```SQL
UPDATE animal
SET tipo_animal = 'Pequeno'
WHERE altura_centimetros < 100

UPDATE animal
SET tipo_animal = 'Grande'
WHERE altura_centimetros > 100

```
<br>

> Atividade 20
### Selecione quantos animais de cada tipo existem
```SQL
SELECT COUNT(tipo_animal)
FROM animal
GROUP BY tipo_animal
```
<br>

> Atividade 21 
### Selecione quantos animais de cada tipo existem com mais de 50 centímetros. 
```SQL
SELECT COUNT(tipo_animal)
FROM animal
WHERE (altura_centimetros > 50)
GROUP BY tipo_animal

```
<br>

> Atividade 22 
###  Selecione o animal de maior peso somente do tipo PEQUENO sem usar WHERE. 
```SQL
SELECT COUNT(tipo_animal)
FROM animal
GROUP BY tipo_animal
HAVING tipo_animal = 'Pequeno'
```
<br>

## Creditos 

Aula ministrada pelo professor

<a href="https://www.linkedin.com/in/gabriel-r-diniz/" target="_blank">Gabriel Ribeiro Diniz</a>

# View 

>View é uma tabela virtual, na qual os dados não estão 
fisicamente armazenados

Deve-se usar visões quando for frequente consultas 
com junção de várias relações (tabelas), bastando 
definir estas junções como uma visão e 
posteriormente consulta-la, na cláusula FROM.

### Vantagem: 
>caso a consulta seja recorrente na aplicação, é interessante utilizar visões.
>Simplificando as consultas que são frequentes na aplicação


## Criando uma view 
Sitaxe:
```SQL
CREATE OR REPLACE VIEW <Nome da view> AS 
SELECT <Coluna 1>, <Coluna 2>
FROM <Tabela 1> INNER JOIN <Tabela 2>
ON <Tabela1.chaveprimaria> = <Tabela2.chaveestrageira>
```
## Consultando a View:
Sitaxe:
```SQL
SELECT * FROM <Nome da View>
```
## Consulta com WHERE:
Sitaxe:
```SQL
SELECT <Coluna 1>, <Coluna 2>
FROM <Nome da Tabela>
WHERE <Condição> = <Paramentro>
```

## Criando uma View de uma tabela:
> Podemos tambem criar uma visao de somente uma tabela 
Sitaxe:
```SQL
CREATE OR REPLACE VIEW <Nome da view> AS 
SELECT MAX(<Coluna 1>), MIN(<Coluna 2>), AVG(<Coluna 3>)
FROM <Nome da Tabela> 
```

## Renomear uma View:
Sitaxe:

```SQL
ALTER VIEW <Nome da visão> RENAME TO <Novo nome>
```

## Excluindo View:
Sitaxe:
```SQL
DROP VIEW <Nome da Visão>
```

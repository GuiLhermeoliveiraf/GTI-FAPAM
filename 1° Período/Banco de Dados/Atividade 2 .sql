'Atividade 1'

select numero_pedido, nome from pedido INNER JOIN cliente ON pedido.numero_cliente = cliente.numero_cliente

'atividade 2'

SELECT numero_pedido,nome AS nome_funcionario FROM pedido INNER JOIN funcionario ON pedido.id_funcionario = funcionario.id_funcionario 

'atividade 3'

SELECT numero_pedido,nome AS nome_cliente
FROM pedido INNER JOIN cliente
ON pedido.numero_cliente = cliente.numero_cliente 
ORDER BY numero_pedido;

'atividade 4'

SELECT numero_pedido,nome AS nome_cliente
FROM pedido INNER JOIN cliente
ON pedido.numero_pedido = cliente.numero_cliente
ORDER BY nome_cliente;

'atividade 5'

SELECT numero_pedido,nome AS nome_funcionario
FROM pedido INNER JOIN funcionario 
ON pedido.id_funcionario = funcionario.id_funcionario
ORDER BY numero_pedido;

'atividade 6'

SELECT numero_pedido,nome AS nome_funcionario
FROM pedido INNER JOIN funcionario 
ON pedido.id_funcionario = funcionario.id_funcionario
ORDER BY nome_funcionario;

'atividade 7'

SELECT nome, SUM(quantidade_pedido.quantidade)
FROM produto INNER JOIN quantidade_pedido
ON produto.numero_produto = quantidade_pedido.numero_produto
GROUP BY nome;

'atividade 8'

SELECT numero_pedido, nome AS nome_funcionario
FROM pedido INNER JOIN funcionario 
ON pedido.id_funcionario = funcionario.id_funcionario
WHERE pedido.data_recebimento BETWEEN '2023/05/1' AND '2023/05/31'

'atividade 9'
	
SELECT
	cliente.nome as nome_cliente,
	funcionario.nome as nome_funcionario
FROM
	cliente
INNER JOIN
	pedido ON cliente.numero_cliente = pedido.numero_cliente
INNER JOIN
	funcionario ON pedido.id_funcionario = funcionario.id_funcionario;

'atividade 10'
	
SELECT
	cliente.nome AS nome_cliente,
	produto.nome AS nome_produto
FROM
	cliente
INNER JOIN
	pedido ON pedido.numero_cliente = cliente.numero_cliente
INNER JOIN
	quantidade_pedido ON quantidade_pedido.numero_pedido = pedido.numero_pedido
INNER JOIN
	produto ON quantidade_pedido.numero_produto = produto.numero_produto

'atividade 11'
	
SELECT
	funcionario.nome AS nome_funcionario,
	produto.nome AS nome_produto
FROM
	funcionario
INNER JOIN
	pedido ON pedido.id_funcionario = funcionario.id_funcionario
INNER JOIN
	quantidade_pedido ON quantidade_pedido.numero_pedido = pedido.numero_pedido
INNER JOIN
	produto ON quantidade_pedido.numero_produto = produto.numero_produto

'atividade 12'
	
SELECT
	funcionario.nome AS nome_funcionario,
	produto.nome AS nome_produto
FROM
	funcionario
INNER JOIN
	pedido ON pedido.id_funcionario = funcionario.id_funcionario
INNER JOIN
	quantidade_pedido ON quantidade_pedido.numero_pedido = pedido.numero_pedido
INNER JOIN
	produto ON quantidade_pedido.numero_produto = produto.numero_produto
WHERE
	quantidade_pedido.quantidade > 3;

'atividade 13'

SELECT
	funcionario.nome AS nome_funcionario,
	produto.nome AS nome_produto
FROM
	funcionario
INNER JOIN
	pedido ON pedido.id_funcionario = funcionario.id_funcionario
INNER JOIN
	quantidade_pedido ON quantidade_pedido.numero_pedido = pedido.numero_pedido
INNER JOIN
	produto ON quantidade_pedido.numero_produto = produto.numero_produto
WHERE
	quantidade_pedido.quantidade > 3
ORDER BY nome_produto;

'atividade 14'
	
SELECT
	cliente.nome as nome_cliente,
	funcionario.nome AS nome_funcionario,
	produto.nome AS nome_produto
FROM
	cliente
INNER JOIN
	pedido ON pedido.numero_cliente = cliente.numero_cliente
INNER JOIN
	funcionario ON pedido.id_funcionario = funcionario.id_funcionario
INNER JOIN
	quantidade_pedido ON quantidade_pedido.numero_pedido = pedido.numero_pedido
INNER JOIN
	produto ON quantidade_pedido.numero_produto = produto.numero_produto;

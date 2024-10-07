-- Atividade 1

CREATE FUNCTION Aluguel_pago()
RETURNS TRIGGER
LANGUAGE plpgsql AS
$$ 
BEGIN
	UPDATE Pontos
	SET pontos = pontos + 1 
	WHERE codCliente = NEW.codCliente;
	RETURN NEW;
END;
$$


CREATE TRIGGER Ponto_aluguel
AFTER INSERT ON aluguel
FOR EACH ROW
EXECUTE FUNCTION Aluguel_pago()

-- Atividade 2 

CREATE FUNCTION log_boleto()
RETURNS TRIGGER
LANGUAGE plpgsql AS
$$ 
BEGIN
	INSERT INTO LogBoleto (id, descricao, data, hora) 
	VALUES((SELECT MAX(ID) + 1 FROM logBoleto),
	'A data de vencimento foi alterada de' || to_char(OLD.dataVencimento,'dd/MM/yyyy')
	|| 'para' || to_char(NEW.dataVencimento, 'dd/MM/yyyy'),CURRENT_DATE, CURRENT_TIME);
	RETURN NEW;
END;
$$

CREATE TRIGGER logAlteracaoBoleto
AFTER UPDATE ON Boleto 
FOR EACH ROW
EXECUTE FUNCTION log_boleto()

-- Atividade 3 

CREATE FUNCTION nao_deletar()
RETURNS TRIGGER 
LANGUAGE plpgsql AS
$$ 
BEGIN 
	INSERT INTO Produto
	VALUES(OLD.codigo, OLD.descrição, OLD.quantidade, OLD.preco);	
	RETURN OLD;
END;
$$

CREATE TRIGGER sem_deleção
AFTER DELETE ON Produto
FOR EACH ROW
EXECUTE FUNCTION nao_deletar();

-- Atividade 4

CREATE FUNCTION sem_alteração()
RETURNS TRIGGER 
LANGUAGE plpgsql AS
$$
BEGIN
	UPDATE cliente 
	SET codigo = OLD.codigo, nome = OLD.nome, cpf = OLD.cpf, celular = OLD.celular 
	WHERE codigo = NEW.codigo;
	RETURN OLD;
END;
$$

CREATE TRIGGER sem_mudança
AFTER UPDATE ON cliente 
FOR EACH ROW 
EXECUTE FUNCTION sem_alteração()

-- Atividade 5

CREATE FUNCTION somando_minutos()
RETURNS TRIGGER 
LANGUAGE plpgsql AS 
$$
BEGIN 
	UPDATE Usuario
	SET minutosAssistidos = minutosAssistidos +  (SELECT duracao FROM Filme WHERE codigo = NEW.codigo )
	WHERE cpf= NEW. cpfUsuario;
END;
$$

CREATE TRIGGER Minutos
AFTER INSERT ON FilmeUsuario
FOR EACH ROW
EXECUTE FUNCTION somando_minutos()

-- Atividade 6 

CREATE FUNCTION num_filmes()
RETURNS TRIGGER
LANGUAGE plpgsql AS 
$$
BEGIN 
	UPDATE ator
	SET numeroFilmes = numeroFilmes + 1
	WHERE codigo = NEW.codigoAtor;
END;
$$ 

CREATE TRIGGER filmes
AFTER UPDATE ON AtorFilme
FOR EACH ROW 
EXECUTE FUNCTION num_filmes();


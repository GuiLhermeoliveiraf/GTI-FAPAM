----------------------------- DDL

CREATE TABLE Jogador (
  ID_Jogador SERIAL PRIMARY KEY,
  Nome VARCHAR(100) NOT NULL,
  Data_Nascimento DATE,
  Altura NUMERIC,
  Posições TEXT[],
  Time_ID INTEGER,

  FOREIGN KEY (Time_ID) REFERENCES Time(ID_Time)
);

CREATE TABLE Time (
  ID_Time SERIAL PRIMARY KEY,
  Nome VARCHAR(100) NOT NULL,
  Cidade VARCHAR(100) DEFAULT 'Desconhecida'
);

CREATE TABLE Partida (
  ID_Partida SERIAL PRIMARY KEY,
  Data DATE NOT NULL,
  Horário TIME,
  Local VARCHAR(100) DEFAULT 'A definir',
  Campeonato_ID INTEGER,
  Público INTEGER,

  FOREIGN KEY (Campeonato_ID) REFERENCES Campeonato(ID_Campeonato)
);

CREATE TABLE Torneio (
  ID_Campeonato SERIAL PRIMARY KEY,
  Nome VARCHAR(100) NOT NULL UNIQUE,
  Ano VARCHAR(4) NOT NULL,
  Tipo VARCHAR(50) DEFAULT 'Nacional'
);

ALTER TABLE Jogador
ADD COLUMN Peso NUMERIC;

ALTER TABLE Time
DROP COLUMN Fundação;

ALTER TABLE Partida
RENAME COLUMN Hora TO Horário;

ALTER TABLE Time
ADD CONSTRAINT unique_nome UNIQUE (Nome);

ALTER TABLE Time
DROP CONSTRAINT unique_nome;

ALTER TABLE Partida
ALTER COLUMN Local SET DEFAULT 'Indefinido';

ALTER TABLE Torneio
ALTER COLUMN Ano TYPE VARCHAR(4);

ALTER TABLE Campeonato
RENAME TO Torneio;

----------------------------- DML

INSERT INTO Jogador (Nome, Data_Nascimento, Altura, Posições, Time_ID)
VALUES ('Cristiano Ronaldo', '1985-02-05', 1.87, ARRAY['Atacante'], 1);

INSERT INTO Time
VALUES (DEFAULT, 'Real Madrid', 'Madrid');

INSERT INTO Campeonato (Nome, Ano, Tipo)
VALUES ('Brasileirão', 2023, 'Nacional')
RETURNING ID_Campeonato;

UPDATE Jogador
SET Altura = 1.89
WHERE Nome = 'Cristiano Ronaldo';

UPDATE Jogador
SET Altura = 1.85
WHERE ID_Jogador IN (SELECT ID_Jogador FROM Jogador WHERE Nome = 'Messi');

UPDATE Jogador
SET Altura = 1.85
WHERE ID_Jogador NOT IN (SELECT ID_Jogador FROM Jogador WHERE Nome = 'Cristiano Ronaldo');

DELETE FROM Time;

DELETE FROM Jogador
WHERE Nome = 'Cristiano Ronaldo';

SELECT * FROM Jogador
ORDER BY Altura ASC;

SELECT * FROM Jogador
ORDER BY Altura DESC;

SELECT Time_ID, COUNT(*)
FROM Jogador
GROUP BY Time_ID;

SELECT Time_ID, AVG(Altura)
FROM Jogador
GROUP BY Time_ID;

SELECT MAX(Altura) FROM Jogador;

SELECT MIN(Altura) FROM Jogador;

SELECT COUNT(*) FROM Jogador;

SELECT AVG(Altura) FROM Jogador;

SELECT SUM(Publico) FROM Partida;

SELECT DISTINCT Nome FROM Time;

SELECT * FROM Jogador
WHERE Time_ID = 1 AND Altura > 1.80;

SELECT * FROM Jogador
WHERE Time_ID = 1 OR Time_ID = 2;

SELECT * FROM Jogador
WHERE NOT (Time_ID = 1);

SELECT * FROM Jogador
WHERE Altura BETWEEN 1.75 AND 1.85;

SELECT * FROM Jogador
NATURAL JOIN Time;

SELECT * FROM Jogador
INNER JOIN Time ON Jogador.Time_ID = Time.ID_Time;

SELECT * FROM Jogador
LEFT JOIN Time ON Jogador.Time_ID = Time.ID_Time;

SELECT * FROM Jogador
RIGHT JOIN Time ON Jogador.Time_ID = Time.ID_Time;

SELECT * FROM Jogador
FULL OUTER JOIN Time ON Jogador.Time_ID = Time.ID_Time;

SELECT * FROM Jogador
LIMIT 5;

SELECT * FROM Jogador
OFFSET 5;

SELECT COALESCE(Nome, 'Nome desconhecido') FROM Jogador;

SELECT * FROM Jogador
WHERE Posições <> 'Atacante';

SELECT * FROM Jogador
WHERE Nome LIKE 'C%';

SELECT * FROM Jogador
WHERE Nome NOT LIKE 'C%';

SELECT Nome,
  CASE
     WHEN Altura >= 1.80 THEN 'Alto'
     ELSE 'Baixo'
  END AS Altura_Status
FROM Jogador;

SELECT Nome, ROUND(Altura, 2) AS Altura_Arredondada FROM Jogador;

SELECT Nome, TRUNC(Altura, 1) AS Altura_Inteira FROM Jogador;

SELECT UPPER(Nome) FROM Jogador;

SELECT LOWER(Nome) FROM Jogador;

SELECT SUBSTRING(Nome, 1, 3) AS Iniciais FROM Jogador;

SELECT CAST(Altura AS INTEGER) AS Altura_Inteira FROM Jogador;

SELECT CONCAT(Nome, ' - ', Posições[1]) AS Info FROM Jogador;

SELECT age(Data_Nascimento) FROM Jogador;

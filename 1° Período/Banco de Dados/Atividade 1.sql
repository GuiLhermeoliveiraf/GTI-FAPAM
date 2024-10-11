CREATE TABLE
  cliente (
    cli_cod SERIAL PRIMARY KEY,
    nome_cli VARCHAR(30) NOT NULL,
    cpf_cliente CHAR(11) NOT NULL,
    cel_cli CHAR(11)
  );

CREATE TABLE
  produto (
    cod_prod SERIAL PRIMARY KEY,
    desc_prod VARCHAR(30) NOT NULL,
    preco_prod NUMERIC(8, 2),
    estoq_prod INTEGER DEFAULT (0),
    tipo_prod VARCHAR(20)
  );

CREATE TABLE
  venda (
    cod_venda SERIAL PRIMARY KEY,
    data_venda CHAR(10),
    hora_venda CHAR(5),
    cli_cod SERIAL,
    FOREIGN KEY (cli_cod) REFERENCES cliente (cli_cod)
  );

CREATE TABLE
  produtos (
    cod_prodvenda SERIAL PRIMARY KEY,
    cod_venda SERIAL,
    cod_prod SERIAL,
    quant_vend INTEGER,
    valor_total NUMERIC(8, 2),
    FOREIGN KEY (cod_venda) REFERENCES venda (cod_venda),
    FOREIGN KEY (cod_prod) REFERENCES produto (cod_prod)
  );

CREATE TABLE Cliente
(
  C_id INT NOT NULL,
  C_nome VARCHAR(150) NOT NULL,
  C_email VARCHAR(150) NOT NULL,
  C_telefone CHAR(14) NOT NULL,
  C_dnascimento DATE NOT NULL,
  C_nif CHAR(9) NOT NULL,
  PRIMARY KEY (C_id),
  UNIQUE (C_email)
);

ALTER TABLE Cliente CHANGE COLUMN C_id C_id INT NOT NULL AUTO_INCREMENT ;

CREATE TABLE Agente
(
  A_id INT NOT NULL,
  A_nome VARCHAR(150) NOT NULL,
  A_telefone CHAR(14) NOT NULL,
  PRIMARY KEY (A_id)
);

CREATE TABLE Administrador
(
  AD_id INT NOT NULL,
  AD_nome VARCHAR(150) NOT NULL,
  AD_telefone CHAR(14) NOT NULL,
  AD_email VARCHAR(150) NOT NULL,
  PRIMARY KEY (AD_id)
);

CREATE TABLE Imovel
(
  IM_id INT NOT NULL,
  IM_nome VARCHAR(150) NOT NULL,
  IM_area VARCHAR(150) NOT NULL,
  IM_tipologia INT NOT NULL,
  IM_preco INT NOT NULL,
  IM_M_rua VARCHAR(250) NOT NULL,
  IM_M_numero INT NOT NULL,
  IM_M_cpostal3 VARCHAR(3) NOT NULL,
  IM_M_cpostal4 VARCHAR(4) NOT NULL,
  IM_descricao VARCHAR(250) NOT NULL,
  A_id INT NOT NULL,
  AD_id INT NOT NULL,
  PRIMARY KEY (IM_id),
  FOREIGN KEY (A_id) REFERENCES Agente(A_id),
  FOREIGN KEY (AD_id) REFERENCES Administrador(AD_id)
);

CREATE TABLE Log_In
(
  L_email VARCHAR(150) NOT NULL,
  L_password VARCHAR(50) NOT NULL,
  L_id INT NOT NULL,
  AD_id INT NOT NULL,
  PRIMARY KEY (L_id),
  FOREIGN KEY (AD_id) REFERENCES Administrador(AD_id),
  UNIQUE (L_email)
);

CREATE TABLE Visita
(
  V_id INT NOT NULL,
  V_Data DATE NOT NULL,
  V_hora INT NOT NULL,
  C_id INT NOT NULL,
  IM_id INT NOT NULL,
  PRIMARY KEY (V_id),
  FOREIGN KEY (C_id) REFERENCES Cliente(C_id),
  FOREIGN KEY (IM_id) REFERENCES Imovel(IM_id)
);


ALTER TABLE Visita CHANGE COLUMN V_id V_id INT NOT NULL AUTO_INCREMENT ;

# API CrudPessoa
------------

Com a IDE Spring Tool Suite abra Workspace da pasta clonada, importe o projeto Maven, start project localhost:8080

----------------

Desafio proposto foi criar uma API REST com funcionalidades CRUD para o objeto "Pessoa".

-------------

O objeto "Pessoa" deve possuir os seguintes atributos:

- ID (Chave Primária)
- Nome
- Email
- CPF
- Endereço

O atributo "Endereço" deve conter os seguintes campos:
- CEP
- Logradouro
- Complemento
- Bairro
- Cidade
- UF
- Latitude
- Longitude

Os atributos mencionados acima são os requisitos mínimos, mas você pode adicionar outros campos, se
necessário.

------------------

Requisitos Funcionais:
 • Não é permitido cadastrar mais de uma pessoa com o mesmo CPF.
 • Não é permitido cadastrar mais de uma pessoa com o mesmo email.
 • Uma mesma pessoa pode ter mais de um endereço diferente cadastrado.

--------------------

Requisitos Técnicos:
 • A API deve ser construída preferencialmente (mas não exclusivamente) em Java. (Pode-se utilizar
qualquer framework)
 • É necessário aplicar conceitos de orientação a objetos.
 • Utilização de um banco de dados relacional.

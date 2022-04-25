# desafiospringbootvotacao

Objetivo
Cadastrar uma nova pauta;
Abrir uma sessão de votação em uma pauta;
Receber votos dos associados em uma pauta;
Os votos são apenas SIM/NÃO;
Cada associado é identificado por um id único e pode votar apenas uma vez por pauta;

Para realizar testes.
Acessando o postman;

POST: http://localhost:8082/springboot/api/v1/associado

{
     "nome": "Nome",
    "cpf": "Cpf",
    "email": "Email",
    "sexo": "Sexo"
}

http://localhost:8082/springboot/api/v1/assembleia

http://localhost:8082/springboot/api/v1/pauta

http://localhost:8082/springboot/api/v1/voto



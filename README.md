# Study
Oriented programming College study

*QUESTÃO 01)
Sobrecarga é o fato de ter mais de um método/construtor com o mesmo nome, porém com um número de parâmetros diferentes. Isso ocorre na Classe VENDEDOR com o seu construtor;
Sobrescrita é o @Overrite, então temos sobrescrita no getSalarioLiquido() e no toString() nos métodos Vendedor e Gerente que sobrescrevem esses métodos que foram definidos na classe abstrata Funcionario.

*QUESTÕES 02 E 03--> CODIGO

*QUESTAO 04)
O erro está na última linha(Vendedor v2 = f2), uma vez que o compilador não sabe que f2 é um Vendedor, para ficar certo teria de fazer: Vendedor v2 = (Vendedor) f2;

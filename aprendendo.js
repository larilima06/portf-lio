// variavéis no javascript são case sensitive   
// variavéis são declaradas com a palavra chave var
// variavéis não podem começar com números
// variavéis podem começar com $, _ ou letras
// variavéis não podem conter espaços ou traços
// variavéis são case sensitive
// variavéis não podem ser palavras reservadas
let nome = 'João';
let idade = 25;
let estaAprovado = true;

console.log(nome, idade, estaAprovado);

// Tipos de variavéis
// Primitivos
// String, Number, Boolean, Undefined, Null
let nome = 'João'; // String literal
let idade = 25; // Number literal
let estaAprovado = true; // Boolean
let sobrenome = undefined; // Undefined
let corSelecionada = null; // Redefinir um valor

// operadores no javascript
// Aritméticos (+, -, *, /, **, %)
let salario = 100;
console.log(salario + salario);
console.log(salario - salario);

// Incremento e Decremento
let idade = 18;
console.log(idade++);
console.log(idade);

// Atribuição
let valorTeclado = 100;
valorTeclado += valorTeclado;
console.log(valorTeclado);

// Comparação
// Igualdade estrita
console.log(1 === 1);  // true
console.log('1' === 1); // false
// Igualdade solta
console.log(1 == 1);  // true
console.log('1' == 1); // true

// Operador Ternário
let pontos = 100;
let tipo = pontos > 100 ? 'premium' : 'comum';
console.log(tipo);

// Operadores Lógicos
// E (&&)
console.log(true && true); // true
console.log(true && false); // false
// OU (||)
console.log(true || true); // true
console.log(true || false); // true
// NOT (!)
let maiorIdade = true;
console.log(!maiorIdade);

//condicionais
// If...Else
let hora = 10;
if (hora > 6 && hora < 12) {
    console.log('Bom dia');
}
else if (hora > 12 && hora < 18) {
    console.log('Boa tarde');
}
else {
    console.log('Boa noite');
}
// Switch...Case
let permissao; // comum, gerente, diretor
permissao = 'comum';
switch (permissao) {
    case 'comum':
        console.log('Usuário comum');
        break;
    case 'gerente':
        console.log('Usuário gerente');
        break;
    case 'diretor':
        console.log('Usuário diretor');
        break;
    default:
        console.log('Usuário não reconhecido');
}
// estrutura de loop (repetição)
// For 
for (let i = 0; i < 5; i++) {
    console.log('Estou aprendendo', i);
}
// While
let i = 0;

while (i < 5) {
    console.log('Estou aprendendo', i);
    i++;
}   
// Do...While
let i = 0;

do {
    console.log('Estou aprendendo', i);
    i++;
}
while (i < 5);
// For...In
const pessoa = {
    nome: 'João',
    idade: 30
};

for (let chave in pessoa) {
    console.log(chave, pessoa['nome']);
}
// For...Of
const cores = ['vermelho', 'azul', 'verde'];

//funções são blocos de código que podem ser chamados
// Função
function saudacao(nome) {
    console.log('Olá ' + nome);
}
// dentro da função pode-se passar parâmetros
saudacao('João');
// Função com retorno
function soma(a, b) {
    return a + b;
}
console.log(soma(2, 3));
// Operador Spread
const primeiro = [1, 2, 3];
const segundo = [4, 5, 6];
// objetos são passados por referência
CONST objeto = { nome: 'João' };
const copia = { ...objeto };
// Desestruturação de objetos
const pessoa = {
    nome: 'João',
    idade: 30
};
//criando metodos dentro de objetos
const pessoa = {
    nome: 'João',
    idade: 30,
    falar() {
        console.log('Olá');
    }
};
//classe
// Classes
class Pessoa {
    constructor(nome) {
        this.nome = nome;
    }
    falar() {
        console.log('Meu nome é ' + this.nome);
    }
}


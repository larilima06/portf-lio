// no java as classes são publicas e o nome do arquivo deve ser o mesmo nome da classe
public class MinhaClasse {
    // Atributos
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Construtor
    public MinhaClasse(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    public void calcularIMC() {
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
    }

    public void calcularIdadeEmDias() {
        int dias = idade * 365;
        System.out.println("Idade em dias: " + dias);
    }
}
```
// existe a classa main que é a classe principal do programa
```java
// Path: Main.java
public class Main {
    public static void main(String[] args) {
        MinhaClasse mc = new MinhaClasse("Fulano", 25, 1.75, 70);
        mc.imprimir();
        mc.calcularIMC();
        mc.calcularIdadeEmDias();
    }
}
```
// para compilar o programa
```bash
javac MinhaClasse.java Main.java
```
// para executar o programa
```bash
java Main
// metodos
// métodos são blocos de código que realizam uma tarefa específica
// declaração de métodos
// modificador de acesso, tipo de retorno, nome do método, parâmetros, corpo do método
public void imprimir(nome, idade, altura, peso) {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
}
// chamada de métodos
mc.imprimir();
// métodos com retorno
public double calcularIMC(peso, altura) {
    double imc = peso / (altura * altura);
    return imc;
}
// chamada de métodos com retorno
double imc = mc.calcularIMC();
System.out.println("IMC: " + imc);
// métodos com parâmetros

// declaração de variáveis
// int, double, float, char, boolean
// int
int idade = 25;
// double
double altura = 1.75;
// float
float peso = 70;
// char
char sexo = 'M';
// boolean
boolean ehMaiorDeIdade = true;
// operadores aritméticos
// +, -, *, /, %
int a = 10;
int b = 3;
int soma = a + b; // 13
int subtracao = a - b; // 7
int multiplicacao = a * b; // 30
int divisao = a / b; // 3
int resto = a % b; // 1
// operadores de comparação
// ==, !=, >, <, >=, <=
int x = 10;
int y = 20;
boolean igual = x == y; // false
boolean diferente = x != y; // true
boolean maior = x > y; // false
boolean menor = x < y; // true
boolean maiorOuIgual = x >= y; // false
boolean menorOuIgual = x <= y; // true
// operadores lógicos
// &&, ||, !'
boolean a = true;
boolean b = false;
boolean c = a && b; // false
boolean d = a || b; // true
boolean e = !a; // false
// estruturas condicionais
// if, else if, else
int idade = 25;
if (idade < 18) {
    System.out.println("Menor de idade");
} else if (idade >= 18 && idade < 60) {
    System.out.println("Adulto");
} else {
    System.out.println("Idoso");
}
// estruturas de repetição
// for, while, do while
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
// arrays
int[] numeros = new int[5];
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
numeros[3] = 40;
numeros[4] = 50;
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}'

# tipos de dados em python
# int, float, str, bool, list, tuple, dict, set, None
# type() - retorna o tipo de dado
# isinstance() - verifica se é uma instância de um tipo de dado
# id() - retorna o endereço de memória
# bool - True, False
# None - None
# list - []
# tuple - ()
# dict - {}
# set - {}
# str - 'string', "string", '''string''', """string"""
# int - 1, 2, 3, 4, 5
# float - 1.1, 2.2, 3.3, 4.4, 5.5
# complex - 1 + 2j, 2 + 3j, 3 + 4j, 4 + 5j, 5 + 6j


# int
print(1)
print(2)
#str - string
print('string')
print("string")

# transformando um tipo de dado em outro
print(int('10'))
print(float('10.5'))


# entrada e sáida de dados
nome = input('Qual é o seu nome? ')
print(f'Seu nome é {nome}')

# tipos de operadores
# aritméticos - +, -, *, /, //, %, **
# de atribuição - =, +=, -=, *=, /=, //=, %=, **=
# de comparação - ==, !=, >, <, >=, <=
# lógicos - and, or, not
# de identidade - is, is not
# de associação - in, not in
# de bit a bit - &, |, ^, ~, <<, >>
# de deslocamento - &, |, ^, ~, <<, >> 


# condicionais - if, elif, else são usados para tomar decisões
# if - se
# elif - senão se
# else - senão
# if condição:
#   bloco de código
# elif condição:

# laços de repetição - for, while
# for - para
# while - enquanto
# for variável in iterável:
#   bloco de código 
for i in range(1, 10):
    print(i)
# range() - retorna uma sequência de números, começando de 0 por padrão, e incrementando de 1 em 1, e terminando em um número especificado
# range(inicio, fim, incremento)
# range(0, 10, 1)
Algoritmo "banco de sangue"

Var
nome : caracter
IDADE : inteiro
peso : real
tatu : caracter
alcool :  caracter

Inicio

escreval("qual é o seu nome ?")
leia(nome)

escreval("qual é a sua idade?")
leia(idade)

se((idade<19) ou (idade>69)) entao
escreval("voce deve ter entre 19 a 69 anos para doar")
fimalgoritmo
fimse

escreval("qual o seu peso?")
leia(peso)

se(peso<50)entao
escreval("voce deve ter mais que 50kg")
fimalgoritmo
fimse

escreval("voce fez alguma tatuagem nos ultimos 12 meses?")
escreval("[sim/nao]")
leia (tatu)

se(tatu="sim")entao
escreval("voce não pode ter feito tatuagem nos ultimos 12 meses para doar")
fimalgoritmo
fimse

escreval("voce ingeriu alcool nas ultimas 12hrs ?")
leia(alcool)

se(alcool="sim")entao
escreval("voce não poder ter ingerido alcool nas ultimas 12hrs para doar sangue")
fimalgoritmo
fimse

escreval(nome," voce pode doar sangue")



Fimalgoritmo

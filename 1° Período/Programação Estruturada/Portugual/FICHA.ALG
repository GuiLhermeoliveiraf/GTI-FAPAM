Algoritmo "FICHA"

Var
nome : caracter
sexo  : caracter
masfem : caracter
ano  :  inteiro
idade : inteiro
cidade  :  caracter
Inicio
escreval("Qual o seu nome?")
leia (nome)

escreval("Qual o seu sexo? ex MAS/FEM")
leia(sexo)

se (sexo = "mas") entao
masfem<-"SR"
senão(sexo = "fem") entao
masfem<-"SRA"
fimse

escreval("Qual a cidade onde voce mora")
leia(cidade)

escreval("Escreva o ano em que voce nasceu com 4 numeros ?")
leia (ano)

idade<-(2024- ano)

escreval("-------------------")
escreval(" FICHA CADASTRAL ")
escreval(" ")
ESCREVAL(" ", masfem," ",nome  )
escreval(" ")
escreval(" idade :", idade    )
escreval(" ")
escreval(" cidade : ",cidade)
escreval("-------------------")



Fimalgoritmo
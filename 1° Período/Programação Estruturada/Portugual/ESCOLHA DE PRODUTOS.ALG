Algoritmo "escolha de produtos"

Var
 COD : INTEIRO
 QUA : INTEIRO
 TOTAL : REAL
Inicio
      escreval("+---------------------------------------+")
      escreval("|               SALGADOS                |")
      escreval("|---------------------------------------|")
      escreval("| Cód. |    Salgado    | Valor unitário |")
      escreval("|---------------------------------------|")
      escreval("| [1]  | Coxinha       |     R$0,50     |")
      escreval("| [2]  | Pastel        |     R$0,75     |")
      escreval("| [3]  | Pão de Queijo |     R$0,40     |")
      escreval("| [4]  | Enroladinho   |     R$0,80     |")
      escreval("+---------------------------------------+")

 Escreval("qual o codigo do seu produto?")
 leia(cod)
 
 escreval ("qual a quantidades de produtos?")
 leia(qua)

 escolha cod
 caso 1
 total<- qua*0.50

 caso 2
 total<- qua*0.75
 
 caso 3
 total<- qua*0.40
 
 caso 4
 total<- qua*0.80

 fimescolha
 
 escreval("total deu :",total:3:2)
 
Fimalgoritmo
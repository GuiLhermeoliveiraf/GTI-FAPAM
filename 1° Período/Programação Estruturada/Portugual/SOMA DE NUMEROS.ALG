Algoritmo "SomaNumeros"

Var
   soma:   inteiro
   numero: inteiro
   continuar: caractere
   primeira_interacao: logico

Inicio
   continuar <- "SIM"
   primeira_interacao <- verdadeiro
   numero <- 0
   soma <- 0

   enquanto (maiusc(continuar) = "SIM") faca
      limpatela()

      se(primeira_interacao) entao
         primeira_interacao <- falso

         escreval("Digite um número")
         escreva("-> ")
         leia(numero)
      senao
         escreval("Digite mais um número")
         escreva("-> ")
         leia(numero)
      fimse

      soma <- soma + numero

      escreval()

      escreval("Deseja somar mais um número?")
      escreva("-> ")
      leia(continuar)

   fimenquanto

   limpatela()

   escreval("Resultado da soma:")
   escreval()
   escreval("   [", soma, " ]   ")
Fimalgoritmo
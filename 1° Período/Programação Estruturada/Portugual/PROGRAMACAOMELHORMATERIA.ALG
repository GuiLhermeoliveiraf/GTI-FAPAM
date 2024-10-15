Algoritmo "ProgramacaoMelhorMateria"

Var
   quantidade: inteiro
   contador: inteiro
   certeza: caractere

Inicio
   certeza   <- "NÃO"
   quantidade <- 0
   contador <- 0

   enquanto ((maiusc(certeza) = "NÃO") OU (maiusc(certeza) = "NAO")) faca
      limpatela()

      escreval("Digite o número de vezes")
      escreva("-> ")
      leia(quantidade)

      se (quantidade > 100) entao
         escreval()
         escreval("A mensagem será repedita", quantidade, " vezes!")
         escreval("Você tem certeza que quer continuar?")
         escreva("-> ")
         leia(certeza)
      senao
         certeza <- "SIM"
      fimse
   fimenquanto

   limpatela()

   enquanto (contador <= quantidade) faca
      contador <- contador + 1
      escreval("Programação é a melhor matéria!")
   fimenquanto

Fimalgoritmo
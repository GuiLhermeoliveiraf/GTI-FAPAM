Algoritmo "Cardápio"

Var
   prato:  inteiro
   pedido: caractere
   total:  real
   encerrar: logico
   primeira_iteracao: logico
Inicio
   encerrar <- falso
   primeira_iteracao <- verdadeiro

   enquanto (nao(encerrar)) faca
      limpatela()

      se(primeira_iteracao) entao
         primeira_iteracao <- falso
      senao
         escreval("Quer pedir mais alguma coisa?")
         escreval("Valor total: R$ ", total:2:2)
         escreval()
      fimse

      escreval("------------ PRATOS ------------")
      escreval("[1] Risoto ------------- R$25,00")
      escreval("[2] Espaguete ---------- R$22,00")
      escreval("[3] Strogonoff --------- R$30,00")
      escreval("[4] Macarrão na Chapa -- R$20,00")
      escreval("--------------------------------")
      escreval("[5] ENCERRAR PEDIDO")
      escreval("--------------------------------")
      escreval()
      escreva("-> ")
      leia(prato)

      escolha(prato)
      caso 1
         total <- total + 25.00
         pedido <- pedido + "Risoto - R$25,00 | "
      caso 2
         total <- total + 22.00
         pedido <- pedido + "Espaguete - R$22,00 | "
      caso 3
         total <- total + 30.00
         pedido <- pedido + "Strogonoff - R$30,00 | "
      caso 4
         total <- total + 20.00
         pedido <- pedido + "Macarrão na Chapa - R$20,00 | "
      caso 5
         encerrar <- verdadeiro
      fimescolha
   fimenquanto

   limpatela()

   escreval("-- PEDIDO ------------")
   escreval()
   escreval("| ", pedido)
   escreval()
   escreval("TOTAL: [ R$", total:2:2, " ]")
   escreval()
Fimalgoritmo


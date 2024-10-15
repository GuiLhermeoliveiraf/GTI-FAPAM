Algoritmo "CARDAPIO BEBIDAS E COMIDAS"

Var
 comida : CARACTER
 precocom  : real
 bebida : caracter
 precobeb : real
 acom : caracter
 total : real

Inicio
      escreval("+---------------------------------------+")
      escreval("|               Cardapio                |")
      escreval("|---------------------------------------|")
      escreval("| Cód. |    Pratos     | Valor unitário |")
      escreval("|---------------------------------------|")
      escreval("| [1]  | Espaguete     |     R$40,00    |")
      escreval("| [2]  | Pizza         |     R$60,00    |")
      escreval("| [3]  | hambuerger    |     R$30,00    |")
      escreval("| [4]  | bife acebolado|     R$30,00    |")
      escreval("+---------------------------------------+")
      
      escreval("Qual o codigo de seu prato ?")
      leia(comida)
      
      escolha(comida)
      
      caso "1"
      comida<- "Espaguete"
      precocom<- 40,00
      
      caso "2"
      comida<- "Pizza"
      precocom<- 60,00
      
      caso "3"
      comida<- "hambuerger"
      precocom<- 30,00
      
      caso "4"
      comida<- "bife acebolado"
      precocom<- 30,00
      
      fimescolha
      
      escreval("gostaria de uma bebida ? ex: sim/nao")
      leia(acom)
      se (acom = "nao")entao
      total<-precocom
      escreval("um ",comida, "/ seu pedido deu um total de: ",total:3:2 ," Reais" )
      senao (acom = "sim")entao

      escreval("+---------------------------------------+")
      escreval("|               Cardapio                |")
      escreval("|---------------------------------------|")
      escreval("| Cód. |    bebidas    | Valor unitário |")
      escreval("|---------------------------------------|")
      escreval("| [1]  | Coca          |     R$5,00     |")
      escreval("| [2]  | Pepsi         |     R$4,00     |")
      escreval("| [3]  | Agua          |     R$3,00     |")
      escreval("| [4]  | Suco          |     R$3,00     |")
      escreval("+---------------------------------------+")
      
      escreval("qual o codigo da sua bebida ?")
      leia(bebida)

      escolha (bebida)
      caso "1"
      bebida<- "Coca"
      precobeb<- 5,00
      
      caso "2"
      bebida<- "Pepsi"
      precobeb<- 4,00
      
      caso "3"
      bebida<- "Agua"
      precobeb<- 3,00
      
      caso "4"
      bebida<- "Suco"
      precobeb<- 3,00
      
      fimescolha

      total<-precocom + precobeb
      escreval("um ",comida," e uma ",bebida," deu um total de :", total:3:2 , " Reais" )
fimse
Fimalgoritmo
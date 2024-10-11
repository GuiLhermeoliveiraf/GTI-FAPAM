"# Cardapio com repetição "
total=float(0)
com=""
while (True):
    print("_______________________________________")
    print("-------------- Cardapio ---------------")
    print("-----[1] coxinha --------- Custa = 4,00")
    print("-----[2] empada ---------- Custa = 5,00")
    print("-----[3] enroladinho------ Custa = 3,00")
    print("-----[4] pastel ---------- Custa = 7,00")
    print("-----[5]---[Mostrar a conta] ----------")
    print("---------------------------------------")
    print("")
    ped=int(input("qual o numero do seu pedido: "))
    if ped == 1:
       total = total +4
       com = com +"coxinha "
    elif ped == 2:
        total = total + 5
        com = com + "empada "
    elif ped == 3:
        total = total + 3
        com = com + "enroladinho "
    elif ped == 4:
        total = total + 7
        com = com + "pastel "
    elif ped == 5:
        total1 = str("%.2f" % total)
        totalreal = str(total1).replace(".", ",")
        print("")
        print(f"Seu pedido de {com}, deu um total de {totalreal} Reais")
        break
    else:
        print("Cod de pedido não encontrado !!")


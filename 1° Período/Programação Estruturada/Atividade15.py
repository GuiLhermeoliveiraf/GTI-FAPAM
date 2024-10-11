lista = []
menu = "O que deseja fazer ?\n"
menu += "[A] - Add um valor \n"
menu += "[R] - Remover um Valor \n"
menu += "[V] - Visualizar a lista \n"
menu += "[E] - Encerrar \n"
while (True):
    opcao = input(menu)

    if(opcao.upper()=="A"):
        itemadd = []
        item = input("Digite o item que deseja add:")
        itemadd.append(item)
        qtd = float(input("Digite a quantidade que deseja add:"))
        itemadd.append(qtd)
        valor = float(input("Digite o valor para add:"))
        itemadd.append(valor)
        lista.append(itemadd)
    elif(opcao.upper()=="V"):
        qtdtotal = 0
        vlrtotal = 0
        print("-----------------------------")
        for linha in lista:
            print("Produto: %s"% linha[0])
            print("Quantidade: %5.2f" % linha[1])
            print("Preço: R$%5.2f"%linha[2])
            qtdtotal += linha[1]
            vlrtotal += linha[2]
        print()
        print("*******************************")
        print(f"Qtd Itens: {qtdtotal:5.2f}")
        print(f"Vlr Total: R${vlrtotal:5.2f}")
        print("*******************************")
    elif(opcao.upper()=="R"):
        for cont, item in enumerate(lista):
            print(f"[{cont}] - {item[0]}")
        remover = int(input("Digite o indice que vc deseja remover"))
        if(remover<len(lista)):
            del lista[remover]
        else:
            print("Indice Invalido!")
    elif(opcao.upper()=="E"):
        break
qtdtotal = 0
vlrtotal = 0
print("----------------------")
for linha in lista:
    print("Produto: %s" % linha[0])
    print("Quantidade: %5.2f" % linha[1])
    print("Preço: R$%5.2f" % linha[2])
    qtdtotal += linha[1]
    vlrtotal += linha[2]
print()
print("*******************************")
print(f"Qtd Itens: {qtdtotal:5.2f}")
print(f"Vlr Total: R${vlrtotal:5.2f}")
print("*******************************")


"\todos os numeros digitados, maior,menor,total e media|"
lista = []
maior = 0
menor = 0
total = 0
menu = "O que deseja fazer ?\n"
menu += "[A] - Add um valor \n"
menu += "[R] - Remover um Valor \n"
menu += "[V] - Visualizar a lista \n"
menu += "[E] - Encerrar \n"
while (True):
    opcao = input(menu)

    if(opcao.upper()=="A"):
        num = input("Digite um numero que deseja add: ")
        lista.append(int(num))

    elif(opcao.upper()=="V"):
        for cont,item in enumerate(lista):
            print(f"[{cont}] - {item}")

    elif(opcao.upper()=="R"):
        for cont,item in enumerate(lista):
            print(f"{cont} - {item}")
        remover = int(input("Digite o indice que deseja remover "))

        if(remover<len(lista)):
            del lista[remover]
        else:
            print("indice invalido")
    elif(opcao.upper()=="E"):
        break
for cont,item in enumerate(lista):
    if((item > maior)or(cont==0)):
        maior=item
    if((item < menor)or(cont==0)):
        menor=item
    total += item
    print(f"[{cont}] - {item}")
print()
print(f"Maior: {maior}")
print(f"Menor: {menor}")
print(f"Total: {total}")
print(f"Media: {total/(cont+1)}")


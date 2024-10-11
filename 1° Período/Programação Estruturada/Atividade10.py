pratos = [
    "Hambúrguer",
    "Pizza",
    "Refrigerante",
    "Batata Frita"
]

valores = [
    10.00,
    20.00,
    5.00,
    8.00
]

total = 0.0
pedido = []

while True:
    print("\n+" + " Menu ".center(22, "-") + "+")
    print("| [1] Adicionar prato  |")
    print("| [2] Remover prato    |")
    print("| [3] FINALIZAR PEDIDO |")
    print("+" + "-" * 22 + "+")
    escolha = int(input("Escolha uma opção\n-> "))

    if escolha == 1:
        # ADICIONAR PEDIDO

        print("\n+" + " Cardápio ".center(28, "-") + "+")

        indice = 0
        while indice < len(pratos):
            opcao = f"[{indice + 1}] {pratos[indice]} - R$ {valores[indice]:.2f}"
            print("|", opcao.ljust(26, " "), "|")
            indice += 1

        print("+" + "".center(28, "-") + "+")
        prato = int(input("Escolha um prato\n-> ")) - 1
        total += valores[prato]
        pedido.append(pratos[prato])  # adiciona um elemeto à lista

    elif escolha == 2:
        # REMOVER PEDIDO

        print("\n+" + " Pedidos ".center(28, "-") + "+")

        indice = 0
        while indice < len(pedido):
            opcao = f"[{indice + 1}] {pedido[indice]}"
            print("|", opcao.ljust(26, " "), "|")
            indice += 1

        print("+" + "".center(28, "-") + "+")

        prato = int(input("Escolha um prato para remover\n-> ")) - 1
        total -= valores[prato]
        del pedido[prato]  # OU pedido.pop(prato) # remove um elemento da lista

    elif escolha == 3:
        break
    else:
        print("Opção inválida")

# resulmo do pedido e valor total
print("\n+" + " Pedido ".center(25, "-") + "+")

indice = 0
while indice < len(pedido):
    print(f"| {pedido[indice]} ".ljust(26, " ") + "|")
    indice += 1

# exibe o valor total antes de encerrar o quadro
print("+" + "".center(25, "-") + "+")
print(f"| Total: R$ {total:.2f} ".ljust(26, " ") + "|")
print("+" + "".center(25, "-") + "+")

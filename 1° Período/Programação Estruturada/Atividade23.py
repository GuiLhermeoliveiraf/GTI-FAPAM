"# Mostrando a tabuada do numero escolhido"
valor=1
num = int(input("Qual numero gostaria de ver a tabuada ?"))
while valor<=10:
    print(f"{num} x {valor:2} = {num * valor}")
    valor += 1

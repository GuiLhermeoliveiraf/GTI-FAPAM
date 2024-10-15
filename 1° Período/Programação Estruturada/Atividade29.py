"# alguel de carrro contando os dias e os KM"
dia = int(input("Quantos dias voce ficou com o carro ?: "))
km = float(input("Quantos KM voce andou no carro ? KM:"))
kmpre = km * 0.15
diapre = dia * 60
print(f"\nVoce usou o Carro durante {dia} dias e deu um total de {diapre:.2f} R$")
print(f"Voce rodou {km:.2f}KM no carro o total de {kmpre:.2f} R$")
print(f"O total a pagar é {kmpre + diapre:.2f} R$")

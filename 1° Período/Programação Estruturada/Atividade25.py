lar = float(input("Qual a largura da sua parede em m²?: "))
alt = float(input("Qual a altura da sua parede em m²?: "))
area = alt * lar
print(f"Sua parede tem a dimensão de {lar} x {alt} e sua area é de {area}m²")
print(f"\n para pintar essa parede e necessario {area/2:.2f}l de tinta")

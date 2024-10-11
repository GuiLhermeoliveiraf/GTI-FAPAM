preco=float(input("Quanto custa: "))
valor=float(input("Quanto voce tem ?: "))
sobre=valor-preco
sobre1=str("%.2f"%sobre)
real=str(sobre1).replace(".",",")
print("O seu troco é %s Reais" %real)

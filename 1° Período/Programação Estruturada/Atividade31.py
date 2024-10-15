from math import hypot
op = float(input("Comprimento do cateto oposto: "))
ca = float(input("Comprimento do cateto adjacente: "))
hi = hypot(op, ca)
print(f"A hiportenusa vai medir {hi:.2f}")

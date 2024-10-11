L1 = [7, 5, 3, 1, 2, 9]
L2 = [1, 4, 9, 8, 3, 6]

resultado = list(set(L1 + L2))

print(L1)  # [7, 5, 3, 1, 2, 9]
print(L2)  # [1, 4, 9, 8, 3, 6]
print(resultado)  # [1, 2, 3, 4, 5, 6, 7, 8, 9]

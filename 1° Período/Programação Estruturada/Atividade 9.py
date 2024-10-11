notas = [0, 0, 0, 0, 0]

indice = 0
while indice < 5:
    notas[indice] = int(input('Nota %d: ' % (indice + 1)))
    indice += 1

soma = 0
x = 0

while x < 5:
    soma += notas[x]
    x += 1

print()

print("*" * 22)
print("*", "RESUMO DAS NOTAS".center(18), "*")
print("*" * 22)

print()

indice = 0
while indice < 5:
    print('Nota %d: %d' % (indice + 1, notas[indice]))
    indice += 1

print('Média: %5.2f' % (soma / x))

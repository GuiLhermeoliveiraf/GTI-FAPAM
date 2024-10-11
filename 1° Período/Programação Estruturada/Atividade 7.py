"# descobrindo se numero é primo"
num = int(input("Digite um numero: "))
tot = 0
for c in range(1, num + 1):
    if num % c == 0:
        tot += 1
print("")
print(f"Esse numero foi divido {tot} vezes")
print("")
if tot == 2:
    print("E por isso que é um numero primo")
else:
    print("E por isso que não é um numero primo")

num=int(input("Digite um numero: "))
total=0
print("")
print("gostaria que mostrasse os numeros pares ou impares ?")
var=int(input("digite 1 para impar e 2 para par: "))
if var == 2:
    while total <= num:
        if total % 2 == 0 :
            print(total)
        total += 1
elif var == 1:
    while total <= num:
        if total % 2 == 1:
            print(total)
        total += 1
else:
    print("numero não reconhecido !!!")

"# numeros pares e impares ate numero do usuario, repetindo se não reconhecer "
num=int(input("Digite um numero: "))
total=0
while (True) :
    print("")
    print("gostaria que mostrasse os numeros pares ou impares ?")
    var=int(input("digite 1 para impar e 2 para par: "))
    if var == 2:
        while total <= num:
            if total % 2 == 0 :
                print(total)
            total += 1
        break
    elif var == 1:
        while total <= num:
            if total % 2 == 1:
                print(total)
            total += 1
        break
    else:
        print("")
        print("numero não reconhecido !!!")

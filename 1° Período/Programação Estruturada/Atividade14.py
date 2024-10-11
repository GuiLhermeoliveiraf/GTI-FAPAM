"|Desenvolva um programa para separar valores de uma lista|"
lista = [9,8,7,12,0,13,21,35,6,11,1]
listaimpar = []
listapar = []

for cont, item in enumerate(lista):
    if(item%2==0):
        listapar.append(item)
    else:
        listaimpar.append(item)
print(f"Lista par: {listapar}")
print(f"lista impar: {listaimpar}")

lista = [5, 7, 8, 10, 1]

def selection_sort(lista):
    n = len(lista)
    for pos in range(n - 1):
        min_index = pos
        #faz a busca na lista
        for i in range(pos, n):
            if lista[i] < lista[min_index]:
                min_index = i
        #Faz a troca de lugares
        if lista[pos] > lista[min_index]:
            aux = lista[pos]
            lista[pos] = lista[min_index]
            lista[min_index] = aux
selection_sort(lista)
print(lista)

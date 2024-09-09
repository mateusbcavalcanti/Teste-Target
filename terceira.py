import pandas as pd

dado = pd.read_json('C:\\Users\\Notebook\\OneDrive\\Área de Trabalho\\Prova técnica TARGET\\dados.json')
temp = 0
quant = 0
faturamento = []

for i in range(len(dado.index)):
    if(dado.iloc[i,1] != 0):
        faturamento.append(dado.iloc[i,1])

tam = len(faturamento)

for i in range(tam):
    if(faturamento[i] > sum(faturamento)/tam):
        quant += 1

print("O menor valor de faturamento e:", min(faturamento)) 
print("O maior valor de faturamento e:", max(faturamento)) 
print("O numero de dias em que o faturamento supera a media mensal e:", quant) 
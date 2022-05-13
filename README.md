# Exercício pertencente a disciplina de Engenharia de Software III

## Design Patterns

Considere uma aplicação que simula a movimentação de veículos. A movimentação de veículos deve ser simulada em uma classe de controle que deve ter um método chamado inicioMovimentacao que recebe o veículo como parâmetro, exibe uma mensagem que o veículo iniciou a movimentação e mostre sua configuração. O segundo método movimentacaoVeiculo, dessa classe, mostra a simulação do deslocamento do veículo segundo a seguinte descrição:


- Se for um automóvel, ele gera um valor aleatório de 10 a 30 segundos e apresenta o tempo que esse veículo levará para atingir 100 Km/h. Além disso, deve-se gerar um valor aleatório de 50 a 650 Km e apresentar o tamanho do deslcamento que o automóvel fará. Por fim, um número aleatório, de 1 a 4 deve ser gerado para informar o número de passageiros;


- Se for um caminhão, deve-se gerar um número aleatório de 1000 a 3000 Kg para informar a carga do caminhão. Além disso, deve-se gerar um valor aleatório de 500 a 3000 Km e apresentar o tamanho do deslocamento que o caminhão fará. Por fim, gerar um valor aleatório entre 2000 e 5000 (R$) para apresentar o valor do frete;


- Se for uma motocicleta, deve-se gerar um valor aleatório de 20 a 100 (Km) e apresentar o tamanho do deslocamento que a motocicleta fará. Gerar um valor aleatório entre 30 e 80 (R$) para apresentar o valor do frete;


- Se for uma van, deve-se gerar um valor aleatório entre 3 e 12 para apresentar o número de passageiros e um número aleatório entre 3 e 12 para apresentar o número de paradas que serão realizadas.


A aplicação tem como objeto principal Veiculo, cujas principais características são: placa, marca, modelo, cor, velocidade máxima. Automóveis podem ter 3 ou 5 portas e deve-se saber o ano. Caminhões tem quantidade de eixos e carga máxima. Motocicleta tem cilindradas.

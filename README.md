# Exerc�cio pertencente a disciplina de Engenharia de Software III

## Design Patterns

Considere uma aplica��o que simula a movimenta��o de ve�culos. A movimenta��o de ve�culos deve ser simulada em uma classe de controle que deve ter um m�todo chamado inicioMovimentacao que recebe o ve�culo como par�metro, exibe uma mensagem que o ve�culo iniciou a movimenta��o e mostre sua configura��o. O segundo m�todo movimentacaoVeiculo, dessa classe, mostra a simula��o do deslocamento do ve�culo segundo a seguinte descri��o:


- Se for um autom�vel, ele gera um valor aleat�rio de 10 a 30 segundos e apresenta o tempo que esse ve�culo levar� para atingir 100 Km/h. Al�m disso, deve-se gerar um valor aleat�rio de 50 a 650 Km e apresentar o tamanho do deslcamento que o autom�vel far�. Por fim, um n�mero aleat�rio, de 1 a 4 deve ser gerado para informar o n�mero de passageiros;


- Se for um caminh�o, deve-se gerar um n�mero aleat�rio de 1000 a 3000 Kg para informar a carga do caminh�o. Al�m disso, deve-se gerar um valor aleat�rio de 500 a 3000 Km e apresentar o tamanho do deslocamento que o caminh�o far�. Por fim, gerar um valor aleat�rio entre 2000 e 5000 (R$) para apresentar o valor do frete;


- Se for uma motocicleta, deve-se gerar um valor aleat�rio de 20 a 100 (Km) e apresentar o tamanho do deslocamento que a motocicleta far�. Gerar um valor aleat�rio entre 30 e 80 (R$) para apresentar o valor do frete;


- Se for uma van, deve-se gerar um valor aleat�rio entre 3 e 12 para apresentar o n�mero de passageiros e um n�mero aleat�rio entre 3 e 12 para apresentar o n�mero de paradas que ser�o realizadas.


A aplica��o tem como objeto principal Veiculo, cujas principais caracter�sticas s�o: placa, marca, modelo, cor, velocidade m�xima. Autom�veis podem ter 3 ou 5 portas e deve-se saber o ano. Caminh�es tem quantidade de eixos e carga m�xima. Motocicleta tem cilindradas.

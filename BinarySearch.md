## Busca Binária

A busca binária é utilizada para encontrar um valor `x` dentro de uma **lista ordenada**.
Para entender o funcionamento da busca binária, leia a explicação abaixo.

[Exemplo feito em java pode ser econtrado aqui](/BinarySearch.java)

## Explicação

Considerando o seguinte array

```java
 int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
```

defino que o valor `x` é 18, agora com a busca binária devemos retornar qual a posição do 18 se ele existe no nosso array.

Passo 1: verificar o valor do meio do array, vamos chamar de `I` essa posição, verificamos se o valor na posição `I` é igual a X, se for já temos a resposta só retornar o posição `I`.

Passo 2: Se o valor na posição `I` for menor que o `X` podemos concluir que todos os valores abaixo de `I` também são menores e podemos trabalhar somente com a outra metade do array.

Agora nossa busca vai ser da posição `I+1`, até o fim do array, assim já temos uma busca em um array menor do que o inicial, agora é só retornar ao Passo 1.

Passo 3: Se o valor na posição `I` for maior que o `X`, podemos concluir que todos os valores acima de `I` também são maiores e podemos trabalhar somente com a outra metade do array.

Agora nossa busca vai ser da posição inicial do array até a posição `I-1`, assim já temos uma busca em um array menor do que o inicial, agora é só retornar ao Passo 1.

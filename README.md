# binary-search-tree
Árvore binária de busca em java


# Funcionamento
* A subárvore à esquerda da raiz possui valores menores que a raiz
* A subárvore à direita da raiz possui valores maiores que a raiz
* Cada nó tem até dois filhos (um à esquerda e outro à direita)

# Métodos
* insert(int valor)
  * A inserção é feita comparando-se o valor da raiz com o valor a ser inserido
  * Cria-se o nó para o valor a ser inserido
  * Caso o valor seja menor que a raiz, insere-se o nó criado no filho esquerdo da raiz, de forma recursiva
  * Caso contrário, insere-se no filho da direita recursivamente
  
* inOrder()
  * percorre a árvore imprimindo os valores, seguindo o percurso EVD (esquerda, visita, direita) 

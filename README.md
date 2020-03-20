# binary-search-tree
Árvore binária de busca em java


# Funcionamento
* A subárvore à esquerda da raiz possui valores menores que a raiz
* A subárvore à direita da raiz possui valores maiores que a raiz
* Cada nó tem até dois filhos (um à esquerda e outro à direita)

# Métodos
* insert(int valor)
  * A inserção é feita comparando-se o valor a ser inserido com a raiz, recursivamente
  * Cria-se o nó para o valor a ser inserido
  * Caso o valor seja menor que a raiz, insere-se o nó como filho esquerdo da raiz
  * Caso contrário, insere-se como filho da direita 
  
* inOrder()
  * percorre a árvore imprimindo os valores, seguindo o percurso EVD (esquerda, visita, direita) 

* postOrder()
  * percorre a árvore imprimindo os valores, seguindo o percurso EDV (esquerda, direita, visita) 
  
* preOrder()
  * percorre a árvore imprimindo os valores, seguindo o percurso VED (visita, esquerda, direita) 

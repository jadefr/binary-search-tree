# binary-search-tree
Árvore binária de busca em java


# Funcionamento
* A subárvore à esquerda da raiz possui valores menores que a raiz
* A subárvore à direita da raiz possui valores maiores que a raiz
* Cada nó tem até dois filhos (um à esquerda e outro à direita)

# Métodos
* insert(int data)
  * chama o método insert(Node root, int data)
  
* insert(Node root, int data)
  * a inserção é feita comparando-se o valor a ser inserido com a raiz, recursivamente
  * cria-se o nó para o valor a ser inserido
  * caso o valor seja menor que a raiz, insere-se o nó como filho esquerdo da raiz
  * caso contrário, insere-se como filho da direita 
  
* inOrder()
  * chama o método inOrder(Node root)

* inOrder(Node root)
  * percorre a árvore imprimindo os valores, seguindo o percurso EVD (esquerda, visita, direita) 

* postOrder()
  * chama o método postOrder(Node root)
  
* postOrder()
  * percorre a árvore imprimindo os valores, seguindo o percurso EDV (esquerda, direita, visita) 
  
* preOrder()
  * chama o método preOrder(Node root)
  
* preOrder()
  * percorre a árvore imprimindo os valores, seguindo o percurso VED (visita, esquerda, direita) 

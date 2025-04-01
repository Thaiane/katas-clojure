;; A função evaluate-rpn avalia uma expressão matemática representada em Notação Polonesa Reversa (RPN).
;; 
;; Descrição:
;; Escreva uma função evaluate-rpn que recebe uma lista de expressões matemáticas em Notação Polonesa Reversa (RPN) 
;; e retorna o resultado da expressão. A função deve suportar as operações básicas de adição, subtração, multiplicação e divisão. 
;; A implementação deve ser feita usando pilha (stack) e recursion.
;;
;; Requisitos:
;; Entrada: Uma lista de tokens representando uma expressão matemática em RPN. Os tokens podem ser números ou operadores (+, -, *, /).
;; Saída: O resultado da expressão como um número.
;; Restrições: A função deve ser implementada utilizando uma pilha simulada com recursão e não deve utilizar bibliotecas externas para avaliação de expressões.

;; Exemplo de uso:
;;(evaluate-rpn [3 4 + 2 * 7 /])
;; => 2

;;(evaluate-rpn [5 1 2 + 4 * + 3 -])
;; => 14





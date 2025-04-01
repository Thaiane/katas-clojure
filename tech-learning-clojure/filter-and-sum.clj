;; Exercício 1: Manipulação de Sequências e Recursão Básica
;; 
;; Descrição:
;; Escreva uma função filter-and-sum que recebe uma sequência de números inteiros 
;; e filtra apenas os números pares, retornando a soma desses números. 
;; A função deve ser implementada de forma recursiva.
;;
;; Requisitos:
;; - Entrada: Uma sequência de números inteiros.
;; - Saída: A soma dos números pares na sequência.
;; - Restrições: A função deve ser implementada usando recursão.
;;
;; Exemplo de Uso:
;; (filter-and-sum [1 2 3 4 5 6 7 8 9 10])
;; ;; => 30

(defn filter-and-sum
  "Filtra os números pares"
  [numbers]
  (reduce + (filter even? numbers)))

(println (filter-and-sum [2 3 6 5 10 11]))

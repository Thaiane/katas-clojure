;; Descrição:
;; Escreve uma função `word-count` que recebe uma string e retorna um mapa onde as chaves são as palavras da string 
;; e os valores são o número de vezes que cada palavra aparece.

;; Requisitos:
;; Entrada: Uma string contendo palavras separadas por espaços. A string pode conter palavras repetidas.
;; Saída: Um mapa onde cada chave é uma palavra da string, e o valor associado é a contagem de vezes que essa palavra aparece.
;; Restrições: Utilize apenas funções da API padrão do Clojure. Considere que as palavras são case-sensitive 
;; (ou seja, "Word" e "word" são diferentes).

;; Dicas:
;; - A função clojure.string/split pode ser usada para dividir a string em palavras.
;; - A função frequencies pode ser útil para contar a ocorrência de elementos em uma sequência.
;; - Utilize a função clojure.string/lower-case se quiser que a contagem não seja case-sensitive.

;; Exemplo de Uso:
;; (word-count "hello world hello")
;; ;; => {"hello" 2, "world" 1}

;; (word-count "Clojure is fun and Clojure is powerful")
;; ;; => {"Clojure" 2, "is" 2, "fun" 1, "and" 1, "powerful" 1}

(require '[clojure.string :as str])

(defn word-count 
  "Conta quantas vezes cada palavra consta no texto de entrada"
  [text]
  (frequencies (str/split text #" ")))

(println (word-count "Clojure is fun and Clojure is powerful"))

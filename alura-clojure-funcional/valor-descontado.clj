(defn valor-descontado
  "Retorna valor descontado"
  [valor-bruto]
    (if (> valor-bruto 100)
      (let [desconto 0.10]
        (- valor-bruto (* valor-bruto desconto)))
      valor-bruto))

(println (valor-descontado 10))


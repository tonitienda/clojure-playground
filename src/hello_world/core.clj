(ns hello-world.core)

(defn add[x y]
  (+ x y)
)

(defn -main [& args]
  (def result (add 1 4))
  (def message (str "Hello, World!" result))
  (println message)
)
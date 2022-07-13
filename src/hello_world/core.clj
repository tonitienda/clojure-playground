(ns hello-world.core
  (:require [clojure.spec.alpha :as s])
)

(defn add[x y]
  (+ x y)
)

(s/fdef add
  :args (s/cat :x int :y int)
  :ret int
)

(defn -main [& args]
  (def result (add 1 1.5))
  (def message (str "Hello, World!" result))
  (println message)
)
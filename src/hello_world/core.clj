(ns hello-world.core
  (:require 
    [clojure.spec.alpha :as s]
    [clojure.spec.test.alpha :as st])
)

(defn add-test[x y]
  (+ x y)
)

(s/fdef hello-world.core/add-test
  :args (s/cat :x int :y int)
  :ret int
)

;; (st/instrument `add)
;; (st/check `add)

(s/fdef example-function :args (s/cat :x int))
(st/instrument `example-function)
(defn example-function [x]
  (+ x 1)
)

(defn -main [& args]
  (def result (add-test 1 3))
  (def result2 (example-function 3))
  (def message (str "Hello, World!" result, result2))
  (println message)
)
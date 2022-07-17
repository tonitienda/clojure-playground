start:
	docker build . -t clojure-playground
	docker run clojure-playground

repl:
	docker build . -t clojure-playground
	docker run -it clojure-playground clj

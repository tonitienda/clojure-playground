FROM clojure:latest 

WORKDIR /usr/app

COPY . .

RUN lein deps

CMD ["lein", "run"]
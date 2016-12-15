(ns {{name}}.core
  (:require [clojure.browser.repl :as repl]))
;; (:require [cljs.nodejs :as nodejs])

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

;; (nodejs/enable-util-print!)
(enable-console-print!)

;; nodejs
;; (defn -main [& args]
;;   (println "Hello world!"))
;; (set! *main-cli-fn* -main)

(println "Hello world!")

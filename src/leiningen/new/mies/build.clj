(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main '{{name}}.core
     :output-to "out/{{sanitized}}.js"
     :output-dir "out"
     :verbose true
     {{#nodejs-hook?}}
     :target :nodejs
     {{/nodejs-hook?}}})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))



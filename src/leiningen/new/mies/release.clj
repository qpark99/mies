(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:output-to "release/{{sanitized}}.js"
     :output-dir "release"
     :optimizations :advanced
     :verbose true
     {{#nodejs-hook?}}
     :target :nodejs
     {{/nodejs-hook?}}})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))

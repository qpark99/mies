(require
  '[cljs.build.api :as b]
  '[cljs.repl :as repl]
  '[cljs.repl.browser :as browser])

(b/build "src"
  {:main '{{name}}.core
   :output-to "out/{{sanitized}}.js"
   :output-dir "out"
   :verbose true
   {{#nodejs-hook?}}
   :target :nodejs
   {{/nodejs-hook?}}})

(repl/repl (browser/repl-env)
  :output-dir "out")

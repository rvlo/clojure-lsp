(defproject clojure-lsp :project/git-tag
  :jvm-opts ^:replace ["-Xmx2g" "-server"]
  :main clojure-lsp.main
  :resource-paths ["resources"]
  :javac-options ["-implicit:none"]
  :plugins [[me.arrdem/lein-git-version "2.0.8"]]
  :git-version {:status-to-version
                (fn [{:keys [tag]}]
                  tag)}
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.24.1"]
                             [lein-binplus "0.6.6"]]
                   :bin {:name "clojure-lsp"}}
             :uberjar {:aot :all}})

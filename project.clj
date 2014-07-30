(defproject borneo "0.5.0"
  :description "Clojure wrapper for Neo4j, a graph database."
  :url "https://github.com/wagjo/borneo"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.neo4j/neo4j "2.1.3"]]
  :dev-dependencies [[org.clojars.rayne/autodoc "0.8.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}}
  :jvm-opts ["-Dswank.encoding=utf-8"]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :autodoc {:copyright "Copyright (C) 2011, Jozef Wagner. All rights reserved."
            :web-src-dir "http://github.com/wagjo/borneo/blob/"
            :web-home "http://wagjo.github.com/borneo/"})

;;; you should install swank-clojure and lein-clojars locally:
;; lein plugin install swank-clojure 1.3.2
;; lein plugin install lein-clojars  0.7.0

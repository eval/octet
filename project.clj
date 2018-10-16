(defproject funcool/octet "1.1.1"
  :description "A clojure(script) library for work with binary data."
  :url "https://github.com/funcool/octet"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}
  :dependencies [[org.clojure/clojure "1.10.0-RC1" :scope "provided"]
                 [org.clojure/clojurescript "1.9.946" :scope "provided"]
                 [io.netty/netty-buffer "4.1.24.Final"]]

  :source-paths ["src"]
  :test-paths ["test"]

  :jar-exclusions [#"\.cljx|\.swp|\.swo|\.DS_Store|user.clj"]

  :codeina {:sources ["src"]
            :reader :clojure
            :exclude [octet.spec.basic
                      octet.spec.string
                      octet.spec.collections]
            :target "doc/dist/latest/api"
            :src-uri "http://github.com/funcool/codeina/blob/master/"
            :src-uri-prefix "#L"}

  :profiles
  {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]
         :aliases {"test-all" ["with-profile" "dev,1.8:dev,1.7:dev" "test"]}
         :global-vars {*warn-on-reflection* false}
         :plugins [[funcool/codeina "0.5.0"]
                   [lein-ancient "0.6.15"]]}
   :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}})



(defproject clojusc/coati "0.2.0-SNAPSHOT"
  :description "A Clojure wrapper for the Apache Olingo (OData) Java Library"
  :url "https://github.com/clojusc/coati"
  :scm {
    :name "git"
    :url  "https://github.com/clojusc/coati"}
  :license {
    :name "Apache License, Version 2.0"
    :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    ;; Java
    [org.apache.olingo/odata-commons-core "4.3.0"]
    [org.apache.olingo/odata-server-core "4.3.0"]
    [org.apache.olingo/odata-client-core "4.3.0"]
    [org.apache.olingo/odata-client-proxy "4.3.0" :exclusions [org.slf4j/slf4j-api]]
    ;; Support & Util libs
    [clojusc/twig "0.2.6"]
    [potemkin "0.4.3"]]
  :profiles {
    :uber {
      :aot :all}
    :test {
      :plugins [
        [jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]
        [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]]
      :test-selectors {
      :default :unit
      :unit :unit
      :system :system
      :integration :integration}}
    :doc {
      :plugins [
        [lein-codox "0.10.0"]]
      :codox {
        :project {:name "coati"}
        :output-path "docs/master/current"
        :doc-paths ["docs/source"]
        :namespaces [#"^coati\."]
        :metadata {
          :doc/format :markdown
          :doc "Documentation forthcoming"}}}
    :dev {
      :dependencies [
        [org.clojure/tools.namespace "0.2.11"]
        [lein-simpleton "1.3.0"]]
      :plugins [[lein-kibit "0.1.2"]
                [jonase/eastwood "0.2.3"]]
      :source-paths ["dev-resources/src"]
      :repl-options {:init-ns coati.dev}}})

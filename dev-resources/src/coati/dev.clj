(ns coati.dev
  (:require [clojure.tools.logging :as log]
            [clojure.tools.namespace.repl :as repl]
            [clojusc.twig :as logger]
            [coati.core :as coati]))

(logger/set-level! '[coati] :debug)

(def reload #'repl/refresh)

;;; Aliases

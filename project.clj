(defproject net.likestream/korma "0.3.0-beta10"
  :description "Tasty SQL for Clojure"
  :url "http://github.com/ibdknox/korma"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [c3p0/c3p0 "0.9.1.2"]
                 [org.clojure/java.jdbc "0.2.2"]]
  :codox {:exclude [korma.sql.engine korma.sql.fns korma.sql.utils]}
  )



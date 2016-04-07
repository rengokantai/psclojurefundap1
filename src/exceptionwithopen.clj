 (ns exceptionwithopen)
;try

 (try
   (/ 2 0)
   (catch ArithmeticException e
     "divide by zero")
   (finally
     (println "final")))

;throw
 (try
   (throw (Exception. "Wrong"))
   (catch Exception e (.getMessage e)))

;with-open
 (require '[clojure.java.io :as io])
 (with-open [f (io/writer "./text.txt")]
   (.write f "add"))

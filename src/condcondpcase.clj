 (ns condcondpcase)
;cond
(defn strb [n]
  (cond
    (= n 0) "zero"
    (= n 1) "one"
    :else "unknown" ))

 (print (strb 0))

;condp
(defn stre [n]
  (condp = n
    0 "zero"
    1 "one"
    :else "unknown" ))
(print (stre 0))
;cas(defn stre [n]
(defn strf [n]
  (case n
    0 "zero"
    1 "one"
    :else "unknown" ))
(print (strf 0))
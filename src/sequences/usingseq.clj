(ns sequences.usingseq)
(print (reduce + 10 (range 4)))
(print (into #{} "abc"))
(print (into {} [[:x 2] [:y 3]]))
(print (some {2 :b 3 :d} [1 2 3 nil 5]))                    ;get first element in seq hits the map and return the corresponding value
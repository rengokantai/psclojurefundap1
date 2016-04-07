(ns sequences.seqapi)
(print (cons 1 (rest (seq [1 2 3]))))
; always return seq, not vector

(def lista '(1,2,3))
(print (rest lista))
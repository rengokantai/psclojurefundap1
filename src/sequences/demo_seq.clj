(ns sequences.demo-seq)
(set! *print-length* 10)

;fibonacci
(print (iterate (fn [[a,b]]
                  [b (+ a b)])
                [0 1]))

;map. get first value

(print (map first(iterate (fn [[a,b]]
                            [b (+ a b)])
                          [0 1])))

;make a function
(def fib (
           map first(iterate (fn [[a,b]]
                               [b (+ a b)])
                             [0 1])
           ))

(print (take 3 fib))
(print (map inc (take 3 fib)))
 (ns recr)
;factorial
 (defn factorial
   ([n] (factorial 1 n))
   ([accum n]
     (if (zero? n)
       accum
       (factorial (* accum n) (dec n)))))
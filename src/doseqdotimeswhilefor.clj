 (ns doseqdotimeswhilefor)

;doseq
 (doseq [n (range 10)]
   (print n))

;dotimes
(dotimes [n 4]
  (print n))


;for
 (for [x [0 1]
       y [0 1]]
   [x y])

;loop
(loop [i 0]
  (if (<i 10)
    (recur (inc i))
    i))

;defn recur
 (defn increase [i]
   (if (<i 10)
     (recur (inc i))
     i))
 (increase 1)

;recur for recursion
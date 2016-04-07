 (ns iflet)
 (defn show-evens [coll]
   (if-let [evens (filter even? coll)]
     (println (str "evens are" evens))
     (println "no evens")))

 (show-evens [1 2 3 4])
(ns sequences.createseq)
;(print (iterate #(* 3 %)7))
; 7 21 63 189 567 1701 5103 15309 45927 137781 413343 1240029 3720087....

(print (re-seq #"[abc]" "abcdefgx"))
;print char in string also in seq
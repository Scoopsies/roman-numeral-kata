(ns roman-numerals.core)

(def numerals ["I" "V" "X" "L" "C" "D" "M"])

(defn- one-through-three [n numeral]
  (apply str (repeat n numeral)))

(defn one-through-nine [digit [numeral1 numeral2 numeral3]]
  (cond
    (= digit 4) (str numeral1 numeral2)
    (= digit 9) (str numeral1 numeral3)
    (>= digit 5) (str numeral2 (one-through-three (- digit 5) numeral1))
    :else (one-through-three digit numeral1)))

(defn int->numeral [n]
  (loop [n n numerals numerals result ""]
    (if (zero? n)
      result
      (recur (int (/ n 10)) (drop 2 numerals) (str (one-through-nine (mod n 10) numerals) result)))))


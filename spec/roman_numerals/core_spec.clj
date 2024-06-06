(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))

(defn- spec-test [input return]
  (should= return (int->numeral input)))

(describe "Roman Numeral Converter"
  (context "int->numeral"

    (it "converts 0"
      (spec-test 0 ""))

    (it "converts 1."
      (spec-test 1 "I"))

    (it "converts 2"
      (spec-test 2 "II"))

    (it "converts 3"
      (spec-test 3 "III"))

    (it "converts 4"
      (spec-test 4 "IV"))

    (it "converts 5"
      (spec-test 5 "V"))

    (it "converts 6"
      (spec-test 6 "VI"))

    (it "converts 7"
      (spec-test 7 "VII"))

    (it "converts 9"
      (spec-test 9 "IX"))

    (it "converts 10"
      (spec-test 10 "X"))

    (it "converts 11"
      (spec-test 11 "XI"))

    (it "converts 15"
      (spec-test 15 "XV"))

    (it "converts 114"
      (spec-test 114 "CXIV"))

    (it "converts 2024"
      (spec-test 2024 "MMXXIV"))
    )
  )

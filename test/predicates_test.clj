(ns predicates-test
  (:use iloveponies.tests.predicates)
  (require [predicates :refer :all]
           [midje.sweet :refer :all]))

(facts "sum-f"
       (sum-f inc dec 4) => 8)


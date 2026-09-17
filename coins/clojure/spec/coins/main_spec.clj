(ns coins.main-spec
  (:require [speclj.core :refer :all]
            [coins.main :as sut]))

(describe "main"

  (context "->coins returns"

    (it "nil cents"
      (should-be empty? (sut/->coins nil)))

    (it "0 cents"
      (should= 0 (:pennies (sut/->coins 0))))

    (it "1 cent"
      (should= 1 (:pennies (sut/->coins 1))))

    (it "2 cents"
      (should= 2 (:pennies (sut/->coins 2))))

    (it "5 cents"
      (let [{:keys [pennies nickels]} (sut/->coins 5)]
        (should= 1 nickels)
        (should= 0 pennies)))

    (it "6 cents"
      (let [{:keys [pennies nickels]} (sut/->coins 6)]
        (should= 1 nickels)
        (should= 1 pennies)))

    (it "7 cents"
      (let [{:keys [pennies nickels]} (sut/->coins 7)]
        (should= 1 nickels)
        (should= 2 pennies)))

    (it "8 cents"
      (let [{:keys [pennies nickels]} (sut/->coins 8)]
        (should= 1 nickels)
        (should= 3 pennies)))

    (it "10 cents"
      (let [{:keys [pennies nickels dimes]} (sut/->coins 10)]
        (should= 1 dimes)
        (should= 0 nickels)
        (should= 0 pennies)))

    (it "18 cents"
      (let [{:keys [pennies nickels dimes]} (sut/->coins 18)]
        (should= 1 dimes)
        (should= 1 nickels)
        (should= 3 pennies)))

    (it "25 cents"
      (let [{:keys [pennies nickels dimes quarters]} (sut/->coins 25)]
        (should= 0 dimes)
        (should= 0 nickels)
        (should= 0 pennies)
        (should= 1 quarters)))
  )
)
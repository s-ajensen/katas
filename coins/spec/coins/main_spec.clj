(ns coins.main-spec 
  (:require [speclj.core :refer :all]
            [coins.main :as sut]))

(describe "main" 
  
  (context "->coins returns"
    
    (it "nothing for nil cents"
      (should-be empty? (sut/->coins nil)))

    (it "nothing for no cents"
      (should-be empty? (sut/->coins 0)))
    
    (it "one penny"
      (should= 1 (:pennies (sut/->coins 1))))
    
    (it "two pennies"
      (should= 2 (:pennies (sut/->coins 2))))
    
    (it "one nickel"
      (let [coins (sut/->coins 5)] 
        (should= 1 (:nickels coins))
        (should-be nil? (:pennies coins)))) 
    
    (it "one nickel and one penny"
      (let [coins (sut/->coins 6)]
        (should= 1 (:nickels coins))
        (should= 1 (:pennies coins))))
    
    (it "one nickel and two pennies"
      (let [coins (sut/->coins 7)]
        (should= 1 (:nickels coins))
        (should= 2 (:pennies coins))))
    
    (it "one dime"
      (should= 1 (:dimes (sut/->coins 10))))
    
    (it "one quarter"
      (should= 1 (:quarters (sut/->coins 25))))
    
    (it "one quarter, one dime, one nickel, & one penny"
      (let [coins (sut/->coins 41)]
        (should= 1 (:quarters coins))
        (should= 1 (:dimes coins))
        (should= 1 (:nickels coins))
        (should= 1 (:pennies coins))))
    )
  )
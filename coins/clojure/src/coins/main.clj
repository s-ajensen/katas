(ns coins.main)

(def coins
  (into (sorted-map-by >)
    {1  :pennies
     5  :nickels
     10 :dimes
     25 :quarters}))

(defn ->coins [cents]
  (when cents
    (reduce
      (fn [{:keys [cents] :as acc} [val coin]]
        (-> (assoc acc coin (quot cents val))
            (assoc :cents (rem cents val))))
      {:cents cents}
      coins)))
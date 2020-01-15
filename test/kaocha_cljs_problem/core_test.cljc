(ns kaocha-cljs-problem.core-test
  (:require [kaocha-cljs-problem.core :as sut]
            #?(:clj [clojure.test :as t]
               :cljs [cljs.test :as t :include-macros true])))

(t/deftest plus-test
  (t/is (= 2 (sut/plus 1 1))))

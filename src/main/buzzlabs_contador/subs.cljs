;; src/main/buzzlabs_contador/subs.cljs
(ns buzzlabs-contador.subs
  (:require [re-frame.core :as rf]))

;; Assinatura que retorna o valor atual de :count
(rf/reg-sub
 :count
 (fn [db _]
   (:count db)))
;; src/main/buzzlabs_contador/views.cljs
(ns buzzlabs-contador.views
  (:require [re-frame.core :as rf]
            [buzzlabs-contador.subs :as subs]))

(defn contador-view []
  (let [count @(rf/subscribe [::subs/count])] ; Assina o valor do contador
    [:div {:style {:font-family "sans-serif", :padding "2em"}}
     [:h1 "Contador com re-frame"]
     [:p {:style {:font-size "2rem"}}
      "Valor atual: " [:strong count]]
     [:hr]
     [:button {:on-click #(rf/dispatch [:incrementar])
               :style {:padding "10px", :font-size "1rem", :cursor "pointer"}}
      "Incrementar"]
     [:button {:on-click #(rf/dispatch [:resetar])
               :style {:margin-left "10px", :padding "10px", :font-size "1rem", :cursor "pointer"}}
      "Resetar"]]))
;; src/main/buzzlabs_contador/events.cljs
(ns buzzlabs-contador.events
  (:require [re-frame.core :as rf]
            [buzzlabs-contador.db :as db]))

;; Evento para inicializar o banco de dados com o valor padrão
(rf/reg-event-db
 :initialize-db
 (fn [_ _]
   db/default-db))

;; Evento para incrementar o contador
(rf/reg-event-db
 :incrementar
 (fn [db _]
   (update db :count inc)))

;; Evento para resetar o contador
(rf/reg-event-db
 :resetar
 (fn [db _]
   (assoc db :count 0)))
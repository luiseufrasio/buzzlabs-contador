;; src/main/buzzlabs_contador/core.cljs
(ns buzzlabs-contador.core
  (:require [reagent.dom :as rdom]
            [re-frame.core :as rf]
            [buzzlabs-contador.events]  ;; Carrega os eventos para registrá-los
            [buzzlabs-contador.subs]    ;; Carrega as assinaturas para registrá-las
            [buzzlabs-contador.views :as views]))

(defn mount-root []
  (rdom/render [views/contador-view]
               (js/document.getElementById "app")))

(defn ^:export init []
  ;; Dispara o evento para configurar o estado inicial do app
  (rf/dispatch-sync [:initialize-db])
  ;; Monta a nossa view na página
  (mount-root))

;; Chama a função init quando o script é carregado
(init)
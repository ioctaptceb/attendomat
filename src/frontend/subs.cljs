(ns frontend.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))


(re-frame/reg-sub :attendees (fn [db]
                               (:attendees db)))

(re-frame/reg-sub :state (fn [db]
                           (:state db)))

(re-frame/reg-sub :filter-value (fn [db]
                                  (:filter-value db)))

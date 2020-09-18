
(ns hello-world.lumotest
  (:require [request]
            [chalk]
            [console]))

(defn -main [n]
  (println "rodou main")
  (request #js{:url "www.google.com"}
           (fn [_ _ body]
             (println body))))

(console/log (chalk/red "rodou fora"))
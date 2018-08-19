(ns reproduce-arity.core)

(defmacro my-macro []
  (partition 2))

(my-macro)

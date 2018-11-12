package fpInScala.exercise2_3

class Curry {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

}

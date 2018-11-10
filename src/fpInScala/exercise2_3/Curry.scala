package fpInScala.exercise2_3

/**
  * Created by Jp on 10/11/2018.
  */
class Curry {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

}

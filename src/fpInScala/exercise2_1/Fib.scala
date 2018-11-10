package fpInScala.exercise2_1

/**
  * Created by Jp on 10/11/2018.
  */
class Fib {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n <= 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }

}

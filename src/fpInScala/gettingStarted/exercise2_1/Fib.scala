package fpInScala.gettingStarted.exercise2_1

class Fib {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      // Base case, return prev if n less than or equal to 0
      if (n <= 0) prev
      // Recursive case, new prev is current, new current is prev + cur, decrement n
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }

  /* Stack trace for fib(5)
    loop(5, 0, 1)
    loop(4, 1, 1)
    loop(3, 1, 2)
    loop(2, 2, 3)
    loop(1, 3, 5)
    loop(0, 5, 8) n == 0 -> return prev = 5
   */

}

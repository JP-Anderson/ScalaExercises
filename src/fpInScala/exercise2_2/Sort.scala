package fpInScala.exercise2_2

class Sort {

  def isSorted[A](as: Array[A], ordering: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      // If n is greater than index of last item, we're sorted
      if (n >= as.length - 1) true
      // If ordering function is satisfied for current and next item, return false
      else if (!ordering(as(n), as(n + 1))) false
      // Otherwise, call again with n+1
      else go(n + 1)

    // Start at 0
    go(0)
  }

}

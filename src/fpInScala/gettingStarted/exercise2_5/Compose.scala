package fpInScala.gettingStarted.exercise2_5

class Compose {

  // Given: F1 which takes B and returns C, and F2 which takes A and returns B
  // Return result of F1 passed the result of F2 given A. F2 runs first.
  def compose[A, B, C](f1: B => C, f2: A => B): A => C =
    a => f1(f2(a))


}

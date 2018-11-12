package fpInScala.gettingStarted.exercise2_1
import org.scalatest.FlatSpec

class FibSpec extends FlatSpec {

  "fib 5" should "return 5" in {
    val fib = new Fib()
    assert(fib.fib(5) === 5)
  }

  "fib 10" should "return 55" in {
    val fib = new Fib()
    assert(fib.fib(10) === 55)
  }

}
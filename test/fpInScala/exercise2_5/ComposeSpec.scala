package fpInScala.exercise2_5

import org.scalatest.FlatSpec

class ComposeSpec extends FlatSpec {

  def minusOne(x : Int) : Int = x-1
  def double(x : Int) : Int = x*2

  val compose = new Compose()

  /*
    In this example we apply the function on the right first, or the leftmost
    function is applied to the result of the right function.
    This is the way it was in the example. Again, seems backwards to me, but
    perhaps I don't understand FP yet.
   */

  "composed methods" should "minus one then double" in {
    val input = 2
    assert(
      compose.compose(double, minusOne)(input) == 2
    )
  }

  it should "double then minus one" in {
    val input = 2
    assert(
      compose.compose(minusOne, double)(input) == 3
    )
  }

}
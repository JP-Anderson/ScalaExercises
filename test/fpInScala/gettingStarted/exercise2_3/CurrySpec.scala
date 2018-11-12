package fpInScala.gettingStarted.exercise2_3

import org.scalatest.FlatSpec

class CurrySpec extends FlatSpec {

  val curry = new Curry();

  def multiParamFunc(a: Int, b: Int): Int = a + b

  "'simple' addition example" should "work with multi-parameter syntax" in {
    assert(curry.curry(multiParamFunc)(1)(1) == 2)
  }

  "multi-parentheses method" should "be equivalent to " in {
    def multiParenthFunc(a: Int)(b: Int): Int = a + b
    assert(
      curry.curry(multiParamFunc)(1)(1)
        === multiParenthFunc(1)(1))
  }

  // Is that clear?

}
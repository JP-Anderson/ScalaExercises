package fpInScala.exercise2_3

import org.scalatest.FlatSpec

class AdditionCurrySpec extends FlatSpec {

  val curry = new AdditionCurry();

  "curried functions" should "be equivalent to multi-parameter version" in {
    assert(
      curry.uncurriedAdd(1, 1) === curry.longhandCurriedAdd(1)(1)
      && curry.longhandCurriedAdd(1)(1) === curry.shorthandCurriedAdd(1)(1)
    )
  }

}
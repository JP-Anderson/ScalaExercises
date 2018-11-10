package fpInScala.exercise2_3

import org.scalatest.FlatSpec

class AdditionCurrySpec extends FlatSpec {

  val curry = new AdditionCurry()

  "longhand and shorthand curries" should "be equivalent to non curried method with same params" in {
    assert(
      curry.uncurriedAdd(1, 1) === curry.longhandCurriedAdd(1)(1)
      && curry.longhandCurriedAdd(1)(1) === curry.shorthandCurriedAdd(1)(1)
    )
  }
  
}
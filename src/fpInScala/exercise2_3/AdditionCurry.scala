package fpInScala.exercise2_3

/**
  * Created by Jp on 10/11/2018.
  *
  * This shows a currying method for simple addition
  * I believe exercise 2-3 example complicates things by using generics
  *
  * This example will also demonstrate longhand and shorthand currying
  * source: http://baddotrobot.com/blog/2013/07/21/curried-functions/
  */
class AdditionCurry {

  def uncurriedAdd(x: Int, y: Int): Int = {
    x + y
  }

  def shorthandCurriedAdd(x: Int)(y: Int): Int = {
    x + y
  }

  def longhandCurriedAdd(x: Int): (Int => Int) = {
    (y: Int) => {
      x + y
    }
  }

}

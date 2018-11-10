package fpInScala.exercise2_2

import org.scalatest.FlatSpec

class SortSpec extends FlatSpec {

  val sort = new Sort();

  "ascending list" should "be sorted for x > y comparator" in {
    val ascendingList = Array(1,2,3,4,5)
    val greaterThanComparator = (x: Int, y: Int) => x > y
    assert(sort.isSorted(ascendingList, greaterThanComparator))
  }

  "ascending list" should "not be sorted for x < y comparator" in {
    val ascendingList = Array(1,2,3,4,5)
    val lessThanComparator = (x: Int, y: Int) => x < y
    assert(!sort.isSorted(ascendingList, lessThanComparator))
  }

  "descending list" should "be sorted for x < y comparator" in {
    val descendingList = Array(5,4,3,2,1)
    val greaterThanComparator = (x: Int, y: Int) => x < y
    assert(sort.isSorted(descendingList, greaterThanComparator))
  }

}
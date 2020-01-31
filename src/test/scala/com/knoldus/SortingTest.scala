package com.knoldus

import org.scalatest.FunSuite

class SortingTest extends FunSuite {

  val sorting = new Sorting

  test("Test Bubble Sort") {
    val array: Array[Int] = Array(3, 4, 5, 3, 2, 1)
    assert(sorting.bubbleSort(array) === array.sortBy(a => a))
  }

}

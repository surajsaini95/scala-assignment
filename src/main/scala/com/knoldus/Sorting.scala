package com.knoldus

class Sorting {

  def bubbleSort(array: Array[Int]): Array[Int] = {
    @scala.annotation.tailrec
    def recursiveBubble(arr: Array[Int], last: Int): Array[Int] = {
      if (last == 0) arr
      else {
        for (i <- 0 until last) {
          if (arr(i) > arr(i + 1)) {
            val temp = arr(i)
            arr(i) = arr(i + 1)
            arr(i + 1) = temp
          }
        }
        recursiveBubble(arr, last - 1)
      }
    }

    recursiveBubble(array, array.length - 1)

  }

}

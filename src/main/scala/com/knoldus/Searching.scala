package com.knoldus

class Searching {

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
      
    def recursiveLSearch(arr: Array[Int], index : Int, elem : Int): Boolean = {
	     if (index == arr.length) false
	     else if (arr(index) == elem ) true
	     else recursiveLSearch(arr,index+1, elem)
	}
	recursiveLSearch(array,0,elem)

  }

  
def binarySearch(array: Array[Int], elem: Int): Boolean = {
    
    def recursiveBSearch(arr: Array[Int], low : Int, high: Int, elem : Int): Boolean = {
	     if(low <= high){
	     	val mid = low + (high - low) / 2
	     	val ele = arr(mid)
	     if (ele == elem) true
	     else if (ele > elem ) recursiveBSearch(arr,low,mid -1, elem)
	     else recursiveBSearch(arr,mid+1,high, elem)
	     }
	     else false
	}
	recursiveBSearch(array,0,array.length,elem)
}


}

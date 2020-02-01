//solution1
def fibonacciRecursive(arr: Array[Int], limit: Int): Array[Int] = {
  if (limit > 2) {
    fibonacciRecursive(arr, limit - 1)
    arr(limit - 1) = arr(limit - 2) + arr(limit - 3)
  }
  arr
}
val limit: Int = 7
val arr: Array[Int] = new Array[Int](limit)
if (limit > 0) arr(0) = 0
if (limit > 1) arr(1) = 1

fibonacciRecursive(arr, limit)

//solution2
def area(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String = {
  shape match {
    case "rectangle" => s"Area of $shape is " + f(first, second)
    case "square" => s"Not defined yet for $shape."
    case _ => "Shape not found"
  }
}

area("rectangle", 5, 4, (first, second) => first * second)
area("square", 5, 4, (first, second) => first * second)

//solution3
def sum(f: (Int, Int) => Int, a: Int, b: Int): Int = {
  f(a, b)
}
def sumOfSquares(x: Int, y: Int) = x * x + y * y
def sumOfCubes(x: Int, y: Int) = x * x * x + y * y * y
def sumOfInts(x: Int, y: Int) = x + y

sum(sumOfSquares, 5, 4)
sum(sumOfCubes, 5, 4)
sum(sumOfInts, 5, 4)



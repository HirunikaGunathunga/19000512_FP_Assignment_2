object AdditionOfEven extends App {

  def evensum(n: Int):Int ={
    return (n * (n + 1))
  }
  def sum(n: Int): Int ={
    println(evensum(n))
    return 0
  }
  sum(4)
}

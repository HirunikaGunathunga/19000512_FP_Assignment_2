
//Can you write a recursive function prime(n) that returns true for a prime number and false for the other?

object Prime extends App{

  def isPrime(n: Int) : Boolean = {
    for (i <- 2 to n - 1) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  def prime(n: Int): Unit ={
    if (isPrime(n)==true)
      println("True")
    else
      println("False")
  }
  prime(8)
  prime(5)
}

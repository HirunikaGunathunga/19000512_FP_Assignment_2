
//Can you write a recursive function primeSeq(n) that prints all 	prime number which less than n?
object primeSeq extends App {

  def isPrime(n: Int) : Boolean = {
    for (i <- 2 to n - 1) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  def primeSeq(m: Int): Unit ={
    var result = new Array[Int](10)
    for (i <-2 to m ){
      if (isPrime(i)==true){
        print(i +" ")
      }
    }
  }
  primeSeq(10)
}

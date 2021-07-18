
//Can you write a recursive function to determine even and odd numbers?


object EvenorOdd extends App {
  def EoO(n: Int): Unit ={
    if(n%2 ==0){
      println("Even")
    }else{
      println("Odd")
    }
  }
  EoO(9)
}

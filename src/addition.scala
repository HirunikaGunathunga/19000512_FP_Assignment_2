

//Can you write a recursive function returns the addition of numbers from1 to n?
object addition extends App{

  def add(n:Int): Int ={

    if(n!=0){
      return n + add(n-1)

    }else{
      return 0
    }
  }
  def print(num:Int){
    println(add(num))
  }
  print(8)
}




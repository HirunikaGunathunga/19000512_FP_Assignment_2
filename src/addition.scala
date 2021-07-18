

//Can you write a recursive function returns the addition of numbers from1 to n?
object addition extends App{

  def add(n: Int): Int ={

    var add1:Int = 0
    for(a<-0 to n) {
      add1 = add1+a
    }
    return add1
  }
  var sum = add(8)
  print(sum)
}


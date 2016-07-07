object CollatzConjecture extends App {
  case class Experiment(val number: Int, val steps: List[Int])

  def collatz_steps(i: Int): List[Int] = {
    require(i > 0, "the number must be greater than zero.")
  
	  def iterate(i: Int, l: List[Int]): List[Int] =
	    if(i == 1) i :: l
	    else if(i % 2 == 0) iterate(i/2, i :: l)
	    else iterate(i * 3  + 1, i :: l)
	  
	  iterate(i, List.empty).reverse
  }
  
  def from(n: Int): Stream[Int] = n #:: from(n + 1)
  
  override def main( args:Array[String] ):Unit = {
    val steps_taken = from(1).map(i => Experiment(i, collatz_steps(i)))    
    steps_taken.take(100).toList.foreach(println)  
  }
}
/*
 * This version in Scala exploits some nice features of the language and
 * the functional programming paradigm, such as recursivity, Streams and
 * case classes.
 */

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

val N = 100

val experiments = from(1).map(i => Experiment(i, collatz_steps(i)))

experiments.take(N).toList.foreach(println)
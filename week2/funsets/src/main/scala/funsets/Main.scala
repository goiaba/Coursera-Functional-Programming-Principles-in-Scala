package funsets

object Main extends App {
  import FunSets._
  printSet(map(singletonSet(1000), x => x * 1))
}

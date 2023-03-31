class Sum {

  //Sums all the element of the List
  def listSum(list: List[Int]): Int = {
    val sum: Int = list match {
      case head :: tail => head + listSum(tail)
      case head :: Nil => head
      case Nil => 0
    }
    sum
  }
}


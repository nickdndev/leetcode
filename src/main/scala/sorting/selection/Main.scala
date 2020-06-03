package sorting.selection

object Main extends App {

  def sort(array: Array[Int]): Array[Int] = {

    for (i <- 0 until array.length-1) {

      var minIdx = i

      for (j <- i+1 until array.length) {
        if (array(j) < array(minIdx))
          minIdx = j
      }

      val temp = array(minIdx)
      array(minIdx) = array(i)
      array(i) = temp

    }

    array
  }

  println(sort(Array(54, 32, 1, 7, 3, 100)).mkString(" "))

}

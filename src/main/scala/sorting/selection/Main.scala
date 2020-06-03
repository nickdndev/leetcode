package sorting.selection

object Main extends App {

  def sort(array: Array[Int]): Array[Int] = {

    for (i <- array.indices) {

      var minIdx = i

      for (j <- i until array.length) {
        if (array(j) < array(i))
          minIdx = j

      }

      val temp = array(i)
      array(i) = array(minIdx)
      array(minIdx) = temp

    }

    array
  }

  println(sort(Array(54, 32, 1, 7, 3, 100)).mkString(" "))

}

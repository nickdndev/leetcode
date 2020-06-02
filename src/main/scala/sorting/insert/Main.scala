package sorting.insert

object Main extends App {

    def sort(array: Array[Int]): Array[Int] = {

        for (i <- 2 until array.length) {
            val key = array(i)

            var j = i - 1
            while (j >= 0 && array(j) > key) {
                array(j + 1) = array(j)
                j -= 1
            }

            array(j+1)=key
        }

        array
    }

    println(sort(Array(54,32,1,7,3,100)).mkString(" "))

}

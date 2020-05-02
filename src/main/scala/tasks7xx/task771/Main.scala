package tasks7xx.task771

import scala.collection.MapView

/* 771. Jewels and Stones

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.*/

object Main extends App {

    def numJewelsInStones(J: String, S: String): Int = {

        val gropedStones: MapView[Char, Int] = S.toSeq.groupBy(identity).view.mapValues(_.length)

        J.foldLeft(0)((acc, letter) => acc + gropedStones.getOrElse(letter, 0))
    }

    def numJewelsInStones2(J: String, S: String): Int =
        S.toSeq.count(J.contains(_))


    assert(3 == numJewelsInStones("aA", "aAAbbbb"))

}

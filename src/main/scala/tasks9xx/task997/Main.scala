package tasks9xx.task997

/*
997. Find the Town Judge

In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.*/

object Main extends App {
    def findJudge(N: Int, trust: Array[Array[Int]]): Int = {
        if (trust.length == 0 && N == 1) return 1
        if (trust.length == 0) return -1
        val trustCount: Array[Int] = Array.ofDim(N + 1)

        for (pair <- trust) {
            trustCount(pair(0)) -= 1
            trustCount(pair(1)) += 1
        }

        trustCount.indexWhere(_ == N - 1)

    }

    println(findJudge(3, Array(Array(1, 2), Array(2, 3), Array(3, 1))))
    println(findJudge(2, Array(Array(1, 2))))

}

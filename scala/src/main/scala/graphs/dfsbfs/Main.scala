package graphs.dfsbfs

import scala.annotation.tailrec

object Main extends App {
    case class Vertex(name: String, edges: Set[Vertex])

    // @tailrec
    def dfsLoop(current: Vertex, acc: List[Vertex]): Set[Vertex] = {
        (for (next <- current.edges if !acc.contains(next))
            yield dfsLoop(next, current +: acc)).flatten + current
    }


    def dfs(input: Vertex): List[Vertex] = {
        // @tailrec
        def go(v: Vertex, visited: List[Vertex]): List[Vertex] = {
            if (visited.contains(v)) {
                visited
            } else {
                val edges = v.edges.toList
                edges.foldLeft(v :: visited)((a, b) => go(b, a))
            }
        }

        go(input, List.empty)
    }


    def bfs(input: Vertex): List[Vertex] = {
        @tailrec
        def go(vs: List[Vertex], visited: List[Vertex]): List[Vertex] = {
            vs.flatMap(_.edges).filterNot(visited.contains) match {
                case Nil => visited
                case edges => go(edges, edges ::: visited)
            }
        }

        go(List(input), List(input))
    }
}

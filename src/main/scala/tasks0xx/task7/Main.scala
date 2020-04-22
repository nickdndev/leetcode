package tasks0xx.task7

import scala.annotation.tailrec

/*
7. Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21*/

object Main extends App {

    def reverse(x: Int): Int = {

        @tailrec
        def go(out: Int, input: Int): Int = {

            val dev = input % 10
            input match {
                case 0 => out
                case _ if out > Int.MaxValue / 10 || (out == Integer.MAX_VALUE / 10 && dev > 7) => 0
                case _ if out < Int.MinValue / 10 || (out == Integer.MIN_VALUE / 10 && dev < -8) => 0
                case _ => go(out * 10 + dev, input / 10)
            }
        }

        go(0, x)
    }


    assert(-321 == reverse(-123))
    assert(21 == reverse(120))
    assert(0 == reverse(1534236469))
}

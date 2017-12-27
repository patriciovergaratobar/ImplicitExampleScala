package com.pvergara.implicitexample

object TypeClassExample {

  trait MathOperation[T] {
    def sum(x: T, y: T): T
    def subtraction(x: T, y: T): T
    def divide(x: T, y: T): T
    def multiply(x: T, y: T): T
  }

  implicit object OperationInt extends MathOperation[Int] {
    def sum(x: Int, y: Int): Int = x + y
    def subtraction(x: Int, y: Int): Int = x - y
    def divide(x: Int, y: Int): Int = x / y
    def multiply(x: Int, y: Int): Int = x * y
  }

  implicit object OperationDouble extends MathOperation[Double] {
    def sum(x: Double, y: Double): Double = x + y
    def subtraction(x: Double, y: Double): Double = x - y
    def divide(x: Double, y: Double): Double = x / y
    def multiply(x: Double, y: Double): Double = x * y
  }

  implicit object OperationString extends MathOperation[String] {
    def sum(x: String, y: String): String = x.concat(y).concat(" no se puede sumar un text")
    def subtraction(x: String, y: String): String = x.concat(y).concat(" no se puede restar un text")
    def divide(x: String, y: String): String = x.concat(y).concat(" no se puede div un text")
    def multiply(x: String, y: String): String = x.concat(y).concat(" no se puede multiplicar un text")
  }

}
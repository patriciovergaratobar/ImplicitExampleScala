package com.pvergara.implicitexample


object App {

  def main(args: Array[String]): Unit = {

    println("Examples ")
    
    println("Examples with Int")
    println(Example.sum(5)(10))
    println("Examples with Double")
    println(Example.sum(5.3333)(10.3928))
    println("Examples with String")
    println(Example.sum("456")("2"))

    println("Other Examples")
    println(Example.divide(12)(6))
    println(Example.divide(5.3)(10.3))
  }
  
}

object Example {

  import com.pvergara.implicitexample.TypeClassExample.MathOperation
  
  def sum[T](valueA: T)(valueB: T)(implicit operation: MathOperation[T]):  T = operation.sum(valueA, valueB)

  def divide[T](valueA: T)(valueB: T)(implicit operation: MathOperation[T]):  T = operation.divide(valueA, valueB)

  def multiply[T](valueA: T)(valueB: T)(implicit operation: MathOperation[T]):  T = operation.multiply(valueA, valueB)
  
}
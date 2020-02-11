package com.knoldus

import org.scalatest._

class ArithmeticOperationSpec extends FlatSpec with BeforeAndAfterAll {

  var arithmeticOperation: ArithmeticOperation = new ArithmeticOperation

  override def beforeAll(): Unit = {
    arithmeticOperation = new ArithmeticOperation()
  }

  override def afterAll(): Unit = {
    if (arithmeticOperation != null)  {
      arithmeticOperation = null
    }
  }

  "Add method" should "add two numbers" in {
    val actualResult = arithmeticOperation.add(5, 5)

    val expectedResult = 10
    assert(expectedResult == actualResult)
  }

  "Subtract method" should "subtract two numbers" in {
    val actualResult = arithmeticOperation.subtract(5, 5)

    val expectedResult = 0
    assert(expectedResult == actualResult)
  }

  "Divide method" should "throw Arithmetic exception" in {
    try {
      arithmeticOperation.divide(5, 0)
    } catch {
      case ex:ArithmeticException => {
      assert(ex.getMessage == "Divide by zero not possible.")
      }
    }
  }
}

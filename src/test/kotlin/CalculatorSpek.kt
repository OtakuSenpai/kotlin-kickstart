package com.example

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import org.amshove.kluent.shouldEqual

class CalculatorSpek : Spek({
  describe("the calculator") {

    var calculator: Calculator? = null

    beforeEachTest {
      calculator = Calculator(NullResult())
    }

    it("should add two numbers") {
      var result = calculator?.add(12, 13)
      result shouldEqual 25
    }

    it("should accumulate one number") {
      calculator?.accumulate(23)
      calculator?.total shouldEqual 23
    }

    it("should accumulate two numbers") {
      calculator?.accumulate(2)
      calculator?.accumulate(4)
      calculator?.total shouldEqual 6
    }
  }

  describe("the output should be written correctly") {
    var result: Result = mock()
    val calculator = Calculator(result)

    it("should write the correct amount") {
      calculator.accumulate(23)
      verify(result).write(23)
    }
  }
})

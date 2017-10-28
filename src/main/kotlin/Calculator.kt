package com.example

interface Result {
  fun write(answer: Int)
}

class Calculator(val output: Result) {
  var total = 0

  fun add(x: Int, y: Int): Int {
    return x + y
  }

  fun accumulate(x: Int) {
    total += x
    output.write(total)
  }
}

class NullResult : Result {
  override fun write(answer: Int) {
  }
}


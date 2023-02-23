fun PancakeSort(ary: Array<Int>) {
  for (currSize in ary.size downTo 2) {
    val mi = findMax(ary, currSize)
    if (mi != currSize - 1) {
      flip(ary, mi)
      flip(ary, currSize - 1)
    }
  }
}

private fun findMax(ary: Array<Int>, n: Int): Int {
  var mi: Int
  var i: Int
  mi = 0
  i = 0
  while (i < n) {
    if (ary[i] > ary[mi]) {
      mi = i
    }
    ++i
  }
  return mi
}

private fun flip(ary: Array<Int>, i: Int) {
  var i = i
  var temp: Int
  var start = 0
  while (start < i) {
    temp = ary[start]
    ary[start] = ary[i]
    ary[i] = temp
    start++
    i--
  }
}

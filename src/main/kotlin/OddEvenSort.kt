
fun OddEvenSort(ary: Array<Int>) {
  var sorted = false
  while (!sorted) {
    sorted = true
    run {
      var i = 1
      while (i < ary.size - 1) {
        if (ary[i] > ary[i + 1]) {
          val temp = ary[i]
          ary[i] = ary[i + 1]
          ary[i + 1] = temp
          sorted = false
        }
        i += 2
      }
    }
    var i = 0
    while (i < ary.size - 1) {
      if (ary[i] > ary[i + 1]) {
        val temp = ary[i]
        ary[i] = ary[i + 1]
        ary[i + 1] = temp
        sorted = false
      }
      i += 2
    }
  }
}

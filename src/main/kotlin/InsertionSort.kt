
fun InsertionSort(ary: Array<Int>) {
  for (i in 0..ary.size - 1) {
    for (j in i downTo 1) {
      if (ary[j] < ary[j - 1]) {
        val tmp = ary[j]
        ary[j] = ary[j - 1]
        ary[j - 1] = tmp
      }
    }
  }
}

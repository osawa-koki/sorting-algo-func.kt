
fun StrandSort(ary: Array<Int>) {
  val n = ary.size
  for (i in 0 until n - 1) {
    var min_idx = i
    for (j in i + 1 until n) {
      if (ary[j] < ary[min_idx]) {
        min_idx = j
      }
    }
    val temp = ary[min_idx]
    ary[min_idx] = ary[i]
    ary[i] = temp
  }
}

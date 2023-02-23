
fun CombSort(ary: Array<Int>) {
  val n = ary.size
  var gap = n
  var swapped = true
  while (gap != 1 || swapped) {
    gap = if (gap > 1) {
      (gap / 1.3).toInt()
    } else {
      1
    }
    swapped = false
    for (i in 0 until n - gap) {
      if (ary[i] > ary[i + gap]) {
        val temp = ary[i]
        ary[i] = ary[i + gap]
        ary[i + gap] = temp
        swapped = true
      }
    }
  }
}

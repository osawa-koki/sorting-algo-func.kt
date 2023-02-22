
fun StoogeSort(ary: Array<Int>) {
  StoogeSort(ary, 0, ary.size - 1)
}

private fun StoogeSort(ary: Array<Int>, l: Int, h: Int) {
  if (l >= h) {
    return
  }
  if (ary[l] > ary[h]) {
    val t = ary[l]
    ary[l] = ary[h]
    ary[h] = t
  }
  if (h - l + 1 > 2) {
    val t = (h - l + 1) / 3
    StoogeSort(ary, l, h - t)
    StoogeSort(ary, l + t, h)
    StoogeSort(ary, l, h - t)
  }
}

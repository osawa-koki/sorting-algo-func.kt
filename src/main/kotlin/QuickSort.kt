fun QuickSort(ary: Array<Int>) {
  QuickSort(ary, 0, ary.size - 1)
}

private fun QuickSort(ary: Array<Int>, left: Int, right: Int) {
  if (left < right) {
    val pivot = Partition(ary, left, right)
    QuickSort(ary, left, pivot - 1)
    QuickSort(ary, pivot + 1, right)
  }
}

private fun Partition(ary: Array<Int>, left: Int, right: Int): Int {
  val pivot = ary[right]
  var i = left - 1
  for (j in left until right) {
    if (ary[j] <= pivot) {
      i++
      Swap(ary, i, j)
    }
  }
  Swap(ary, i + 1, right)
  return i + 1
}

private fun Swap(ary: Array<Int>, i: Int, j: Int) {
  val temp = ary[i]
  ary[i] = ary[j]
  ary[j] = temp
}

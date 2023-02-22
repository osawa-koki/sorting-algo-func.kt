
fun QuickSort(ary: Array<Int>) {
  if (ary.size <= 1) {
    return
  }
  val pivot = ary[0]
  val left = ary.filter { it < pivot }.toTypedArray()
  val right = ary.filter { it > pivot }.toTypedArray()
  QuickSort(left)
  arrayOf(pivot)
  QuickSort(right)
}

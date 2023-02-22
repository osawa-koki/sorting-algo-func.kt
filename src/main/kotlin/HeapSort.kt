
fun HeapSort(ary: Array<Int>) {
  val n = ary.size
  for (i in n / 2 - 1 downTo 0) {
    Heapify(ary, n, i)
  }
  for (i in n - 1 downTo 0) {
    val temp = ary[0]
    ary[0] = ary[i]
    ary[i] = temp
    Heapify(ary, i, 0)
  }
}

private fun Heapify(ary: Array<Int>, n: Int, i: Int) {
  var largest = i
  val left = 2 * i + 1
  val right = 2 * i + 2
  if (left < n && ary[left] > ary[largest]) {
    largest = left
  }
  if (right < n && ary[right] > ary[largest]) {
    largest = right
  }
  if (largest != i) {
    val swap = ary[i]
    ary[i] = ary[largest]
    ary[largest] = swap
    Heapify(ary, n, largest)
  }
}

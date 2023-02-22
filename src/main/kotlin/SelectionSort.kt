
fun SelectionSort(ary: Array<Int>): Array<Int> {
  for (i in 0..ary.size - 1) {
    var min = i
    for (j in i + 1..ary.size - 1) {
      if (ary[j] < ary[min]) {
        min = j
      }
    }
    val tmp = ary[i]
    ary[i] = ary[min]
    ary[min] = tmp
  }
  return ary
}

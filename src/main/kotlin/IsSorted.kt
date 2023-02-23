
fun IsSorted(ary: Array<Int>): Boolean {
  for (i in 0..ary.size - 2) {
    if (ary[i] > ary[i + 1]) {
      return false
    }
  }
  return true
}

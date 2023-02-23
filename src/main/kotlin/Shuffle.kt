
fun Shuffle(ary: Array<Int>): Array<Int> {
  for (i in 0..ary.size - 1) {
    val j = (Math.random() * ary.size).toInt()
    val tmp = ary[i]
    ary[i] = ary[j]
    ary[j] = tmp
  }
  return ary
}

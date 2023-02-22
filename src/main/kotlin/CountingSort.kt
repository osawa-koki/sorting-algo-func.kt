
fun CountingSort(ary: Array<Int>) {
  val n = ary.size
  val output = Array(n, { 0 })
  val count = Array(256, { 0 })
  for (i in 0..n - 1) {
    ++count[ary[i]]
  }
  for (i in 1..255) {
    count[i] += count[i - 1]
  }
  for (i in n - 1 downTo 0) {
    output[count[ary[i]] - 1] = ary[i]
    --count[ary[i]]
  }
  for (i in 0..n - 1) {
    ary[i] = output[i]
  }
}

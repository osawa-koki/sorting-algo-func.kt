
fun BucketSort(ary: Array<Int>) {
  val n = ary.size
  val output = IntArray(n)
  val count = IntArray(256)
  for (i in 0..255) {
    count[i] = 0
  }
  for (i in 0 until n) {
    count[ary[i]]++
  }
  for (i in 1..255) {
    count[i] += count[i - 1]
  }
  for (i in n - 1 downTo 0) {
    output[count[ary[i]] - 1] = ary[i]
    count[ary[i]]--
  }
  for (i in 0 until n) {
    ary[i] = output[i]
  }
}

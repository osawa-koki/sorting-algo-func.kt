
fun PigeonholeSort(ary: Array<Int>) {
  var min = ary[0]
  var max = ary[0]
  val range: Int
  var i: Int
  var j: Int
  var index: Int
  for (a in ary.indices) {
    if (ary[a] > max) {
      max = ary[a]
    }
    if (ary[a] < min) {
      min = ary[a]
    }
  }
  range = max - min + 1
  val phole = IntArray(range)
  i = 0
  while (i < ary.size) {
    phole[ary[i] - min]++
    i++
  }
  index = 0
  j = 0
  while (j < range) {
    while (phole[j]-- > 0) {
      ary[index++] = j + min
    }
    j++
  }
}

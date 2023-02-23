
fun CycleSort(ary: Array<Int>) {
  val n = ary.size
  for (cs in 0 until n - 1) {
    var item = ary[cs]
    var pos = cs
    for (i in cs + 1 until n) {
      if (ary[i] < item) {
        pos++
      }
    }
    if (pos == cs) {
      continue
    }
    while (item == ary[pos]) {
      pos++
    }
    val temp = item
    item = ary[pos]
    ary[pos] = temp
    while (pos != cs) {
      pos = cs
      for (i in cs + 1 until n) {
        if (ary[i] < item) {
          pos++
        }
      }
      while (item == ary[pos]) {
        pos++
      }
      val temp = item
      item = ary[pos]
      ary[pos] = temp
    }
  }
}

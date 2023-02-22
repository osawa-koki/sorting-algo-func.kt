
fun GnomeSort(ary: Array<Int>) {
  var i = 1
  var j = 2
  while (i < ary.size) {
    if (ary[i - 1] <= ary[i]) {
      i = j
      j++
    } else {
      val temp = ary[i - 1]
      ary[i - 1] = ary[i]
      ary[i] = temp
      i--
      if (i == 0) {
        i = j
        j++
      }
    }
  }
}

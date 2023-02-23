
fun ShellSort(ary: Array<Int>) {
  var h = 1
  while (h < ary.size / 3) {
    h = 3 * h + 1
  }
  while (h >= 1) {
    for (i in h..ary.size - 1) {
      for (j in i downTo h) {
        if (ary[j] < ary[j - h]) {
          val tmp = ary[j]
          ary[j] = ary[j - h]
          ary[j - h] = tmp
        }
      }
    }
    h = h / 3
  }
}

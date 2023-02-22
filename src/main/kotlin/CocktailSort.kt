
fun CocktailSort(ary: Array<Int>) {
  var swapped = true
  var start = 0
  var end = ary.size
  while (swapped == true) {
    swapped = false
    for (i in start until end - 1) {
      if (ary[i] > ary[i + 1]) {
        val temp = ary[i]
        ary[i] = ary[i + 1]
        ary[i + 1] = temp
        swapped = true
      }
    }
    if (swapped == false) {
      break
    }
    swapped = false
    end = end - 1
    for (i in end - 1 downTo start) {
      if (ary[i] > ary[i + 1]) {
        val temp = ary[i]
        ary[i] = ary[i + 1]
        ary[i + 1] = temp
        swapped = true
      }
    }
    start = start + 1
  }
}

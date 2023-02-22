
fun MergeSort(arr: Array<Int>) {
  if (arr.size > 1) {
    val middle = arr.size / 2
    val left = arr.sliceArray(0 until middle)
    val right = arr.sliceArray(middle until arr.size)

    MergeSort(left)
    MergeSort(right)

    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
      if (left[i] < right[j]) {
        arr[k] = left[i]
        i++
      } else {
        arr[k] = right[j]
        j++
      }
      k++
    }

    while (i < left.size) {
      arr[k] = left[i]
      i++
      k++
    }

    while (j < right.size) {
      arr[k] = right[j]
      j++
      k++
    }
  }
}

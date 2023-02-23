
fun Display(title: String, ary: Array<Int>) {
  var is_sorted = if (IsSorted(ary)) "\u001B[34m" + "true " + "\u001B[0m" else "\u001B[31m" + "false" + "\u001B[0m"
  println("${title.padEnd(20)} (${is_sorted}) : ${ary.joinToString(" ")}")
}

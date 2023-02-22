
fun main(args: Array<String>) {

  val ary = Array(10, { i -> i })

  // 配列を表示
  Display("Organized", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

}

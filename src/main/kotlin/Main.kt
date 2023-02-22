
fun main(args: Array<String>) {

  val ary = Array(10, { i -> i })

  // 配列を表示
  Display("Organized", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

  BubbleSort(ary)
  Display("Bubble Sort", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

  SelectionSort(ary)
  Display("Selection Sort", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

  InsertionSort(ary)
  Display("Insertion Sort", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

  MergeSort(ary)
  Display("Merge Sort", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

  QuickSort(ary)
  Display("Quick Sort", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

  ShellSort(ary)
  Display("Shell Sort", ary)

  Shuffle(ary)
  Display("Shuffled", ary)

  HeapSort(ary)
  Display("Heap Sort", ary)

}

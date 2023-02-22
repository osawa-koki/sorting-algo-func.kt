import org.junit.jupiter.api.Test

class SortingAlgoTest {
  @Test
  internal fun SortingAlgoTest() {

    val funcs = arrayOf(
      ::BubbleSort,
      ::SelectionSort,
      ::InsertionSort,
      ::MergeSort,
      ::QuickSort,
      ::ShellSort,
      ::HeapSort,
      ::CountingSort,
      ::BucketSort,
      ::CombSort,
      ::CycleSort,
      ::PancakeSort,
      ::GnomeSort,
      ::StoogeSort,
      ::PigeonholeSort,
      ::OddEvenSort,
      ::CocktailSort,
      ::StrandSort
    )

    val ary = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (sortAlgo in funcs) {
      Shuffle(ary)
      sortAlgo(ary)
      if (ary[0] !== 0 || ary[ary.size - 1] !== 9) {
        throw RuntimeException("SortingAlgoTest failed")
      }
    }

  }
}

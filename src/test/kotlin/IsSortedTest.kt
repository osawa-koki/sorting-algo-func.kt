import jdk.jfr.Description
import org.junit.jupiter.api.Test

class IsSortedTest {
  @Test
  @Description("IsSorted Test")
  fun IsSortedTest() {
    val sorted_array: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val unsorted_array: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 9, 8)
    assert(IsSorted(sorted_array))
    assert(IsSorted(unsorted_array) == false)
  }
}

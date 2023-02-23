import jdk.jfr.Description
import org.junit.jupiter.api.Test

class ShuffleTest {
  @Test
  @Description("Shuffle Test")
  fun ShuffleTest() {
    var ary = Array(10, { i -> i })
    var is_sorted = true
    Shuffle(ary)
    // 整列されていないことを確認
    for (i in 0 until ary.size - 1) {
      if (ary[i] <= ary[i + 1]) {
        is_sorted = false
        break
      }
    }
    assert(is_sorted == false)
  }
}

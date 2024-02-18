import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals
class BubbleSortTest {
    @Test
    fun `sorts an array of one element`() {
        val bubbleSort = BubbleSort()
        val arr = intArrayOf(10)
        val actual = bubbleSort.sort(arr)
        val expected = intArrayOf(10)
        assertArrayEquals(expected, actual)
    }
}
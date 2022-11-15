import LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring
import org.scalatest.funsuite.AnyFunSuite

class LongestSubstringWithoutRepeatingCharactersTest extends AnyFunSuite {
  test(
    """Input: s = "abcabcbb"
      |Output: 3""".stripMargin) {
    assert(lengthOfLongestSubstring("abcabcbb") == 3)
  }
  test(
  """Input: s = "bbbbb"
    |Output: 1""".stripMargin) {
    assert(lengthOfLongestSubstring("bbbbb") == 1)
  }
  test(
    """Input: s = "pwwkew"
      |Output: 3""".stripMargin) {
    assert(lengthOfLongestSubstring("pwwkew") == 3)
  }
}

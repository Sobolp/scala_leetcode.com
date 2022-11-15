import scala.util.control.Breaks._

object LongestSubstringWithoutRepeatingCharacters {
  def lengthOfLongestSubstring(s: String): Int = {
    var result = 0
    for (i <- 0 to s.length - 1) {
      var charSet = scala.collection.mutable.Set.empty[Char]
      breakable {
        for (j <- i to s.length - 1) {
          if (!charSet.contains(s.charAt(j))) charSet.add(s.charAt(j)) else break
        }
      }
      result = math.max(result, charSet.size)
    }
    result
  }

}

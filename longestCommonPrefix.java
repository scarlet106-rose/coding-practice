public class longestCommonPrefix {
  public String lcp(String[] strs) {
    if (strs == null || strs.length == 0) { // returns empty string if the list is empty since there is no common prefix at all
      return "";
    }

    int minLen = Integer.MAX_VALUE;
    for (String s : strs) {
      if (s.length() < minLen) { // sets minimum length of the prefix to the smallest string because largest COMMON prefix cannot be bigger than the smallest word
        minLen == s.length();
      }
    }
    
    int i = 0;
    while (i < minLen) { // so that strings are not compared to more characters than the least one has
      for (String s : strs) {
        if (s.charAt(i) != strs[0].charAt(i)) { // iterates through the list of string and checks if each character in the string matches the first string characters UNTIL the shortest strings last character
          return strs[0].substring(0, i); // if a character comes back as not being equal the loop ends and the prefix up until right before the unequal characters is returned.
        }
      }
      i++; // this increments i
    }
    return strs[0].substring(0, i); // if the entire length of characters up until the shortest strings last value comes back as equal then the entirety of those characters up until that cutoff is returned.
    
  }
}

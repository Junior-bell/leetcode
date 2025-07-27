public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        // If the string is empty or null, there's no substring to check, so return 0
        if (s == null || s.length() == 0) return 0;
        
        // This HashMap will keep track of each character and its most recent position
        Map<Character, Integer> charIndex = new HashMap<>();
        // This variable stores the length of the longest substring we've found
        int maxLength = 0;
        // This marks the start of our current substring (the sliding window)
        int start = 0;
        
        // Loop through each character in the string
        for (int end = 0; end < s.length(); end++) {
            // Grab the current character at the 'end' pointer
            char currentChar = s.charAt(end);
            
            // If we've seen this character before AND its last position is at or after our window's start,
            // we need to shrink the window to avoid repeating characters
            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= start) {
                // Move the start of the window to just after the last occurrence of this character
                start = charIndex.get(currentChar) + 1;
            }
            
            // Update the character's latest position in the HashMap
            charIndex.put(currentChar, end);
            
            // Calculate the length of the current window (end - start + 1)
            // and update maxLength if this window is longer
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        // Return the length of the longest substring without repeating characters
        return maxLength;
    }

    public static void main(String[] args) {
        // Create an instance of our class to test the solution
        LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();
        // Test with the string "abcabcbb"
        String input = "abcabcbb";
        // Run the method and get the result
        int result = solution.lengthOfLongestSubstring(input);
        // Print the result in a clear way
        System.out.println("Length of longest substring without repeating characters: " + result);
        // Expected output: Length of longest substring without repeating characters: 3
    }
}

package easy.index_of;

//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class Solution {

//    Runtime: 2 ms, faster than 51.17% of Java online submissions for Implement strStr().
//    Memory Usage: 37.1 MB, less than 99.57% of Java online submissions for Implement strStr().
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int start = i + 1;
                boolean isSubString = true;
                for (int j = 1; j < needle.length(); j++, start++) {
                    if (haystack.charAt(start) != needle.charAt(j)) {
                        isSubString = false;
                        break;
                    }
                }
                if (isSubString) {
                    return i;
                }
            }
        }
        return -1;
    }
}

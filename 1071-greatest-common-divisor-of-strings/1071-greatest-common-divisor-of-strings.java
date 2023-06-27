class Solution {
    public int gcd(int a, int b) {
        int r = a % b;
        if (r == 0) return b;
        else return gcd(b, r); 
    }
    
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        
        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}


// class Solution {
//     public int gcd(int x, int y) {
//         if (y == 0) {
//             return x;
//         } else {
//             return gcd(y, x % y);
//         }    
//     }
    
//     public String gcdOfStrings(String str1, String str2) {
//         // Check if they have non-zero GCD string.
//         if (!(str1 + str2).equals(str2 + str1)) {
//             return "";
//         }
        
//         // Get the GCD of the two lengths.
//         int gcdLength = gcd(str1.length(), str2.length());
//         return str1.substring(0, gcdLength);
//     }
// }
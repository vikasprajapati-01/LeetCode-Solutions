class Solution {
    public int mirrorReflection(int p, int q) {
        while(p % 2 == 0 && q % 2 == 0) {  // To make either p or q odd
            p /= 2;
            q /= 2;
        }

        // here p is the light reflection (if p is even then corner is 2)
        // q is the room extension (if q is odd then 1 or 0)

        if(q % 2 == 0 && p % 2 == 1) return 0;
        if(q % 2 == 1 && p % 2 == 1) return 1;
        if(q % 2 == 1 && p % 2 == 0) return 2;

        return -1;
    }
}

class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y); // XOR operator and Integer methods
    }
}

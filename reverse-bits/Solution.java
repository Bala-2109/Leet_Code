class Solution {
    public int reverseBits(int n) {
        StringBuilder binary=new StringBuilder(String.format("%32s",Integer.toBinaryString(n)).replace(' ','0'));
        binary.reverse();
        return Integer.parseUnsignedInt(binary.toString(),2);
    }
}
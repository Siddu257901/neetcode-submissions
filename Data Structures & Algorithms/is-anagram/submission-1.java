class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] Sar=s.toCharArray();
        char[] Tar=t.toCharArray();
        Arrays.sort(Sar);
        Arrays.sort(Tar);
        return Arrays.equals(Sar,Tar);
    }
}

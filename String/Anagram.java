class Solution{
  public boolean isAnagram(String s, String t){
    if(s.length() != t.length())
      return false;
    int freq[] = new int[26];
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    for(int i = 0; i< s.length(); i++){
      freq[str1[i] - 'a'] ++;
      freq[str2[i] - 'a'] --;
    }
    for(int count : freq){
      if(freq[count] ! = 0){
        return false;
      }
    }
    return true;
  }
}

    

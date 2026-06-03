class Solution {

    public String reverseStr(String s, int k) {
      char arr[] = s.toCharArray();
      int j=0, len = arr.length;
      for(int i = 0; i< len; i+=2*k){
        j = Math.min(i+k-1, len-1);
        for(int m = i ; m < j; m++,j--){
          char temp = arr[m];
          arr[m] = arr[j];
          arr[j] = temp;
        }
      }
      return new String(arr);
    }
}

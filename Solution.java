import java.util.*;
class Solution {
    public long smallestNumber(long num) {

        if(num == 0) return 0;

        if(num>0){
           char digits[] = Long.toString(num).toCharArray();
           Arrays.sort(digits);

           int index = 0;
           while(index < digits.length && digits[index] == '0'){
            index++;
           }

           if(index < digits.length){
            char temp = digits[0];
            digits[0] = digits[index];
            digits[index] = temp;

           }
           return Long.parseLong(new String(digits));
        }

        else{
            
            char digits [] = Long.toString(-num).toCharArray();
            Arrays.sort(digits);
            reverseArray(digits);
            return -Long.parseLong(new String(digits));
        }
    }

        private void reverseArray(char [] arr){
            int i=0 , j= arr.length-1;
            while(i<j){
                char temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
        }
        
    
}

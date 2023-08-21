import java.util.*;
public class exp2{
    public static String largest_number(int []nums){
        int n=nums.length;
        String[]s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=String.valueOf(nums[i]);
        }
        StringBuilder sb=new StringBuilder();

        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));

        for(String str:s){
            sb.append(str);
        }
        String result=sb.toString();

        return result.startsWith("0")?"0":result;
    }
    public static void main(String[]args){
        int nums[]={3,30,34,5,9};
        System.out.println(largest_number(nums));

    }
}

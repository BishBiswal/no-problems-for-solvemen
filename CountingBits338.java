//It works on the concept that suppose y/2=x. if x has k Ones, then then y will have k+1 or k ones depending upon x is even or odd.

class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        
        arr[0]=0;
        if(n==0) return arr;
        arr[1]=1;
        if(n==1) return arr;
        arr[2]=1;
        if(n==2) return arr;
        
        for(int i=3;i<=n;i++){
            if(i%2!=0) arr[i]=arr[i/2]+1;
            else arr[i]=arr[i/2];
        }
        
        return arr;
        
    }
}

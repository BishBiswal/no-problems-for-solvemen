public class DecimalToBinary
{
    public static String dtb(int n){
        StringBuilder sb=new StringBuilder();

        int[] arr=new int[1000];

        int i=0;
        while(n!=0){
            arr[i]=n%2;
            n=n/2;
            i++;
        }

        for(int j=i-1;j>=0;j--){
            sb.append(arr[j]);
        }
    return sb.toString();
    }

    public String baseNeg2(int n) {
        if(n==0)
            return "0";
        String ans = "";
        while(n!=0){
            int rem = n%-2;
            n = n/-2;
            if(rem==-1){
                n++;
                rem = 1;
            }
            ans = String.valueOf(rem).concat(ans);
        }
        return ans;
    }

    public static void main(String[] args){
        String res=DecimalToBinary.dtb(5);
        System.out.println(res);

    }
}

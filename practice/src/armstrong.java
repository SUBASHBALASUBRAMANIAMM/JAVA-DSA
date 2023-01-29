public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        //System.out.println(arm(num));
        for(int j = 100;j <1000;j++){
            if(arm(j)!=0){
            System.out.println(arm(j));}
        }
    }

    static int arm(int num) {
        int temp = num;
        int ans = 0;
        while (num > 0) {
            int i = num % 10;
             ans = ans + (i*i*i);

        }
        if(ans==temp){
            return ans;
        }
        return  0;
    }
}

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class flames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inp1 = input.next();
        String inp2 = input.next();
        inp1 = inp1.toLowerCase();
        inp2 = inp2.toLowerCase();
        char[] first_name = inp1.toCharArray();
        char[] second_name = inp2.toCharArray();
//        System.out.println(inp1);
//        System.out.println(inp2);
        int count =0  ;
        int flame_count=1;
        for (int i = 0; i < first_name.length; i++) {
            for(int j =0;j<second_name.length;j++){
                if (first_name[i]==second_name[j]) {
                    count++;
                    first_name[i]=0;
                    second_name[j]=0;
                    break;

                }
            }
        }
        count = count*2;
        flame_count = (inp1.length() + inp2.length())-count;
        System.out.println(flame_count);
        char[] flames = {'f','l','a','m','e','s'};
        int ind =0;
        int counter =0;
        int flag =0;
        while(flag<5){
            if(flames[ind]!='x')
            {
                counter++;
                if(counter==flame_count){
                    flames[ind]='x';
                    flag++;
                    counter=0;
                }
            }
            ind++;
            if(ind==6){
                ind =0;
            }
        }
        System.out.println(Arrays.toString(flames));
    }
}

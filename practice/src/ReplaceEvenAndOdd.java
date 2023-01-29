public class ReplaceEvenAndOdd {
    public static void main(String[] args) {

        int input = 123456789;
        int start_pos = 1;
        int digit;
        int even_startdigit;
        int even_enddigit;

        int end_pos = 1;
        while(start_pos<input){
            start_pos = start_pos*10;
        }
        start_pos /= 10;
        while (start_pos>end_pos){
            while (true){
                digit = (input/start_pos)%10;
                if(digit%2==0){
                    even_startdigit=digit;
                    break;
                }else{
                    start_pos = start_pos/10;
                }}
            // System.out.printf("%d %d",even_startdigit,start_pos);
            while (true){
                digit = (input/end_pos)%10;
                if(digit%2==0){
                    even_enddigit=digit;
                    break;
                }else{
                    end_pos = end_pos*10;
                }}end_pos = end_pos*10;
//        System.out.printf("%d %d",even_enddigit,end_pos); //12345
            int num1 = (input/start_pos)/10;//1
            int num2 = num1*10 + even_enddigit;//14
            int num3 = (num2*start_pos) + input%start_pos;
            input = num3;
//        System.out.println(input);

            num1 = (input/end_pos)*10 + even_startdigit;
            num2 = (input%end_pos)%(end_pos/10);
            num3 = num1*(end_pos/10) +num2;
            input =num3;
            System.out.println(end_pos);
            start_pos = start_pos/10;
            end_pos = end_pos*10;

            System.out.println(input);
        }

    }
}
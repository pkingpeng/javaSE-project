public class H4 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        while(true){
            sum += i;
            if(sum > 500){
                System.out.println(sum);
                break;
            }
            i++;
        }
    }
}

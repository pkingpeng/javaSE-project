public class H3 {
    public static void main(String[] args){
        int a = 1;
        long sum = 0;
        for (int i =1 ; i<= 1000; i ++){
            sum += i;
            if(sum % 10 == 8){
                a++;
            }

        }
        System.out.println("和以8结尾的个数："+a);
    }
}

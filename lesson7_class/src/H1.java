public class H1 {
    /**
     * print
     *     **
     *   ******
     * **********
     *   ******
     *     **
     */
    public static void main(String[] args){
        // 2 6 10
        // 1*4-2 2*4-2 3*4-2
        // 空格 4 2 0
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 6 - 2*i; j++){
                System.out.print(" ");
            }
            for(int j =1; j <= i * 4- 2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 6 2
        // 空格 2 4
        for(int i = 2; i >= 1; i--){
            for (int j = 1; j <= 4/i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 4 -2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

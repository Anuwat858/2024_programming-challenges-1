import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        int sum;
        int num2;
         Scanner sc = new Scanner(System.in);
         int[] num1 = new int[5];
         for(int i =0; i< num1.length;i++){
             System.out.print("input arry"+i+ ": ");
             num1[i] =sc.nextInt();
             }
            System.out.print("input-Num:");
            num2 = sc.nextInt();
            for(int j = 0; j < num1.length; j++){
                for(int h = j+1; h<num1.length;h++){
                    sum = num1[j] + num1[h];
                    if(sum == num2){
                       System.out.print("["+num1[j]+","+num1[h]+"]"); 
                    }
                }
            }
    }
}

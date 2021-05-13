package MyPractice;

public class loops {
    public static void main(String[] args) {
        //sum of even
        int sum=0;
       for(int i = 1; i <=100;i++){
           if (i%2==0){
               System.out.println((i));
               sum+=i;
            }

        }
        System.out.println(sum);


       //sum of odd
        for(int n = 0; n<=100;n++ ){
            if(n % 2 !=0){
                System.out.println(n);
                sum+=n;
            }
        }
        System.out.println(sum);

    }
}

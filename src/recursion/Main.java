package recursion;

public class Main {

    public static  void  main (String [] args){
        System.out.println(recursiveFact(3));
        System.out.println(iteraviteFact(3));
    }

    public static int recursiveFact(int num){
        if (num == 0){
            return 1;
        }
        return  num *recursiveFact(num-1);
    }

    public static  int iteraviteFact (int num){
        if(num == 0){
            return 1;
        }
        int fact = 1;
        for (int i = 1 ; i<= num ; i++){
            fact *= i;
        }
        return fact;
    }
}

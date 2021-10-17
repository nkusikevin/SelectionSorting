package insertionSort;

public class Main {

    public  static  void main(String [] args){
        int [] arry = { 23,66,4,3,7,90,122,445,33,500};
        for ( int firstUnsortedIndex = 1 ; firstUnsortedIndex < arry.length ; firstUnsortedIndex++){
            int newElement = arry[firstUnsortedIndex];
            int i ;
            for (i = firstUnsortedIndex ; i > 0 && arry[i-1]>newElement ; i--){
                arry[i] = arry[i-1];
            }
            arry[i] = newElement;
        }

        for (int y = 0 ; y< arry.length ; y++){
            System.out.println( y + " : " + arry[y]);
        }
    }
}

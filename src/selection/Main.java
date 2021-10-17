package selection;

public class Main {
    public static void main(String [] args){
       int [] arry = { 23,66,4,3,7,90,122,445,33};
for ( int lastUnsortedIndex = arry.length-1; lastUnsortedIndex >0 ; lastUnsortedIndex--){
    int largest = 0;
    for ( int i = 1 ; i<= lastUnsortedIndex ; i++){
        if (arry[i] > arry[largest]){
            largest = i;
        }
    }
    swap( arry, largest ,lastUnsortedIndex);
}



       for (int y = 0 ; y< arry.length ; y++){
           System.out.println(arry[y]);
       }
    }

    public  static  void swap( int [] arry , int i , int j ){
        if( i == j){
            return;
        }
        int temp  = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }

}

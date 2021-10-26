package mergeSort;

public class Main {
    public  static  void main(String [] args) {
        int[] arry = {23, 66, 4, 3, 7, 90, 122, 445, 33, 500};

        //invocation of merge function
        mergeSort(arry,0, arry.length);
        for (int y = 0 ; y< arry.length ; y++){
            System.out.println( y + " : " + arry[y]);
        }
    }

    public  static  void mergeSort( int [] array , int start ,int end){
      if( end-start < 2 ){
          return;
      }
      int mid = (start + end) / 2;
      mergeSort(array ,start , mid);
      mergeSort(array , mid ,end);
      merge(array , start , mid ,end);
    }

    public static  void merge (int [] arry , int start , int mid , int end){
        if (arry[mid-1] <= arry[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0 ;
        int [] temp = new int[end - start];
        while (i<mid && j<end){
            temp[tempIndex++] = arry[i] <= arry[j] ? arry[i++] : arry[j++];
        }
        System.arraycopy( arry ,i ,arry , start+tempIndex ,mid-i);
        System.arraycopy( temp, 0 ,arry, start , tempIndex);
    }
}

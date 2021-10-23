package shellSort;

public class Main {

    public static void main( String [] arg){
        int [] array = {12,3,55,23,54,33,778,45,67,22};

        for (int gap = array.length/2 ; gap>0 ; gap/=2){
            for (int i = gap ; i< array.length ; i++){
                int newElement = array[i];
                int j = i;

                while( j>= gap && array[j-gap] > newElement){
                    array[j] = array[j - gap];
                    j-=gap;
                }
                array[j] = newElement;
            }
        }
        for (int i=0 ; i< array.length ; i++){
            System.out.println(array[i]);
        }
    }
}

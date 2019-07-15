public class selectionSort{
  public static void main(String[]args){
    int [] array = {300, 80, 70, 50, 49, 39, 37, 2};
    for (int i = 0; i < array.length-1; i++){ 
            int minindex = i; 
            for (int j = i+1; j < array.length; j++) 
              if (array[j] < array[minindex]){ 
                    minindex = j; 
       }
            int temp = array[minindex]; 
            array[minindex] = array[i]; 
            array[i] = temp; 
        } for(int i = 0; i<array.length; i++){
      System.out.print(array[i]+" ");
    }
        System.out.println();
    } 
  }


public class insertionSort{
  public static void main(String[]args){
    int temp = 0; 
    int [] array = {300, 80, 70, 50, 49, 39, 37, 2};
    for(int j = 0; j< array.length-1; j++){
      for(int i = 0; i < array.length-1-j; i++){
      if(array[i]>array[i+1]){
        temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
      }
      for(int k = 0; k <array.length; k++){
      System.out.print(array[k]+ " ");
    }
      System.out.println();
    }
    }
    System.out.println("=============================================================");
    for(int i = 0; i <array.length; i++){
      System.out.print(array[i]+ " ");
    }
  }
}
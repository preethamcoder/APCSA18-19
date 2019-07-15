import java.util.Scanner;
public class averages{
  public static void main(String[]args){
    /*Scanner sc = new Scanner(System.in);
    int h, total=0;
    System.out.println("How many values do you plan on entering? ");
    h = sc.nextInt();
    
    for(int i = 0; i<h; i++){
      int n = sc.nextInt();
      total += n;
      
    }
      double avg = total/h;
      System.out.println(avg);*/
    catDog("catdogcatdogcatdog");
     
 
  }

public static boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  System.out.println(str);
  for(int i=0; i<str.length()-2; i++){
    if(str.substring(i,(i+3)).equals("cat")){
      catCount += 1;
      System.out.println("cat Matched");
    }
    if(str.substring(i,(i+3)).equals("dog")){
      dogCount += 1;
      System.out.println("dog Matched");
    }
    
  }
  if(catCount==dogCount){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
    return(false);
}
}
      
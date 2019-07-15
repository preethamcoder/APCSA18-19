// ****************************************************************
//   Name.java
//
//   Use Name class to get names, first, middle, and last. 
//   String comparison       
// ****************************************************************

public class Name{
  private String firstName;
  private String middleName;
  private String lastName;
  //private String named = (firstName+" "+middleName+" "+lastName);
  
  public Name(String fistName, String secondName, String surName){ 
    firstName = fistName;
    middleName = secondName;
    lastName = surName;
  }
  public String getFirst(){
    return firstName;
  }
  public String getMiddle(){
    return middleName;
  }
  public String getLast(){
    return lastName;
  }
  public String firstMiddleLast(){
    //System.out.println(firstName);
    //System.out.println(middleName);
    //System.out.println(lastName);
    //return("QWIEUHJL");
    return(firstName+" "+middleName+" "+lastName);
  }
  public String lastFirstMiddle(){
    return(lastName+", "+firstName+" "+middleName);
  }
  public boolean equals(Name otherName){
    if(firstMiddleLast().equals(otherName.firstMiddleLast())){
      return(true);
    }else{
      return(false);
    }
  }
  public String initials(){
    return (firstName.substring(0,1).toUpperCase()+" "+middleName.substring(0,1).toUpperCase()+" "+lastName.substring(0,1).toUpperCase());
  } 
  public int length(){
    return(firstName.length()+middleName.length()+lastName.length());
  }
}
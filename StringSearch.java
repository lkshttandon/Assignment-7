import java.util.Scanner;
public class StringSearch{
    String[] arr={"Apple","Banana","Orange","Kiwi"};

    public void search(String value){
      boolean flag=false;
      Assignment2 obj=new Assignment2();
      for(String i:obj.arr){
          if(i.compareTo(value)==0){
              flag=true;
              break;
          }
          else{
             flag=false;
          }
      }
      if(flag){
          System.out.println("Present");
      }
      else
      {
          System.out.println("Not Present");
      }
    }

    public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     String val=s.nextLine();
     StringSearch d=new StringSearch();
     d.search(val);
    }
}
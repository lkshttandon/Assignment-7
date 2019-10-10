import java.util.Scanner;
public class ArraySort{
    
    public static void main(String[] args) {
      
        final int n=5;
        String temp;
       
        String a[] = new String[n];
        Scanner sc = new Scanner(System.in);
  
        for(int i:a)
        {
            a[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i].compareTo(a[j])>0) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted array:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        
    }
}

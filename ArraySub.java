import java.util.Arrays;

public class ArraySub{
    String[] arr1={"Blue","Red","Green","Yellow","Purple","Violet"};
    String[] arr2={"Violet","Red","Green"};

    public void Subtract(){
        
        ArraySub d=new ArraySub();
        int k = d.arr1.length-d.arr2.length;
        int c=0;
        
        int counter=0;
        for(int i=0;i<d.arr1.length;i++)
        {
         for(int y=0;y<d.arr2.length;y++)
         { 
             if(d.arr1[i].compareTo(d.arr2[y])==0)
             { counter++;
              c=i;
              for(int x = c+1; x < d.arr1.length; x++)
            {
                d.arr1[x-1] = d.arr1[x];
            }
             }
         }
        }

        String[] arr=new String[d.arr1.length-counter];

        for(int u=0;u<d.arr1.length-counter;u++){
            arr[u]=d.arr1[u];
        }
        
            System.out.println(Arrays.toString(arr));
        
    }

    public static void main(String[] args){
        ArraySub obj =new ArraySub();
        obj.Subtract();
    }

    
}
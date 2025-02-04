package E11.zad3;

public class Main {
   public static < T extends Comparable<T>> T maxValue(T[] arr){
       if(arr == null || arr.length ==0){
           throw new IllegalArgumentException("array is null or empty");

       }
       T max = arr[0];
       for(T item:arr){
           if(item.compareTo(max) > 0){
               max = item;
           }
       }
       return max;
   }

    public static void main(String[] args) {
        Vechicle[] vechicles = {
                new Vechicle("BMW",300),
                new Vechicle("Lexus",200),
                new Vechicle("BMW",400)
        };
        System.out.println(maxValue(vechicles));
    }
}

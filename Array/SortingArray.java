package Array;
  import java.util.Arrays;
 class SortingArray{
   
    public static void main(String[] args) {
        int[]numbers={1,3,5,6,4};
        char[]characters={'d','f','k','i','a'};
        int[]unicodes={'a','b','A','B','Z','w'};
        String[]strings={"abc","hij","efg"};
        Arrays.sort(characters);
        Arrays.sort(unicodes);
        Arrays.sort(strings);
        Arrays.sort(unicodes);
        System.out.println("Sorted number:"+ Arrays.toString(numbers));
        System.out.println("Sorted characters:"+ Arrays.toString(characters));
        System.out.println("Sorted unicodes:"+ Arrays.toString(unicodes));
        System.out.println("Sorted string:"+ Arrays.toString(strings));
        int key=4;
        int index=Arrays.binarySearch(numbers, key);
        System.out.println("Index of" +key+":" +index);
       // int value =2;
       // Arrays.fill(numbers.value);
      //  System.out.println("Filled Array: "+Arrays.toString(numbers));
        int[]array1={1,2,3,4,5};
        int[]array2={1,2,3,4,5};
        int[]array3={5,4,3,2,1};
        boolean areEqual1= Arrays.equals(array1,array2);
        boolean areEqual2= Arrays.equals(array1,array3);
        System.out.println("Array1 equals Array2:" +areEqual1);
        System.out.println("Array1 equals Array3:" +areEqual2);
    }
}

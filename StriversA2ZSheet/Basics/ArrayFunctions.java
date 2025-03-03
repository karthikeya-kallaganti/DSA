class ArrayFunctions{
    public static void main(String[] args){
        /**
         * Arrays are objects that are used to store multiple values of the same data type in a single variable(mostly int).
         * Primitive Arrays:elements are stored in contigous memory locations
         * Non-Primitive Arrays:references are stored in contigous memory locations
         */

        //Declaring and intilizing an array
        int[] arr = new int[5];
        arr = {1,2,3,4,5};
        //length of the array
        int size = arr.length;

        //For traversing through array
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }

        //ArrayIndexOutOfBoundsException:If we try to access elements outside the array size.

        //Will discuss indepth of arrays and strings at their respective Data structure time

    }
}
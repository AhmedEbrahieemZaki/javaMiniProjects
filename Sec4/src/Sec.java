public class Sec {
    public static void main(String[] args) {
       int[][][] test;
        test = new int[][][]{
                {{-2, 1, 3},{4,3,2}},{{9,6,-5,4},{1},{3,2}}
       };
        for (int [][] array2D:test){
            for (int [] array1D:array2D){
                for (int item:array1D)
                    System.out.println(item);
            }
        }
    }}
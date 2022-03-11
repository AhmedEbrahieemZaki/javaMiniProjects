public class Cla {
    public static void main(String[] args) {
        int [] a = {23,47,81,95};
        int [] b = {7,14,39,55,62,74};
        int [] c = new int[10];
        merge( a, 4 ,b,6 , c);
        for ( int i=0 ; i<10 ; i++){
            System.out.print(c[i] + "  ");
        }


    }
    public static  void merge ( int []a , int sizeA , int [] b ,int sizeB , int [] c){
        int indexA = 0 , indexB=0 , indexC=0 ;
        while (indexA < sizeA && indexB < sizeB ){
            if (a[indexA] < b[indexB])
                c[indexC++]= a [indexA++];
            else
                c[indexC++] = b[indexB++];
        }
        while (indexA < sizeA)
            c[indexC++]= a [indexA++];
        while (indexB< sizeB)
            c[indexC++] = b[indexB++];
    }
}

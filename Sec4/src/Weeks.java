public class Weeks {
    public static void main(String[] args) {
        int sum =0 ;
        int [][]a ={{1,2,3},{4,5,6},{7, 4,5}};
        for(int i=0 ;i<a.length;i++){
            for (int j=0 ; j<a.length;j++) {
                if ((i - j == 1)|| i-j==-1) {
                    continue;
            }
            sum += a[i][j];
        }
    }
        sum +=a[1][1];
        System.out.println(sum);
}}

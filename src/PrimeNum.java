public class PrimeNum {
    public static void main(String[] args) {
        int n = 20;
        int count;
        for(int i = 2; i <= n; i++){
            count = 0;
            for(int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}

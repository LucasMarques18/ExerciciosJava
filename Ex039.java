public class Ex039 {
    public static void main(String[] args) {
     
        int x = 30;
        while (x > 0){
            if (x % 4 == 0){
                System.out.print("[" + x + "] ");
                x--;
            } else{
                System.out.print(x + " ");
                x--;
            }
        }
    }   
}
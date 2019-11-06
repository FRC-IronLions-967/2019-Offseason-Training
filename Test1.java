public class Test1{

public static void main(String args[]){
    long x = 0;
    long y = 1;
    long z = 1;
    System.out.println(0);
    System.out.println(1);
        for(int i = 0; i<50; i++){
        z = x + y;
        x = y;
        y = z;
        System.out.println(z);
    }
}

}
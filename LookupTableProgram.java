public class LookupTableProgram{
    public static void main(String args[]){
        for (int i = 0; i < 100; i++) {
            double x = i * 0.01;
            double y = Math.pow((x - 0.05), 2) * 1.10803324089;
            System.out.println(y); 
        }
    }
}


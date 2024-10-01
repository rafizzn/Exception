package IO_Exception;

public class MultiCatch {
    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            int b = 0;
            int c = 1/b;
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e){ //Meng-Catch kedua exception
            System.out.println("Exception thrown: " +e); //Menampilkan hasil dari exception
        }
    }
}

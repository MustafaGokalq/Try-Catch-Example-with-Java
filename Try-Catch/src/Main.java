public class Main {

    public static void main(String[] args) {
	    System.out.println("Program başladı");

       int a = 0;
        try {
            a=2/0;     //Hata bu satırda yakalanır ve try'nin içindekiler okunmadan catch e geçer.
            System.out.println("Try içerisinde");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally her türlü çalısır");
        }
        System.out.println("program bitti");


    }
}

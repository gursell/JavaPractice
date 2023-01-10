package polymorphism;
public class C01_Overloading {
    public static void main(String[] args) {
        C01_Overloading obj = new C01_Overloading();
        obj.islem(3,"Java");// 3 Java
        obj.islem("Herry", "Kewell"); // Herry
        obj.islem("Eva" , 5); // 5
        obj.islem(7,6); //  13.0
        obj.islem(3.5, 5.5); // 9

    }
    public void islem(double a, double b) {
        System.out.println(a + b);
    }
    public void islem(String a, int b) {
        System.out.println(b);
    }
    public void islem(String a, String b) {
        System.out.println(a);
    }
    public void islem(int a, String b){
        System.out.println(a + " " + b);
    }
}

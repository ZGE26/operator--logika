package part4;

public class BelajarOpL {
    public static void main(String[] args) {
        
        //Operator Logika --> operasio yang bisa kita lakukan kepada tipe data boolean
        // OR, AND, XOR, negasii
        boolean a,b,c;
        //OR --> Atau ("||")
        System.out.println("=====OR (||)=====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //AND --> Dan ("&&")
        System.out.println("=====AND (&&)=====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&& b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

         //XOR --> ("&&")
        System.out.println("=====XOR (^)=====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

         //Negasi --> kebalikan ("!=")
        System.out.println("=====XOR (^)=====");
        a = false;
        c = !a;
        System.out.println(a + " Kebalikannya adalah = " + c);
    }

}

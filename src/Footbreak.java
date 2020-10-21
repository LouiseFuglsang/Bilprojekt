public class Footbreak {

    public static void pressFootbreak(int f) {

        switch (f) {
            case 1:
                System.out.println("bremsen er sluppet");
                break;
            case 2:
                System.out.println("bremsen trædes langsomt halvt ned");
                break;
            case 3:
                System.out.println("bremsen trædes langsomt i bund");
                break;
            case 4:
                System.out.println("bremsen trædes hurtigt i bund");
                break;
            default:
                System.out.println("default bremse");
        }
    }
}

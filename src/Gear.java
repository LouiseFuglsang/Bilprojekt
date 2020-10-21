public class Gear {

    public static void shiftGear(int g) {

        switch (g) {
            case 0:
                System.out.println("gearet er i frigear");
                break;
            case 1:
                System.out.println("gearet er i 1. gear");
                break;
            case 2:
                System.out.println("gearet er i 2. gear");
                break;
            case 3:
                System.out.println("gearet er i 3. gear");
                break;
            case 4:
                System.out.println("gearet er i 4. gear");
                break;
            case 5:
                System.out.println("gearet er i 5. gear");
                break;
            default:
                System.out.println("gearet eksisterer ikke");
        }
    }


}

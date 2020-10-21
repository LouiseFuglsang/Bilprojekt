public class Clutch {

    public static void pressClutch(int c) {

        switch (c) {
            case 0:
                System.out.println("koblingen er sluppet");
                break;
            case 1:
                System.out.println("træder koblingen ned");
                break;
            case 2:
                System.out.println("slipper langsomt koblingen");
                break;
            case 3:
                System.out.println("slipper hurtigt koblingen");
                break;
            default:
                System.out.println("koblingstrykket findes ikke");
        }
    }

}

public class Flashlight {


    public static void chooseFlashlight(int j){

        switch (j) {
            case 1:
                System.out.println("højre blinklys blinker");
                break;
            case 2:
                System.out.println("højre blinklys slukker");
                break;
            case 3:
                System.out.println("venstre blinklys blinker");
                break;
            case 4:
                System.out.println("venstre blinklys slukker");
                break;
            default:
                System.out.println("default blinklys");
        }

    }

}

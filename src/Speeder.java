public class Speeder {

    public static void pressSpeeder(int s) {

        switch (s) {
            case 0:
                System.out.println("speederen er sluppet");
                break;
            case 1:
                System.out.println("speederen presses en femtedel ned");
                break;
            case 2:
                System.out.println("speederen presses to femtedel ned");
                break;
            case 3:
                System.out.println("speederen presses tre femtedel ned");
                break;
            case 4:
                System.out.println("speederen presses fire femtedel ned");
                break;
            case 5:
                System.out.println("speederen presses fem femtedel ned");
                break;
            default:
                System.out.println("speedertrykket findes ikke");
        }
}}

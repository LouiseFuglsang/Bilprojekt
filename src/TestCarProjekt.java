/*


public class TestCarProjekt {
    public static void main(String[] args) {
        testSuite();
    }
    private static void testSuite() {
        System.out.println("Testsuiten kører.");

        System.out.print("Test 1 (Døren åbnes og lyset tænder): ");
        testStartCarWithCorrectKey();
        System.out.print("Test 2 (Døren åbner ikke og lyset tænder ikke): ");
        testStartCarWithWrongKey();

        System.out.print("Test 3 (håndbremsen er ikke trukket): ");
        testReleaseHandbreak();
        System.out.print("Test 4 (håndbremsen er trukket): ");
        testHandbreakIsntReleased();

        System.out.print("Test 5 (Koblingen trykkes ned): ");
        testPressClutch(0);
        
        System.out.print("Test 6 (Gear skal sættes i 1. gear): ");
        testReleaseClutch(0);

        System.out.print("Test 7 (Trykkes løsnes let på koblingen): ");
        testPressClutch(0);
OG!!!
        System.out.print("Test 8 (Tryk let på speederen): ");
        testPressClutch(0);

        //Bilen kører i 1. gear i x min.//

        System.out.print("Test 9 (Koblingen trykkes ned): ");
        testPressClutch(0);

        System.out.print("Test 10 (Gear skal sættes i 2. gear): ");
        testReleaseClutch(0);

        System.out.print("Test 11 (Koblingen slippes): ");
        testPressClutch(0);

        System.out.print("Test 12 (Tryk mere på speederen): ");
        testPressClutch(0);

        //Bilen kører i 2. gear i x min.//

        System.out.print("Test 13 (Slå højre blinklys til): ");
        testPressClutch(0);

        System.out.print("Test 14 (Koblingen trykkes ned): ");
        testPressClutch(0);

        System.out.print("Test 15 (Gear skal sættes i 1. gear): ");
        testReleaseClutch(0);

        System.out.print("Test 16 (Rattet drejes til højre i x sekunder): ");
        testReleaseClutch(0);

        //Bilen drejer

        System.out.print("Test 17 (Rattet rettes op igen + blinklyset slår fra): ");
        testReleaseClutch(0);

        System.out.print("Test 18 (Koblingen trykkes ned): ");
        testPressClutch(0);

        System.out.print("Test 19 (Gear sættes i 2. gear): ");
        testReleaseClutch(0);

        //Bilen kører i 2. gear i x min.//

        System.out.print("Test 20 (Koblingen trykkes ned): ");
        testPressClutch(0);

        System.out.print("Test 21 (Gear sættes i 3. gear): ");
        testReleaseClutch(0);

        //Bilen kører i 3. gear i x min.//

        System.out.print("Test 13 (Slå venstre blinklys til): ");
        testPressClutch(0);

        System.out.print("Test 14 (Koblingen trykkes ned): ");
        testPressClutch(0);

        System.out.print("Test 15 (Gear sættes i 2. gear): ");
        testReleaseClutch(0);

        System.out.print("Test 16 (Rattet drejes til venstre i x sekunder): ");
        testReleaseClutch(0);

        //Bilen drejer

        System.out.print("Test 17 (Rattet rettes op igen + blinklyset slår fra): ");
        testReleaseClutch(0);

        //Bilen kører i 2. gear i x min.//

        System.out.print("Test 18 (Slå venstre blinklys til): ");
        testPressClutch(0);

        System.out.print("Test 14 (Koblingen trykkes ned): ");
        testPressClutch(0);

        System.out.print("Test 15 (Gear sættes i 2. gear): ");
        testReleaseClutch(0);

        System.out.print("Test 16 (Rattet drejes til venstre i x sekunder): ");
        testReleaseClutch(0);



    }
    private static void testStartCarWithCorrectKey() {
        Car louisesCar = new Car();
        CarKey key = new CarKey("password1234");
        louisesCar.turnEngineOn(key);
    }
    private static void testStartCarWithWrongKey() {
        Car louisesCar = new Car();
        CarKey key = new CarKey("hest");
        louisesCar.turnEngineOn(key);
    }
    private static void testPutOnSeatBelt(){
        Car louisesCar = new Car();
        CarSeatbelt seatbelt = new Seatbelt();
        louisesCar.putOnseatbelt();
    }
    private static void testReleaseHandbreak() {
        Car louisesCar = new Car();
        CarHandbreak handbreak = new Handbreak();
        louisesCar.releaseHandbreak(1);
    }
    private static void testHandbreakIsntReleased() {
        Car louisesCar = new Car();
        CarHandbreak handbreak = new Handbreak();
        louisesCar.releaseHandbreak(0);
    }
        private static void testChangeToGear(){
        Car louisesCar = new Car();
        CarGear gear = new Gear();
        louisesCar.changeToGear(0);
    }
    private static void testPressClutch(){
        Car louisesCar = new Car();
        CarClutch clutch = new Clutch();
        louisesCar.pressClutch(1);
    }
    private static void testpressSpeeder(){
        Car louisesCar = new Car();
        CarSpeeder speeder = new Speeder();
        louisesCar.pressSpeeder(3);
    }
    private static void testpressSpeeder(){
        Car louisesCar = new Car();
        CarFrontbacklights frontbacklights = new Frontbacklights();
        louisesCar.pressSpeeder(3);
    }
    private static void testpressSpeeder(){
        Car louisesCar = new Car();
        CarFlashlight flashlight = new flashlight();
        louisesCar.pressSpeeder(3);
    }
    private static void testpressSpeeder(){
        Car louisesCar = new Car();
        CarSteeringWheel steeringWheel = new SteeringWheel();
        louisesCar.pressSpeeder(3);
    }


}


 */
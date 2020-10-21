public class Car {

    private String password;
    boolean engineOn;
    static boolean seatbelt;
    static boolean handbreak;
    static int clutch;
    static int gear;
    static int speeder;
    static int flashlight;
    static int footbreak;


    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("Bilen er tændt.");
            engineOn = true;
        } else {
            System.out.println("Bilen kan ikke tænde, pga. forkert nøgle.");
        }}


    public static void main(String[] args) {

        Car myCar = new Car();
        Seatbelt mySeatbelt = new Seatbelt();
        Handbreak myHandbreak = new Handbreak();
        Gear myGear = new Gear();
        Clutch myClutch = new Clutch();
        Speeder mySpeeder = new Speeder();
        Flashlight myFlashlight = new Flashlight();
        Footbreak myFootbreak = new Footbreak();

        // Bilen låses op med koden
        // Åbn døren

        // Selen tages på og lyset tænder foran og bagpå bilen
        // Bilen kan ikke køre hvis selen ikke er taget på og lyset ikke er tændt
        mySeatbelt.putOnSeatbelt(true);

        // Håndbremsen slippes
        myHandbreak.pullHandbreak(false);

        //Check om den er i frigear
        myGear.shiftGear(0);

        // Koblingen trykkes ned (hvis den er i frigear)
        myClutch.pressClutch(1);

        // Gear sættes i 1. gear
        myGear.shiftGear(1);

        // Trykket løsnes let på koblingen OG!!! Tryk let på speederen
        myClutch.pressClutch(2);
        mySpeeder.pressSpeeder(1);

        //Slip koblingen
        myClutch.pressClutch(0);

        // Bilen kører i 1. gear i x min.

        // Koblingen trykkes ned
        myClutch.pressClutch(1);

        // Gear skal sættes i 2. gear
        myGear.shiftGear(2);

        // Koblingen slippes
        myClutch.pressClutch(0);

        // Tryk mere på speederen
        mySpeeder.pressSpeeder(2);

        // Bilen kører i 2. gear i x min.

        // Slå venstre blinklys til
        Flashlight.chooseFlashlight(3);

        // Tryk lidt på bremsen
        myFootbreak.pressFootbreak(2);

        // Koblingen trykkes ned
        myClutch.pressClutch(1);

        // Gear skal sættes i 1. gear
        myGear.shiftGear(1);

        // Koblingen slippes
        myClutch.pressClutch(0);

        // Rattet drejes til venstre i x sekunder
  //      louisesCar.turnSteeringWheel();

        //Bilen drejer

        // Rattet rettes op igen + blinklyset slår fra
        myFlashlight.chooseFlashlight(4);

        // Tryk mere på speederen
        mySpeeder.pressSpeeder(2);

        // Koblingen trykkes ned
        myClutch.pressClutch(1);

        // Gear sættes i 2. gear
        myGear.shiftGear(2);

        // Koblingen slippes
        myClutch.pressClutch(0);

        //Bilen kører i 2. gear i x min.

        // Tryk mere på speederen
        mySpeeder.pressSpeeder(3);

        // Koblingen trykkes ned
        myClutch.pressClutch(1);

        // Gear sættes i 3. gear
        myGear.shiftGear(3);

        // Koblingen slippes
        myClutch.pressClutch(0);

        //Bilen kører i 3. gear i x min.

        // Slå højre blinklys til
        myFlashlight.chooseFlashlight(1);

        // Træd lidt på bremsen
        myFootbreak.pressFootbreak(2);

        // Koblingen trykkes ned
        myClutch.pressClutch(1);

        // Gear sættes i 2. gear
        myGear.shiftGear(2);

        // Koblingen slippes
        myClutch.pressClutch(0);

        //Bilen kører i 2. gear i 0.x min.

        // Koblingen trykkes ned
        myClutch.pressClutch(1);

        // Gear sættes i 1. gear
        myGear.shiftGear(1);

        // Koblingen slippes
        myClutch.pressClutch(0);

        // Rattet drejes til højre i x sekunder

        //Bilen drejer lidt

        // Rattet rettes op igen + blinklyset slår fra
        myFlashlight.chooseFlashlight(2);

        // Træd bremsen i bund
        myFootbreak.pressFootbreak(4);

        //Bilen stopper

        // Træd koblingen ned
        myClutch.pressClutch(1);

        // Sæt bilen i frigear
        myGear.shiftGear(0);

        // Koblingen slippes
        myClutch.pressClutch(0);

        // Træk håndbremsen
        myHandbreak.pullHandbreak(true);

        // Selen tages af og lyset slukker foran og bagpå bilen
        mySeatbelt.putOnSeatbelt(false);

        //Åbn døren

        // Bilen låses med koden
    }
}


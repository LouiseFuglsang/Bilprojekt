public class CarKey {

    public String password;
    boolean engineOn;

    CarKey(String key) {
        this.password = key;
    }

    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("Bilen er tændt.");
            engineOn = true;
        } else {
            System.out.println("Bilen kan ikke tænde, pga. forkert nøgle.");
        }}
}

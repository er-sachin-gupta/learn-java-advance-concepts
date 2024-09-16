package solid.srp;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email logic
        } else if (medium.equals("phone")) {
            // write login using twillio api
        }

    }
}

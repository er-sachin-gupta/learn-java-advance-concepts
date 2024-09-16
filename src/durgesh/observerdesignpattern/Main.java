package durgesh.observerdesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Subject channel = new YoutubeChannel();

        Observer aman = new Subscriber("Aman");
        Observer raman = new Subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);

        channel.newVideoUploaded("Learn Design Pattern");
        channel.newVideoUploaded("New Angular Course");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new subscriber");
            System.out.println("Press 3 to exit");

            int c = Integer.parseInt(br.readLine());
            if (c == 1) {
                System.out.println("Enter video title: ");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);
            } else if (c == 2) {
                System.out.println("Enter name of subscriber: ");
                String subsName = br.readLine();
                Observer subscriber3 = new Subscriber(subsName);
                channel.subscribe(subscriber3);
            } else if (c == 3) {
                System.out.println("Thank you for using app");
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}

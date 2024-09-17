package solid.lsp.solution;

// This class can substitute the Parent Class SocialMedia as well as SocialVideoCallManager, it perfectly follows Liskov Substitution principle
public class Whatsapp implements SocialMedia, SocialVideoCallManager {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {

    }
}

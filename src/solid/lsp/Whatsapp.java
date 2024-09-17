package solid.lsp;

public class Whatsapp extends  SocialMedia {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost() {
        // Not Applicable, because of it does not follow liskov substitution principle
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {

    }
}

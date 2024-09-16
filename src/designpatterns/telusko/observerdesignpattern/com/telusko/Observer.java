package designpatterns.telusko.observerdesignpattern.com.telusko;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}

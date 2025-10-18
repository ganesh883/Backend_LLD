package org.example.designpatterns.factory;

import org.example.designpatterns.factory.buttons.Button;
import org.example.designpatterns.factory.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactoryForPlatform(SupportedPlatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.click();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();UIFactory uiFactory1 = flutter.getUIFactoryForPlatform(SupportedPlatforms.WINDOWS);

        Button button1 = uiFactory.createButton();
        button.click();

        Menu menu1 = uiFactory.createMenu();
        menu.showMenu();


    }
}

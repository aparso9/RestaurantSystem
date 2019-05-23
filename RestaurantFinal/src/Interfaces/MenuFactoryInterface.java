package Interfaces;

import Menu.CurrentMenu;
import Subjects.CurrentTime;

public interface MenuFactoryInterface {
    public CurrentMenu getMenu(CurrentTime currentTime);
}

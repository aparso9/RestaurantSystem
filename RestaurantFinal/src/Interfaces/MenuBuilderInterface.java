package Interfaces;

import Menu.CurrentMenu;

public interface MenuBuilderInterface {
    void addHeading();
    void addMenuItems();
    void addFooter();
    CurrentMenu getCurrentMenu();
}

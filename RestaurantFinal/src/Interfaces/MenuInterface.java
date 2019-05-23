package Interfaces;

import Menu.MenuItem;

public interface MenuInterface {
    public String addItem(MenuItem mi);
    public String removeItem(MenuItem mi);
    public int length();
    public MenuItem getMenuItem(int index);
    public void setHeading(String head);
    public void setFooter(String foot);
    public String getHeading();
    public String getFooter();
    public void print();
}

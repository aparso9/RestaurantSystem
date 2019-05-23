package TableRelated;

import Interfaces.PopulaterInterface;
import java.util.ArrayList;

public class TablePopulater implements PopulaterInterface{

    @Override
    public Tables populate() {
        Table table1 = new Table();
        Table table2 = new Table();
        Table table3 = new Table();
        Table table4 = new Table();
        Table table5 = new Table();
        Table table6 = new Table();
        Table table7 = new Table();
        Table table8 = new Table();
        Table table9 = new Table();
        Table table10 = new Table();
        Table table11 = new Table();
        Table table12 = new Table();
        Table table13 = new Table();
        Table table14 = new Table();
        Table table15 = new Table();
        Table table16 = new Table();
        Table table17 = new Table();
        
        Tables tables = new Tables();
        
        tables.addTable(table1);
        tables.addTable(table2);
        tables.addTable(table3);
        tables.addTable(table4);
        tables.addTable(table5);
        tables.addTable(table6);
        tables.addTable(table7);
        tables.addTable(table8);
        tables.addTable(table9);
        tables.addTable(table10);
        tables.addTable(table11);
        tables.addTable(table12);
        tables.addTable(table13);
        tables.addTable(table14);
        tables.addTable(table15);
        tables.addTable(table16);
        tables.addTable(table17);
        
        return tables;
    }

}

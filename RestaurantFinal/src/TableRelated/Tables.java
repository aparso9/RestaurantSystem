package TableRelated;

import java.util.ArrayList;

public class Tables {

    private ArrayList<Table> tables;
    
    public Tables(){
        tables = new ArrayList();
    }
    
    public void addTable(Table table){
        tables.add(table);
    }
    
    public void removeTable(Table table){
        tables.remove(table);
    }
    
    public int length(){
        return tables.size();
    }
    
    public Table getTable(int index){
        return tables.get(index);
    }
    
    public ArrayList<Table> getTables(){
        return tables;
    }
    
    public ArrayList<Table> getOpenTables(){
        ArrayList<Table> openTables = new ArrayList();
        
        for(int i = 0; i < tables.size(); i++){
            if(tables.get(i).getCurrentTableState() == tables.get(i).getHasSpaceState()){
                openTables.add(tables.get(i));
            }
        }
        
        if(openTables.isEmpty()){
            System.out.println("Currently there are no open tables");
        }
        
        return openTables;
    }
}

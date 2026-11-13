package model;

import java.util.ArrayList;
import java.util.List;

abstract class DataView<T> {

    private List<T> records;

    public DataView(T records){
        this.records = new ArrayList<>();
    }

    public void setRecords(List<T> records){
        this.records = records;
    }

    public List<T> getRecords(){
        return records;
    }

    public void printAll(){
        for (T t : records) {
            System.out.println(convertModeltoValues(t));
        }
    }

    public void printByPk(String primaryKey){
        for (list<T> t : primaryKey) {
            
        }
    }

    public void showInsertForm(){

    }

    public void showUpdateForm(){
        getPrimaryKeyValue(records);
    }

    public void promptDelete(){
        System.out.println("Primary key yang mau dihapus: ");
        String hapus = sc.
    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();
    
    protected abstract T convertModeltoValues(String[] values);
    
    protected abstract String[] convertModeltoValues(T data);

}

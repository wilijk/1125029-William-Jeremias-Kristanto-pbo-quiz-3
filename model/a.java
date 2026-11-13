package model;

import java.util.ArrayList;
import java.util.List;

import util.InputUtil;

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
        String[] fields = this.getFields();
        String[] values = this.convertModeltoValues(records);
        int j = 1;
        System.out.print(j + ". ");
        for (int i = 0; i < fields.length; i++) {
            System.out.print(records);
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
        String hapus = InputUtil.readLine();

        for (T h : records) {
            return h.remove(hapus).getPrimaryKeyValue();
        }
    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();
    
    protected abstract T convertModeltoValues(String[] values);
    
    protected abstract String[] convertModeltoValues(T data);

}

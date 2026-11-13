package model;

import java.util.ArrayList;
import java.util.List;

import util.InputUtil;

public abstract class DataView<T> {

    private List<T> records;

    public DataView(T records) {
        this.records = new ArrayList<>();
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public List<T> getRecords() {
        return records;
    }

    public void printAll() {
        String[] fields = this.getFields();
        for (int i = 0; i < records.size(); i++) {
            T record = this.records.get(i);
            String[] values = this.convertModeltoValues(record);
            int j = 1;
            System.out.print(j + ". ");
            for (int k = 0; k < fields.length; k++) {
                System.out.print(fields[k] + " = " + values[k] + ", ");
            }
            System.out.println();
        }
    }

    public void printByPk(String primaryKey) {
        String[] fields = this.getFields();
        for (int i = 0; i < records.size(); i++) {
            T record = this.records.get(i);
            String[] values = this.getPrimaryKeyValue();
            int j = 1;
            System.out.print(j + ". ");
            for (int k = 0; k < fields.length; k++) {
                System.out.print(fields[k] + " = " + values[k] + ", ");
            }
            System.out.println();
        }
    }

    public void showInsertForm() {
        String[] fields = this.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i] + " ");
        }
        String[] values = this.convertModeltoValues();
    }

    public void showUpdateForm() {
        for (T t : records) {
            getPrimaryKeyValue(t);
            if (t == ) {
                
            }
        }
        setRecords(records);
    }

    public void promptDelete() {
        String[] fields = this.getFields();
        for (int i = 0; i < records.size(); i++) {
            T record = this.records.get(i);
            String[] values = this.getPrimaryKeyValue(fields);
            int j = 1;
            System.out.print(j + ". ");
            for (int k = 0; k < fields.length; k++) {
                System.out.print(fields[k] + " = " + values[k] + ", ");
            }
            System.out.println();
        }

    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();

    protected abstract T convertModeltoValues(String[] values);

    protected abstract String[] convertModeltoValues(T data);

}

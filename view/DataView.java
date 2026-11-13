package view;

import java.util.ArrayList;
import java.util.List;

import model.Mahasiswa;
import util.InputUtil;

public abstract class DataView<T> extends Mahasiswa{

    private List<T> records;

    public DataView(String nim, String nama, String email, int umur){
        super(nim, nama, email, umur);
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
        String[] values = this.getFields();
        for (T t : records) {
            getPrimaryKeyValue(t);
            if (t == values ) {
                setNim(getNim());
            }
        }
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

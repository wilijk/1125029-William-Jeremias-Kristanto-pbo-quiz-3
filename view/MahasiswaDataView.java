package view;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import model.Mahasiswa;

public class MahasiswaDataView extends DataView{

    public MahasiswaDataView(String nim, String nama, String email, int umur){
        super(nim, nama, email, umur);
    }

    @Override
    protected String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim();
    }

    @Override
    protected String[] getFields() {

        return 
    }

    @Override
    protected String[] convertModeltoValues(Mahasiswa data) {
        return new Mahasiswa(data.getNim(), data.getNama(), data.getEmail(), String.valueOf(data.getUmur()));
    }

    @Override
    protected Object convertModeltoValues(String[] values) {

        return null;
    }

     
}

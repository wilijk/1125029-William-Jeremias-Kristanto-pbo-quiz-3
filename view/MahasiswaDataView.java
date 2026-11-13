package view;

import javax.xml.crypto.Data;

import model.DataView;
import model.Mahasiswa;

public class MahasiswaDataView extends DataView{
    public MahasiswaDataView(String)

    @Override
    protected String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim;
    }

    @Override
    protected String[] getFields() {

        return new Mahasiswa("nim", "nama", "email", 0);
    }

    @Override
    protected String[] convertModeltoValues(Object data) {
        data.
        return null;
    }

    @Override
    protected Object convertModeltoValues(String[] values) {
        
        return null;
    }

     
}

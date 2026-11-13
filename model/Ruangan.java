package model;

public class Ruangan {
    private String kode;
    private String nama;
    private int lokasiLantai;
    private int kapasitas;

    public Ruangan(String kode, String nama, int lokasiLantai, int kapasitas) {
        this.kode = kode;
        this.nama = nama;
        this.lokasiLantai = lokasiLantai;
        this.kapasitas = kapasitas;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLokasiLantai() {
        return lokasiLantai;
    }

    public void setLokasiLantai(int lokasiLantai) {
        this.lokasiLantai = lokasiLantai;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

}


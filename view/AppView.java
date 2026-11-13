package view;

import java.util.Scanner;

import util.InputUtil;

public class AppView {


    public int menuAksi(){
        System.out.println("\n=== MENU AKSI ===");
        System.out.println("1. Tampilkan Semua data");
        System.out.println("2. Cari satu data");
        System.out.println("3. Tambah data");
        System.out.println("4. Ubah data");
        System.out.println("5. Delete Data");
        System.out.print("Pilih: ");
        return InputUtil.readIInt();
    }

    public int menuUtama(){
        System.out.println("\n=== PILIH MENU ===");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Mata Kuliah");
        System.out.println("3. Ruangan");
        System.out.print("Pilih: ");
        return InputUtil.readIInt(); 
    }

}

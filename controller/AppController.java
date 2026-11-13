package controller;

import view.AppView;

public class AppController {

    AppView view = new AppView();
    int menu = 0;
    int pilih = 0;

    public void start(){
        menu = view.menuUtama();

        if (menu == 1) {
            pilih = view.menuAksi();
            if (pilih == 1) {
                
            }
        }
    }
}

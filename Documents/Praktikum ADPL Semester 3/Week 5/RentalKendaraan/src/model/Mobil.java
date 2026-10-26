package model;

import model.Kendaraan;
import model.WajibJaminan;

public class Mobil extends Kendaraan implements WajibSIM, WajibJaminan {

    private static final long UANG_JAMINAN = 50000;

    public Mobil(String platNomor, String merk, long tarifPerHari) {
        super(platNomor, merk, tarifPerHari);
    }

    @Override
    public String getJenis() {
        return "MOBIL";
    }

    @Override
    public long hitungBiaya(int hari) {
        return getTarifPerHari() * hari + ASURANSI;
    }

}

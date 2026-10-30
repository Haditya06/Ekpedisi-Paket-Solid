/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekpedisipaket.service;

/**
 *
 * @author Dit
 */
import com.mycompany.ekpedisipaket.layanan.BisaDiasuransikan;
import com.mycompany.ekpedisipaket.layanan.LayananPengiriman;
import com.mycompany.ekpedisipaket.model.Pengiriman;
import com.mycompany.ekpedisipaket.repository.RiwayatRepository;
import java.util.List;

public class PengirimanService {

    private final RiwayatRepository repository;

    public PengirimanService(RiwayatRepository repository) {
        this.repository = repository;
    }

    public Pengiriman kirim(String penerima, double berat, LayananPengiriman layanan, boolean pakaiAsuransi) {
        if (penerima == null || penerima.isBlank()) {
            throw new IllegalArgumentException("Nama Penerima wajib diisi.");
        }
        if (!Double.isFinite(berat) || berat <= 0) {
            throw new IllegalArgumentException("Berat Harus lebih dari 0 Kg. ");
        }
        double total = layanan.hitungOngkir(berat);
        boolean asuransiDipakai = false;
        if (pakaiAsuransi && layanan instanceof BisaDiasuransikan asuransi
        
            ){
        total += asuransi.getBiayaAsuransi();
            asuransiDipakai = true;
        }
        Pengiriman pengiriman = new Pengiriman(penerima.trim(), layanan.getNama(), berat, asuransiDipakai, total);
        repository.simpan(pengiriman);
        return pengiriman;
    }

    public List<Pengiriman> ambilRiwayat() {
        return repository.ambilSemua();
    }
}

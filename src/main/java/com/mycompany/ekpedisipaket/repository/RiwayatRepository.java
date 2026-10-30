/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekpedisipaket.repository;

/**
 *
 * @author Dit
 */
import com.mycompany.ekpedisipaket.model.Pengiriman;
import java.util.List;

public interface RiwayatRepository {

    void simpan(Pengiriman pengiriman);

    List<Pengiriman> ambilSemua();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekpedisipaket;

import com.mycompany.ekpedisipaket.layanan.LayananEkonomi;
import com.mycompany.ekpedisipaket.layanan.LayananPengiriman;
import com.mycompany.ekpedisipaket.layanan.LayananReguler;
import com.mycompany.ekpedisipaket.repository.RiwayatArrayList;
import com.mycompany.ekpedisipaket.repository.RiwayatRepository;
import com.mycompany.ekpedisipaket.service.PengirimanService;
import com.mycompany.ekpedisipaket.view.FormatPengiriman;
import java.util.List;
/**
 *
 * @author Dit
 */
public class Main {
    public static void main(String[] args){
        RiwayatRepository repository = new RiwayatArrayList();
        PengirimanService service = new PengirimanService(repository);
        
        List<LayananPengiriman> daftarLayanan = List.of(new LayananReguler(), new LayananEkonomi());
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            //logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            FormatPengiriman form = new FormatPengiriman(service, daftarLayanan);
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        });
    }
    
}

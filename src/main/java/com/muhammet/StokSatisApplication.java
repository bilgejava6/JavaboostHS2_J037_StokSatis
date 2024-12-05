
package com.muhammet;


import com.muhammet.entity.Marka;
import com.muhammet.entity.Model;
import com.muhammet.entity.StokTuru;
import com.muhammet.entity.Urun;
import com.muhammet.repository.MarkaRepository;
import com.muhammet.repository.ModelRepository;
import com.muhammet.repository.StokTuruRepository;
import com.muhammet.repository.UrunRepository;

import java.math.BigDecimal;

public class StokSatisApplication {
    private static MarkaRepository markaRepository = new MarkaRepository();
    private static ModelRepository modelRepository  = new ModelRepository();
    private static UrunRepository urunRepository = new UrunRepository();
    private static StokTuruRepository stokTuruRepository = new StokTuruRepository();
    public static void main(String[] args) {
        initial();
    }


    private static void initial(){
        markaRepository.save(new Marka("Asus","")); // 0,1,2
        markaRepository.save(new Marka("Lenovo",""));//3,4,5
        markaRepository.save(new Marka("HP",""));//6,7,8
        markaRepository.save(new Marka("Msi","")); // 9, 10 , 11
        markaRepository.save(new Marka("Dell",""));//12,13,14
        markaRepository.save(new Marka("Apple",""));//15,16,17
        markaRepository.save(new Marka("Acer",""));//18,19,20
        // burada marka repository içinden markaların listesini alıyorum.
        for(Marka marka: markaRepository.findAll()){
            modelRepository.save(new Model(marka.getUuid(),marka.getMarkaAdi()+" - A Model"));
            modelRepository.save(new Model(marka.getUuid(),marka.getMarkaAdi()+" - B Model"));
            modelRepository.save(new Model(marka.getUuid(),marka.getMarkaAdi()+" - C Model"));
        }

        stokTuruRepository.save(new StokTuru("Litre"));
        stokTuruRepository.save(new StokTuru("Adet"));
        stokTuruRepository.save(new StokTuru("Kilo"));
        stokTuruRepository.save(new StokTuru("Metre"));
        stokTuruRepository.save(new StokTuru("Düzine"));
        //              stok tür depocusu   . tümünü getir . 2. kaydı getir. kaydın id sini getir.
        String stokTurId = stokTuruRepository  .findAll()      .get(1)         .getUuid();

        String modelId = modelRepository.findAll().get(2).getUuid();
        urunRepository.save(new Urun("Asus Rog Strix G16 Intel Core I9 14900HX 96GB 512GB SSD RTX4070/8GB 165Hz 16\" Fhd+ Fdos Taşınabilir Bilgisayar N3088","",
                new BigDecimal(121_569.42),18, 100,stokTurId,20,modelId));
        urunRepository.save(new Urun("Asus TUF Gaming F15 FX507VU-LP141 Intel Core i7 13620H 16GB 512GB SSD RTX4050-140 WATT Freedos 15.6\" 144 Hz FHD Taşınabilir","",
                new BigDecimal(39_266),18, 100,stokTurId,20,modelId));
        urunRepository.save(new Urun("Asus ROG Strix G16 G614JV-N3110 Intel Core i7 13650HX 16GB 512GB SSD RTX4060-140 WATT Freedos 16\" WUXGA 165Hz Taşınabilir","",
                new BigDecimal(55_999),18, 100,stokTurId,20,modelId));

        modelId = modelRepository.findAll().get(10).getUuid();
        urunRepository.save(new Urun("MSI Msı Cyborg 15 Intel Core I7-13620H 32GB 1tb SSD RTX4060/8GB 15.6\" Fhd 144Hz W11H Taşınabilir Bilgisayar A13VF-893XTR & Per4","",
                new BigDecimal(61_519.92),18, 100,stokTurId,20,modelId));
        urunRepository.save(new Urun("MSI Katana 17 B12VFK-1031XTR i5-12450H 16GB DDR5 512GB SSD 8GB RTX4060 GDDR6 17.3\" FHD 144Hz FreeDOS Gaming (Oyuncu)","",
                new BigDecimal(55_954.20),18, 100,stokTurId,20,modelId));
        urunRepository.save(new Urun("MSI THIN 15 B12UC-1479XTR Intel Core i7 12650H 16GB 512GB SSD RTX3050 Freedos 15.6\" FHD 144Hz Taşınabilir Bilgisaya","",
                new BigDecimal(33_907),18, 100,stokTurId,20,modelId));


        modelId = modelRepository.findAll().get(17).getUuid();
        urunRepository.save(new Urun("Apple MacBook Pro M2 Max 38C Gpu 96 GB 2 TB SSD 16 Uzay Grisi Z175M2MP0962-TQ6","",
                new BigDecimal(189_000),18, 100,stokTurId,20,modelId));
        urunRepository.save(new Urun("Apple MacBook Pro M4 16GB 512GB SSD macOS 14\" Taşınabilir Bilgisayar Uzay Siyahı MW2U3TU/A","",
                new BigDecimal(72_894),18, 100,stokTurId,20,modelId));
        urunRepository.save(new Urun("Apple MacBook Pro M4 24GB 1TB SSD macOS 14\" Taşınabilir Bilgisayar Uzay Siyahı MCX04TU/A","",
                new BigDecimal(91_994),18, 100,stokTurId,20,modelId));

    }

}


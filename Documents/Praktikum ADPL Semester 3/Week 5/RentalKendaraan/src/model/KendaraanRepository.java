package model;

public interface KendaraanRepository{
    void tambah(Kendaraan kendaraan);
    //List<Kendaraan> semua
}
// [SRP] satu satunya tanggung jawab: menyimppan & mencari kendaraan di arraylist
// jika nantik penyimpanan data diganti, maka cukup class ini saja yang diubah, tidak perlu mengubah class lain

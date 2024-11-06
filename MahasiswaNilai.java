/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
public class MahasiswaNilai {
    private String nim, nama, alamat, mataKuliah;
    private double nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir;

    public MahasiswaNilai(String nim, String nama, String alamat, String mataKuliah,
                          double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        this.nilaiAkhir = calculateNilaiAkhir();
    }

    public double calculateNilaiAkhir() {
        return (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getMataKuliah() { return mataKuliah; }
    public double getNilaiAkhir() { return nilaiAkhir; }
}
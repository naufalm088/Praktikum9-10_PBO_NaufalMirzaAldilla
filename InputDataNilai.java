/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.util.ArrayList;

public class InputDataNilai {
    ArrayList<MahasiswaNilai> listNilai;

    public InputDataNilai() {
        listNilai = new ArrayList<>();
    }

    public void insertData(String nim, String nama, String alamat, String mataKuliah,
                           double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        MahasiswaNilai mhs = new MahasiswaNilai(nim, nama, alamat, mataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listNilai.add(mhs);
    }

    public ArrayList<MahasiswaNilai> getAll() {
        return listNilai;
    }

    public void deleteData(int index) {
        listNilai.remove(index);
    }
}
/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siapakamu;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
    Dosen d = new Dosen();
    d.setNip("41227829930");
    d.setNama("Rizki ADam Kurniawan");
    d.setUmur(27);
    d.siapaKamu();
    d.mengajarApa();
    
    Mahasiswa m = new Mahasiswa();
    m.setNim("10110269");
    m.setNama("Nindi");
    m.setUmur(17);
    m.siapaKamu();
    m.kelasApa();
    }
    
}

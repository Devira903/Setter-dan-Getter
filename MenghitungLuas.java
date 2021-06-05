/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.luas;

/**
 *
 * @author MOKLET-1
 */
class Luas{
    //Variable
    int tinggi, alas, jari2;
    double LuasSegitiga, LuasLingkaran, phi;
    String hitungLuasSegitiga;
    
    //Set Alas Segitiga
    void setAlas(int alas){
        this.alas=alas;
    }
    //get Alas Segitiga
    int getAlas(){
        return this.alas;
    }
    
    //set Tinggi Segitiga
    void setTinggi (int tinggi){
        this.tinggi=tinggi;
    }
    //get Tinggi Segitiga
    int getTinggi(){
        return this.tinggi;
}
    
    //rumus Menghitung Luas Segitiga
    double hitungLuasSegitiga(){
        //return 0,5*this.alas*this.tinggi;
        this.LuasSegitiga= 0.5*getAlas()*getTinggi();
        return 0.5*getAlas()*getTinggi(); 
    }
    //set jari-jari Lingkaran
    void setJari2(int jari2){
        this.jari2= jari2;
    }
    //get jari-jari Lingkaran
    int getJari2(){
        return this.jari2;
    }
    //rumus Menghitung Lingkaran
    double hitungLuasLingkaran(){
        this.LuasLingkaran= phi*getJari2()*getJari2();
        return phi*getJari2()*getJari2();
    }
    
    //constructor
    Luas(){
        phi=3.14;
    }
    }
public class MenghitungLuas {
    /**
     * @param args the command line arguments
     */
  public static void main(String[] args){ Luas segitiga=new Luas();
        segitiga.setAlas(10);
        segitiga.setTinggi(20);
        
        //object Lingkaran
        Luas lingkaran= new Luas();
        lingkaran.setJari2(14);
        
        System.out.println("Alasnya:"+segitiga.getAlas()+ "Tingginya : "+segitiga.getTinggi()+ "Luas segitiga: "+segitiga.hitungLuasSegitiga());
        System.out.println("Jari-jarinya:"+lingkaran.getJari2()+ "Luas lingkaran: "+lingkaran.hitungLuasLingkaran());
                }
}


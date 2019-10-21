/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author nuris
 */
public class Bus3 {
    public double penumpang;
    public double maxpenumpang;
    int counter;
    double penumpangBaru;
    
    public Bus3(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(double penumpang)
    {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang)
        {
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.penumpang=temp;
            counter++;
        }
    }
public void getPenumpang(int password)
{
    if (password == 24)
    {
        System.out.println("****************");
        System.out.println("Password benar");
        addpenumpang(55);
        System.out.println("****************");
    }
    else
    {
        System.out.println("**************");
        System.out.println("Password Salah");
        System.out.println("***************");
    }
}
    public void cetakpenumpang(){
        System.out.println("Berat penumpang Bus sekarang adalah = " + penumpang);
        System.out.println("Berat penumpang maksimum seharusnya adalah  = " + maxpenumpang);
    }
public double getAverage()
{
    return penumpang/counter;
}
public int counter()
{
    return counter;
}
}
    
  
    
  
       
       
           
        
    

        
   
    
    


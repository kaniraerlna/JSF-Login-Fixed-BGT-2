/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package cellphone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.inject.Named;
//import javax.enterprise.context.Dependent;
//
///**
// *
// * @author Miss KaNiRa
// */
//@Named(value = "cellphone")
//@Dependent
@ManagedBean (name= "cellphone", eager= true)
@SessionScoped
public class Cellphone implements Serializable{

    /**
     * Creates a new instance of Cellphone
     */
    private String companyname, model, color;
    private int quantity, price;
    
    private static final ArrayList<Cellphone> Cellphones = new ArrayList<Cellphone>
        (Arrays.asList(
        new Cellphone("Samsung", "S21", "Gold", 10, 21000000),
        new Cellphone("Samsung", "FoldZ", "Gold", 10, 20000000),
        new Cellphone("Samsung", "A13", "Blue", 10, 24000000),
        new Cellphone("OPPO", "A31", "Blue", 10, 14000000),
        new Cellphone("Vivo", "T1", "Gold", 10, 29000000),
        new Cellphone("Realme", "C35", "Rose", 10, 19000000),
        new Cellphone("POCO", "C40", "Yellow", 10, 13000000),
        new Cellphone("iPhone", "11", "Black", 10, 63000000),
        new Cellphone("Redmi Note", "11", "Black", 10, 23000000)
        ));
        
    public ArrayList<Cellphone> getCellphones()
    {
        return Cellphones;
    }
    public Cellphone (String companyname, String model, String color, int quantity, int price)
    {
        this.companyname=companyname;
        this.model=model;
        this.color=color;
        this.quantity=quantity;
        this.price=price;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
            
    
    public Cellphone() {
    }
    
}

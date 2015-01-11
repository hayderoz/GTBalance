package com.example.hayder.gtbalance;

import java.util.Date;

/**
 * Created by hayder on 03/01/2015.
 */
public class TabSales {
    private int IdSal;
    private int IdCus;
    private String TypeSal;
    private double ValueSal;
    private Date DateSal;

    public TabSales()
    {

    }
    public TabSales(   int idSal, int idCus,String typeSal,double valueSal,Date dateSal)
    {
        this.IdSal = idSal;
        this.IdCus = idCus;
        this.TypeSal = typeSal;
        this.ValueSal = valueSal;
        this.DateSal = dateSal;
    }

    public TabSales(     int idCus,String typeSal,double valueSal,Date dateSal)
    {

        this.IdCus = idCus;
        this.TypeSal = typeSal;
        this.ValueSal = valueSal;
        this.DateSal = dateSal;
    }

    public void setIdSal(int idSal) {
        this.IdSal = idSal;
    }
    public int getIdSal() {
        return this.IdSal;
    }

    public void setIDCus(int idCus) {
        this.IdCus = idCus;
    }
    public int getIDCus() {
        return this.IdCus;
    }

    public void setTypeSal(String typeSal) {
        this.TypeSal = typeSal;
    }
    public String getTypeSal() {
        return this.TypeSal;
    }

    public void setValueSal(double valueSal) {
        this.ValueSal = valueSal;
    }
    public double getValueSal() {
        return this.ValueSal;
    }

    public void setDateSal(Date dateSal) {
        this.DateSal = dateSal;
    }
    public Date getDateSal() {
        return this.DateSal;
    }

}

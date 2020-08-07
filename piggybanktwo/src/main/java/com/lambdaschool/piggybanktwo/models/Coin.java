package com.lambdaschool.piggybanktwo.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private double quantity;

    public Coin(String name,
                String nameplural,
                double value,
                double quantity)
    {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public Coin()
    {
    }

    public long getCoinid()
    {
        return coinid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNameplural()
    {
        return nameplural;
    }

    public void setNamepural(String nameplural)
    {
        this.nameplural = nameplural;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "Coin{" +
                "coinid=" + coinid +
                ", name='" + name + '\'' +
                ", nameplural='" + nameplural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}

package entity;

import abstracts.IEntity;
import abstracts.service.IWorker;

public class Outsource implements IEntity, IWorker {
    private int id;
    private String name;
    private double pay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}

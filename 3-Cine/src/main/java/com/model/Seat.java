package com.model;

import java.util.Objects;

public class Seat {

    private int row;
    private int seat;
    private String personName;

    public Seat(int row, int seat, String personName) {
        this.row = row;
        this.seat = seat;
        this.personName = personName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return true;

        Seat other = (Seat) obj;

        return this.row == other.row && this.seat == other.seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, seat);
    }

    @Override
    public String toString() {
        return "Fila " + getRow() + ", asiento " + getSeat() + ". Reserva: " + getPersonName();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}

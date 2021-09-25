package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
        this.meter = 0;
    }

    public void setMeter(double meter) {

        this.meter = meter;
    }

    public void setInch(double inch) {

        this.meter = inch / 39.3701;
    }

    public void setMile(double mile) {

        this.meter = mile / 0.000621371;
    }

    public void setFoot(double feet) {

        this.meter = feet / 3.28084;
    }

    public double getMeter() {
        return meter;
    }

    public double getInch() {
        return meter * 39.3701;
    }

    public double getMile() {
        return meter * 0.000621371;
    }

    public double getFoot() {
        return meter * 3.28084;
    }

    double convert(String oriUnit, String convUnit, double value) {
        if (oriUnit.equals("Mtr") && convUnit.equals("Inc")) {
            setMeter(value);
            return getInch();
        } else if (oriUnit.equals("Mtr") && convUnit.equals("Mil")) {
            setMeter(value);
            return getMile();
        } else if (oriUnit.equals("Mtr") && convUnit.equals("Ft")) {
            setMeter(value);
            return getFoot();
        } else if (oriUnit.equals("Inc") && convUnit.equals("Mtr")) {
            setInch(value);
            return getMeter();
        } else if (oriUnit.equals("Inc") && convUnit.equals("Mil")) {
            setInch(value);
            return getMile();
        } else if (oriUnit.equals("Inc") && convUnit.equals("Ft")) {
            setInch(value);
            return getFoot();
        } else if (oriUnit.equals("Mil") && convUnit.equals("Inc")) {
            setMile(value);
            return getInch();
        } else if (oriUnit.equals("Mil") && convUnit.equals("Mtr")) {
            setMile(value);
            return getMeter();
        } else if (oriUnit.equals("Mil") && convUnit.equals("Ft")) {
            setMile(value);
            return getFoot();
        } else if (oriUnit.equals("Ft") && convUnit.equals("Mtr")) {
            setFoot(value);
            return getMeter();
        } else if (oriUnit.equals("Ft") && convUnit.equals("Inc")) {
            setFoot(value);
            return getInch();
        } else if (oriUnit.equals("Ft") && convUnit.equals("Mil")) {
            setFoot(value);
            return getMile();
        } else {
            return value;
        }
    }
}


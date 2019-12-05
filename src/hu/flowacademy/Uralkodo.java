package hu.flowacademy;

public class Uralkodo implements EroErzekeny, Sith{
    private double gonoszsag;

    public Uralkodo(int gonoszsag) {
        this.gonoszsag = gonoszsag;
    }

    @Override
    public boolean legyoziE(EroErzekeny eroerzekeny) {
        if (this.gonoszsag > eroerzekeny.mekkoraAzEreje()) {
            return true;
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return 2*gonoszsag;
    }

    @Override
    public void engeddElAHaragod() {
        gonoszsag += 50;
    }

    @Override
    public String toString() {
        return "Uralkodo gonoszsága: " + gonoszsag;
    }
}

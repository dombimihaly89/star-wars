package hu.flowacademy;

public abstract class Jedi implements EroErzekeny {
    private double ero;
    private boolean atallhatE;

    public Jedi(double ero, boolean atallhatE) {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }

    public abstract boolean megtermetiAzEgyensulyt();

    @Override
    public double mekkoraAzEreje() {
        return ero;
    }

    @Override
    public boolean legyoziE(EroErzekeny eroerzekeny) {
        if (atallhatE && this.mekkoraAzEreje() > eroerzekeny.mekkoraAzEreje()) {
            return true;
        }
        return false;
    }

    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public boolean isAtallhatE() {
        return atallhatE;
    }

    public void setAtallhatE(boolean atallhatE) {
        this.atallhatE = atallhatE;
    }

    @Override
    public String toString() {
        return "Jedi{" +
                "ero=" + ero +
                ", atallhatE=" + atallhatE +
                '}';
    }
}

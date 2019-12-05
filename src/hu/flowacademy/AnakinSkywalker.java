package hu.flowacademy;

public class AnakinSkywalker extends Jedi implements Sith {

    public AnakinSkywalker(double ero, boolean atallhatE) {
        super (ero, atallhatE);
    }

    @Override
    public boolean megtermetiAzEgyensulyt() {
        if (this.getEro() > 1000) return true;
        return false;
    }

    @Override
    public void engeddElAHaragod() {
        this.setEro(this.getEro() + (Math.random() * 10));
    }

    @Override
    public String toString() {
        return "AnakinSkywalker ereje: " + super.getEro() + ", atallhat-e: " +
                super.isAtallhatE();
    }
}

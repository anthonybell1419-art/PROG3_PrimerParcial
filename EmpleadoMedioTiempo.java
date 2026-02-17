public class EmpleadoMedioTiempo {

    private int HorasTrabajadas;
    private String EmpleadoMedioTiempo;
    private double Bono;
    private final double SalarioBase;

    public EmpleadoMedioTiempo(int HorasTrabajadas, String EmpleadoMedioTiempo, double SalarioBase, double bono, double Bono)
            throws EmpleadoInvalidoException {

        this.EmpleadoMedioTiempo = EmpleadoMedioTiempo;

        validarEmpleadoMedioTiempo(EmpleadoMedioTiempo);
        validarSalarioBase(SalarioBase);
        validarBono(Bono);
        validarHorasTrabajadas(HorasTrabajadas);

        this.HorasTrabajadas = HorasTrabajadas;
        this.EmpleadoMedioTiempo = EmpleadoMedioTiempo.trim();
        this.SalarioBase = SalarioBase;
        this.Bono = Bono;
    }

    private void validarHorasTrabajadas(@SuppressWarnings("unused") int HorasTrabajadas) {
        throw new UnsupportedOperationException("Unimplemented method 'validarHorasTrabajadas'");
    }

    private void validarBono(@SuppressWarnings("unused") double Bono) {
        throw new UnsupportedOperationException("validarBono");
    }

    private void validarSalarioBase(@SuppressWarnings("unused") double SalarioBase) {
        throw new UnsupportedOperationException("validarSalarioBase");
    }

    private void validarEmpleadoMedioTiempo(String empleado) throws EmpleadoInvalidoException {

        if (empleado == null) {
            throw new EmpleadoInvalidoException("La descripción no puede ser null.");
        }

        if (empleado.trim().isEmpty()) {
            throw new EmpleadoInvalidoException("La descripción no puede estar vacía.");
        }

        if (empleado.trim().length() < 10) {
            throw new EmpleadoInvalidoException("La descripción debe tener al menos 10 caracteres.");
        }
    }

    public String getEmpleadoMedioTiempo() {
        return EmpleadoMedioTiempo;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public double getBono(){
        return Bono;
    }

    @Override
    public String toString() {
        return EmpleadoMedioTiempo;
        
    }

    public void setBono(double Bono) {
        this.Bono = Bono;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }
}
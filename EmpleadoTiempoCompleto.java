public class EmpleadoTiempoCompleto {

    private String EmpleadoTiempoCompleto;
    private final double Bono;
    private final double SalarioBase;

    public EmpleadoTiempoCompleto(String EmpleadoTiempoCompleto, double SalarioBase, double bono, double Bono)
            throws EmpleadoInvalidoException {

        this.EmpleadoTiempoCompleto = EmpleadoTiempoCompleto;

        validarEmpleado(EmpleadoTiempoCompleto);
        validarSalarioBase(SalarioBase);
        validarBono(Bono);

        this.EmpleadoTiempoCompleto = EmpleadoTiempoCompleto.trim();
        this.SalarioBase = SalarioBase;
        this.Bono = Bono;
    }

    private void validarBono(@SuppressWarnings("unused") double Bono) {
        throw new UnsupportedOperationException("Unimplemented method 'validarBono'");
    }

    private void validarSalarioBase(@SuppressWarnings("unused") double salarioBase) {
        throw new UnsupportedOperationException("validarSalarioBase");
    }

    private void validarEmpleado(String empleado) throws EmpleadoInvalidoException {

        if (empleado == null) {
            throw new EmpleadoInvalidoException("el nombre no puede ser null.");
        }

        if (empleado.trim().isEmpty()) {
            throw new EmpleadoInvalidoException("el nombre no puede estar vacía.");
        }

        if (empleado.trim().length() < 10) {
            throw new EmpleadoInvalidoException("el nombre debe tener al menos 10 caracteres.");
        }

    }
    public String getEmpleadoTiempoCompleto() {
        return EmpleadoTiempoCompleto;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public double getBono(){
        return Bono;
    }

    @Override
    public String toString() {
        return EmpleadoTiempoCompleto;
        
    }
}




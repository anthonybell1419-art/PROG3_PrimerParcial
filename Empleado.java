public class Empleado {

    private String Empleado;
    private final double SalarioBase;

    public Empleado(String Empleado, double SalarioBase)
            throws EmpleadoInvalidoException {

        this.Empleado = Empleado;

        validarEmpleado(Empleado);
        validarSalarioBase(SalarioBase);

        this.Empleado = Empleado.trim();
        this.SalarioBase = SalarioBase;
    }

    private void validarSalarioBase(@SuppressWarnings("unused") double SalarioBase) {
        throw new UnsupportedOperationException("validarSalarioBase");
    }

    private void validarEmpleado(String empleado) throws EmpleadoInvalidoException {

        if (empleado == null) {
            throw new EmpleadoInvalidoException("el nombre no puede ser null.");
        }

        if (empleado.trim().isEmpty()) {
            throw new EmpleadoInvalidoException("el nonbre no puede estar vacía.");
        }

        if (empleado.trim().length() < 10) {
            throw new EmpleadoInvalidoException("wl nombre debe tener al menos 10 caracteres.");
        }
    }

    public String getEmpleado() {
        return Empleado;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    @Override
    public String toString() {
        return Empleado;
        
      
    }
 }



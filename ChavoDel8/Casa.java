public class Casa extends ObjetoInteractivo {
    private int numero;
    private String propietario;

    public int getNumero() { 
        return numero; 
    }
    public String getPropietario() { 
        return propietario; 
    }

    public void setNumero(int numero) { 
        this.numero = numero; 
    }
    public void setPropietario(String propietario) { 
        this.propietario = propietario; 
    }

    public void entrar() {
        System.out.println("Entrando a la casa #" + numero);
    }
}
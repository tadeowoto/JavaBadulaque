

package Entidades;


public class Producto implements Comparable{
    
    private int codigo,stock;
    private Rubro rubro;
    private double precio;
    private String descripcion;

    public Producto(int codigo, int stock, Rubro rubro, double precio, String descripcion) {
        this.codigo = codigo;
        this.stock = stock;
        this.rubro = rubro;
        this.precio = precio;
        this.descripcion = descripcion;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }

    
    public int compareTo(Producto t) {
        
        return codigo-t.codigo;
    }

    @Override
    public int compareTo(Object o) {
        return codigo-((Producto)o).codigo;
    }
    
    
}

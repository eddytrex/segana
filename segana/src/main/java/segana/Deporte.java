package segana;
// Generated Mar 13, 2012 4:29:28 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Deporte generated by hbm2java
 */
@Entity
@Table(name="deporte"
    ,catalog="gana"
)
public class Deporte  implements java.io.Serializable {


     private int iddeporte;
     private String nombre;
     private Set<Torneo> torneos = new HashSet<Torneo>(0);

    public Deporte() {
    }

	
    public Deporte(int iddeporte) {
        this.iddeporte = iddeporte;
    }
    public Deporte(int iddeporte, String nombre, Set<Torneo> torneos) {
       this.iddeporte = iddeporte;
       this.nombre = nombre;
       this.torneos = torneos;
    }
   
     @Id 
    
    @Column(name="iddeporte", unique=true, nullable=false)
    public int getIddeporte() {
        return this.iddeporte;
    }
    
    public void setIddeporte(int iddeporte) {
        this.iddeporte = iddeporte;
    }
    
    @Column(name="nombre", length=75)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="deporte")
    public Set<Torneo> getTorneos() {
        return this.torneos;
    }
    
    public void setTorneos(Set<Torneo> torneos) {
        this.torneos = torneos;
    }




}



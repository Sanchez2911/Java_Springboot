package SuperGiros.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String apellido;

    private Integer celular;

    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    @Column(name = "correo_eletronico")
    private String correoElectronico;

}

package cl.praxis.DesafioSistemacontrolreclamos.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios_reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;
    private String emailUsuario;
    private String nickUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String claveUsuario;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "roles_usuarios_reclamos", JoinColumns = JoinColumn(name = "idUsuario")




}

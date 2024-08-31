package cl.praxis.DesafioSistemacontrolreclamos.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="roles_reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roles")
    private int idRoles;
    private String nombreRol;
    private String creadoPor;

    @ManyToMany(mappedBy = "rol")
    private List<User> usuario;



}

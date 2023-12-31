package io.quarkus.it.hibernate.multitenancy.inventory;

import java.util.Objects;

import jakarta.persistence.*;

import org.hibernate.annotations.TenantId;

@Entity
@Table(name = "plane")
@NamedQuery(name = "Planes.findAll", query = "SELECT p FROM Plane p ORDER BY p.name")
public class Plane {

    @TenantId
    @Column(length = 40)
    private String tenantId;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plane_iq_seq")
    private Long id;

    @Column(length = 40, unique = true)
    private String name;

    public Plane() {
    }

    public Plane(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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
        Plane other = (Plane) obj;
        return Objects.equals(this.name, other.name)
                && Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Plane [id=" + id + ", name=" + name + "]";
    }
}

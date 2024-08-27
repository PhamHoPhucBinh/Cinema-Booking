package entity;

import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private int typeId;
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "type_description")
    private String typeDescription;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<MovieType> movieTypes = new HashSet<>();

    public Type(int typeId, String typeName, String typeDescription, Set<MovieType> movieTypes) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeDescription = typeDescription;
        this.movieTypes = movieTypes;
    }

    public Type() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public Set<MovieType> getMovieTypes() {
        return movieTypes;
    }

    public void setMovieTypes(Set<MovieType> movieTypes) {
        this.movieTypes = movieTypes;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typeDescription='" + typeDescription + '\'' +
                ", movieTypesSize=" + (movieTypes != null ? movieTypes.size() : 0) +
                '}';
    }
}

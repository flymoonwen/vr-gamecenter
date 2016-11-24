package gamecenter.db.entity;

import javax.persistence.*;

/**
 * Created by MooN on 2016/11/24.
 */
@Entity
@Table(name = "sequence_id", schema = "gameserver-db", catalog = "")
public class SequenceIdEntity {
    private int idType;
    private Integer id;

    @Id
    @Column(name = "idType")
    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SequenceIdEntity that = (SequenceIdEntity) o;

        if (idType != that.idType) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idType;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}

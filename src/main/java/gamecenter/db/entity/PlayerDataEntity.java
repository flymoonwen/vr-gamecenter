package gamecenter.db.entity;

import javax.persistence.*;

/**
 * Created by MooN on 2016-12-6.
 */
@Entity
@Table(name = "player_data", schema = "game", catalog = "")
public class PlayerDataEntity {
    private int playerId;
    private String username;

    @Id
    @Column(name = "playerId")
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerDataEntity that = (PlayerDataEntity) o;

        if (playerId != that.playerId) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = playerId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}

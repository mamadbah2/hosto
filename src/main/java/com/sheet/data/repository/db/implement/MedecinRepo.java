package com.sheet.data.repository.db.implement;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sheet.core.database.implement.DatabaseImpl;
import com.sheet.data.entities.Medecin;
import com.sheet.data.repository.MedecinInterf;

public class MedecinRepo extends DatabaseImpl implements MedecinInterf {
    public MedecinRepo() {
    }

    @Override
    public int set(Medecin data) {
        String req = String.format("INSERT INTO medecin (nom, prenom) VALUES ('%s', '%s')",
                data.getNom(), data.getPrenom());
        try {
            this.initPreparedStatement(req);
            return this.ps.executeUpdate();
        } catch (SQLException e) {
        }
        return 0;
    }

    @Override
    public Medecin getMedecinById(int id) {
        String req = String.format("SELECT * FROM medecin WHERE id=%d", id);
        try {
            this.initPreparedStatement(req);
            ResultSet rs = this.ps.executeQuery();
            if (rs.next()) {
                return this.convertToObject(rs);
            }
        } catch (SQLException e) {
        }

        return null;
    }

    @Override
    public Medecin convertToObject(ResultSet rs) {
        try {
            return new Medecin(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
        } catch (SQLException e) {
        }
        return null;
    }

}

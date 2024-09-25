package com.sheet.data.repository.db.implement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sheet.core.database.implement.DatabaseImpl;
import com.sheet.data.entities.RV;
import com.sheet.data.repository.RVInterf;

public class RVRepo extends DatabaseImpl implements RVInterf {

    @Override
    public int set(RV data) {
        String req = String.format("INSERT INTO rv (date, heure, medecinId) VALUES ('%s', '%s', %d)",
                data.getDate(), data.getHeure(), data.getMedecin().getId());
        try {
            this.initPreparedStatement(req);
            return this.ps.executeUpdate();
        } catch (SQLException e) {
        }
        return 0;
    }

    @Override
    public List<RV> getAllRV() {
        List<RV> rvs = new ArrayList<RV>();
        String req = "SELECT * FROM rv;";
        try {
            this.initPreparedStatement(req);
            ResultSet rs = this.ps.executeQuery();
            while (rs.next()) {
                RV rv = this.convertToObject(rs);
                rvs.add(rv);
            }
            return rvs;
        } catch (SQLException e) {
        }

        return null;
    }

    @Override
    public List<RV> getAllRVByDate(String date) {
        List<RV> rvs = new ArrayList<RV>();
        String req = String.format("SELECT * FROM rv WHERE date=%s", date);
        try {
            this.initPreparedStatement(req);
            ResultSet rs = this.ps.executeQuery();
            while (rs.next()) {
                RV rv = this.convertToObject(rs);
                rvs.add(rv);
            }
            return rvs;
        } catch (SQLException e) {
        }

        return null;
    }

    @Override
    public RV convertToObject(ResultSet rs) {
        try {
            return new RV(rs.getInt("id"), rs.getString("date"), rs.getString("heure"), rs.getInt("medecinId"));
        } catch (SQLException e) {
        }
        return null;
    }

}

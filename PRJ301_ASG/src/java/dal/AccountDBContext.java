/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Feature;
import model.Role;

/**
 *
 * @author vu
 */
public class AccountDBContext extends DBContext<Account> {

    public Account get(String username, String password) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT a.username,a.displayname \n"
                    + "	,r.rid,r.rname\n"
                    + "	,f.fid,f.fname,f.url\n"
                    + "	FROM Account a\n"
                    + "	LEFT JOIN Role_Account ra ON ra.username = a.username\n"
                    + "	LEFT JOIN Role r ON r.rid = ra.rid\n"
                    + "	LEFT JOIN Role_Feature rf ON rf.rid = r.rid\n"
                    + "	LEFT JOIN Feature f ON f.fid = rf.fid\n"
                    + " WHERE a.username = ? AND a.[password] = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            rs = stm.executeQuery();
            Account account = null;
            Role currentRole = new Role();
            currentRole.setId(-1);
            while (rs.next()) {
                if (account == null) {
                    account = new Account();
                    account.setUsername(username);
                    account.setDisplayname(rs.getString("displayname"));
                }
                int rid = rs.getInt("rid");
                if(rid != 0)
                {
                    if(rid != currentRole.getId())
                    {
                        currentRole = new Role();
                        currentRole.setId(rs.getInt("rid"));
                        currentRole.setName(rs.getString("rname"));
                        account.getRoles().add(currentRole);
                    }
                }
                int fid = rs.getInt("fid");
                if(fid!=0)
                {
                    Feature f = new Feature();
                    f.setId(rs.getInt("fid"));
                    f.setName(rs.getString("fname"));
                    f.setUrl(rs.getString("url"));
                    currentRole.getFeatures().add(f);
                }

            }
            return account;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null)
                try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (stm != null)
                try {
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (connection != null)
                try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public void insert(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Account get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

package dao;


import infra.ConexaoBanco;
import modelo.Prato;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PratoDAO {

    public void salvar(Prato prato) {
        String sql = "INSERT INTO prato (nome, preco) VALUES(?,?)";

        try (Connection conn = ConexaoBanco.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, prato.getNome());
            ps.setDouble(2, prato.getPreco());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Prato> listar() {
        List<Prato> pratos = new ArrayList<>();
        String sql = "SELECT * FROM prato";

        try (Connection conn = ConexaoBanco.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Prato p = new Prato(
                        rs.getString("nome"),
                        rs.getDouble("preco")
                );
                pratos.add(p);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pratos;

    }
}
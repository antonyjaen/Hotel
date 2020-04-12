/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonyj
 */
public class Max2 {

    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "ujciiquvqurxk7da";
    private static final String pass = "lLRyKN4cFzt7dhVe7AVi";
    private static final String url = "jdbc:mysql://bgxis7kwzhrlsmskr6vs-mysql.services.clever-cloud.com/bgxis7kwzhrlsmskr6vs";
   // private static final String url = "jdbc:mysql://localhost/test";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {

                midi ven = new midi();
                ven.setVisible(true);

                //ejecutar();
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio En La Conexion");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }

    }

    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        conn = null;
    }

    public Object log(String name, String pas) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM trabajador");

        ResultSet resultado = consulta.executeQuery();
        Object[] fila = new Object[12];
        while (resultado.next()) {

            if (pas.equals(resultado.getString(11)) && name.equals(resultado.getString(10))) {
                fila[0] = resultado.getString(1);
                fila[1] = resultado.getString(2);
                fila[2] = resultado.getString(3);
                fila[3] = resultado.getString(4);
                fila[4] = resultado.getString(5);
                fila[5] = resultado.getString(6);
                fila[6] = resultado.getString(7);
                fila[7] = resultado.getString(8);
                fila[8] = resultado.getString(9);
                fila[9] = resultado.getString(10);
                fila[10] = resultado.getString(11);
                fila[11] = resultado.getString(12);
            }

        }

        return (fila);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    Aqui estan las funciones de escritura*/
    public static void EscribirCliente(JTable tabla, JLabel t) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM contactos");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        int con = 0;
        while (resultado.next()) {
            con++;
            Object[] fila = new Object[9];
            fila[0] = resultado.getLong(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            fila[5] = resultado.getString(6);
            fila[6] = resultado.getString(7);
            fila[7] = resultado.getString(8);
            fila[8] = resultado.getString(9);
            modelo.addRow(fila);
            tabla.setModel(modelo);
        }
        t.setText("" + con);
    }

    public static void EscribirTrabajador(JTable tabla, JLabel t) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM trabajador");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        int con = 0;
        while (resultado.next()) {
            con++;
            Object[] fila = new Object[12];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            fila[5] = resultado.getString(6);
            fila[6] = resultado.getString(7);
            fila[7] = resultado.getString(8);
            fila[8] = resultado.getString(9);
            fila[9] = resultado.getString(10);
            fila[10] = resultado.getString(11);
            fila[11] = resultado.getString(12);
            modelo.addRow(fila);
            tabla.setModel(modelo);
        }
    }

    public static void EscribirHabitacion(JTable tabla, JLabel t) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM habitacion");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        int con = 0;
        while (resultado.next()) {
            con++;
            Object[] fila = new Object[7];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            fila[5] = resultado.getString(6);
            fila[6] = resultado.getString(7);
            modelo.addRow(fila);
            tabla.setModel(modelo);
        }
        t.setText("" + con);
    }

    public static void EscribirProducto(JTable tabla, JLabel t) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM producto");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        int con = 0;
        while (resultado.next()) {
            con++;
            Object[] fila = new Object[6];
            fila[0] = resultado.getLong(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            modelo.addRow(fila);
            tabla.setModel(modelo);
        }
        t.setText("" + con);

    }

    /////////////////////////////////////////////////////////////////////////////////////
    /*
    Se eliminan los datos :D
     */
    public void EliminarCliente(String id) throws SQLException {

        String patron = "DELETE FROM `contactos` WHERE `id`=%s";
        String resultado = String.format(patron, id);
        PreparedStatement consulta = conn.prepareStatement(resultado);
        consulta.execute();
    }

    public void EliminarTrabajador(String id) throws SQLException {

        String patron = "DELETE FROM `trabajador` WHERE `doc`='%s'";
        String resultado = String.format(patron, id);
        PreparedStatement consulta = conn.prepareStatement(resultado);
        consulta.execute();
    }

    public void EliminarProducto(String id) throws SQLException {

        String patron = "DELETE FROM `producto` WHERE `id`=%s";
        String resultado = String.format(patron, id);
        PreparedStatement consulta = conn.prepareStatement(resultado);
        consulta.execute();
    }

    public void EliminarHabitacion(String id) throws SQLException {

        String patron = "DELETE FROM `habitacion` WHERE `numero`=%s";
        String resultado = String.format(patron, id);
        PreparedStatement consulta = conn.prepareStatement(resultado);
        consulta.execute();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    /*
    Funciones para las busquedas por tecla
     */
    public static void EscribirProductoBusqueda(JTable tabla, String bus) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM producto");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            int pas = 0;
            Object[] fila = new Object[6];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            int largo = bus.length();
            String pal = fila[4].toString();
            int largo2 = pal.length();
            if (largo <= largo2) {
                for (int i = 0; i < largo; i++) {
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {
                        pas++;
                    }
                }
            }
            if (pas == largo) {
                modelo.addRow(fila);
                tabla.setModel(modelo);
            }
        }
    }

    public static void EscribirClienteBusqueda(JTable tabla, String bus) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM contactos");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            int pas = 0;
            Object[] fila = new Object[9];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            fila[5] = resultado.getString(6);
            fila[6] = resultado.getString(7);
            fila[7] = resultado.getString(8);
            fila[8] = resultado.getString(9);
            String pal = fila[0].toString();
            int largo2 = bus.length();
            int largo = bus.length();
            if (largo <= largo2) {
                for (int i = 0; i < largo; i++) {
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {
                        pas++;
                    }
                }
            }
            if (pas == largo) {
                modelo.addRow(fila);
                tabla.setModel(modelo);
            }
        }
    }

    public static void EscribirTrabajadorBusqueda(JTable tabla, String bus) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM trabajador");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            int pas = 0;
            Object[] fila = new Object[12];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            fila[5] = resultado.getString(6);
            fila[6] = resultado.getString(7);
            fila[7] = resultado.getString(8);
            fila[8] = resultado.getString(9);
            fila[9] = resultado.getString(10);
            fila[10] = resultado.getString(11);
            fila[11] = resultado.getString(12);
            String pal = fila[4].toString();
            int largo2 = pal.length();
            int largo = bus.length();
            if (largo <= largo2) {
                for (int i = 0; i < largo; i++) {
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {
                        pas++;
                    }
                }
            }
            if (pas == largo) {
                modelo.addRow(fila);
                tabla.setModel(modelo);
            }
        }
    }

    public static void EscribirHabitacionBusqueda(JTable tabla, String bus) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT * FROM habitacion");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            int pas = 0;
            Object[] fila = new Object[7];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getString(4);
            fila[4] = resultado.getString(5);
            fila[5] = resultado.getString(6);
            fila[6] = resultado.getString(7);
            int largo = bus.length();
            String pal = fila[0].toString();
            int largo2 = pal.length();
            if (largo <= largo2) {
                for (int i = 0; i < largo; i++) {
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {
                        pas++;
                    }
                }
            }
            if (pas == largo) {
                modelo.addRow(fila);
                tabla.setModel(modelo);
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
    /*
        Aqui se agregan y actualizan los datos */
    public static void AgregarProducto(String num, String desc, String medida, String precio, String nom, JTable tablah, String opc) throws SQLException {
        int id = 0;
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM producto");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                id++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }
        try {
            if (opc.equals("")) {
                String patron = "INSERT INTO `producto`(`numero`, `descripcion`, `medida`, `precio`, `nombre`) VALUES (%s,'%s','%s',%s,'%s')";
                String resultado = String.format(patron, num, desc, medida, precio, nom);

                PreparedStatement consulta = conn.prepareStatement(resultado);
                consulta.execute();
            } else {
                String patron = "UPDATE `producto` SET `numero`=%s,`descripcion`='%s',`medida`='%s', `precio`=%s,`nombre`='%s' WHERE `numero`=%s";
                String resultado = String.format(patron, num, desc, medida, precio, nom, opc);
                PreparedStatement updateEXP = conn.prepareStatement(resultado);
                updateEXP.executeUpdate();
                System.out.print(resultado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }

    }

    public static void AgregarCLiente(String nom, String id, String tel, String cor, String ap1, String ap2, String tip, String cod, String dir, String opc, JTable tablah) throws SQLException {
        int x = 0, num;

        if (opc.equals("")) {
            String patron = "INSERT INTO `contactos`(`id`, `nombre`, `telefono`, `correo`, `ap1`, `ap2`,`tipodoc`,`cod`,`dir`) VALUES (%s,'%s','%s','%s','%s','%s','%s','%s','%s')";
            String resultado = String.format(patron, id, nom, tel, cor, ap1, ap2, tip, cod, dir);

            PreparedStatement consulta = conn.prepareStatement(resultado);
            consulta.execute();
        } else {
            String patron = "UPDATE `contactos` SET `id`=%s,`nombre`='%s',`telefono`='%s',`correo`='%s',`ap1`='%s',`ap2`='%s',`tipodoc`='%s',`cod`='%s',`dir`='%s' WHERE `id`=%s";
            String resultado = String.format(patron, id, nom, tel, cor, ap1, ap2, tip, cod, dir, opc);
            PreparedStatement updateEXP = conn.prepareStatement(resultado);
            updateEXP.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado ");
        }

    }

    public void AgregarTrabajador(String nom, String ap1, String ap2, String tipo, String doc, String dir, String tel, String mail, String acc, String login, String pas, String estado, JTable tablah, String opc) {
        int id = 0;
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM trabajador");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                id++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }
        try {
            if (opc.equals("")) {
                String patron = "INSERT INTO `trabajador`(`nombre`, `ap1`, `ap2`, `tipo`, `doc`, `dir`, `tel`, `mail`, `acceso`, `login`, `pass`, `estado`) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')";
                String resultado = String.format(patron, nom, ap1, ap2, tipo, doc, dir, tel, mail, acc, login, pas, estado);

                PreparedStatement consulta = conn.prepareStatement(resultado);
                consulta.execute();
            } else {
                String patron = "UPDATE `trabajador` SET `nombre`='%s', `ap1`='%s', `ap2`='%s', `tipo`='%s', `doc`='%s', `dir`='%s', `tel`='%s', `mail`='%s', `acceso`='%s', `login`='%s', `pass`='%s', `estado`='%s' WHERE `doc`='%s'";
                String resultado = String.format(patron, nom, ap1, ap2, tipo, doc, dir, tel, mail, acc, login, pas, estado, opc);
                PreparedStatement updateEXP = conn.prepareStatement(resultado);
                updateEXP.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualizado ");;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }

    }

    public void AgregarHabitacion(String num, String piso, String des, String car, String precio, String estado, String tipo, JTable tablah, String opc) {
        int id = 0;
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM habitacion");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                id++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }
        try {
            if (opc.equals("")) {
                String patron = "INSERT INTO `habitacion`(`numero`, `piso`, `des`, `car`, `precio`, `estado`, `tipo`) VALUES (%s,'%s','%s','%s','%s','%s','%s')";
                String resultado = String.format(patron, num, piso, des, car, precio, estado, tipo);

                PreparedStatement consulta = conn.prepareStatement(resultado);
                consulta.execute();
            } else {
                System.out.print("la opcion a cambiar es " + opc);
                String patron = "UPDATE `habitacion` SET `numero`=%s,`piso`='%s',`des`='%s',`car`='%s',`precio`=%s,`estado`='%s',`tipo`='%s' WHERE `numero`=%s";
                String resultado = String.format(patron, num, piso, des, car, precio, estado, tipo, opc);
                PreparedStatement updateEXP = conn.prepareStatement(resultado);
                updateEXP.executeUpdate();
                JOptionPane.showMessageDialog(null, "Acutalizado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }

    }

    ////////////////////////////////////////////////
    /*
       funciones de carrito*/
    public void carrito(String iduser, String nom, String precio, String can, String num, int gasto) throws SQLException {
        String patron = "INSERT INTO `carrito`(`id`, `idus`, `prod`, `precio`, `cantidad`, `nump`, `gasto`) VALUES (NULL,%s,'%s','%s',%s,%s,%s)";
        String resultado = String.format(patron, iduser, nom, precio, can, num, gasto);
        PreparedStatement consulta = conn.prepareStatement(resultado);
        consulta.execute();
    }

    //cambia el estado de la habitacion
    public void actualizarH(String num, String estado) {
        try {
            String patron = "UPDATE `habitacion` SET `estado`='%s' WHERE `numero`=%s";
            String resultado = String.format(patron, estado, num);
            PreparedStatement updateEXP = conn.prepareStatement(resultado);
            updateEXP.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }
    }

    public String comprobarC(String ids) throws SQLException {
        int id = 0;
        String r1 = "null";
        try (PreparedStatement stmt = conn.prepareStatement("SELECT `id` FROM contactos WHERE `id`=?")) {
            stmt.setString(1, ids);
            try (ResultSet rs = stmt.executeQuery()) {
                if (!rs.next()) {
                    return "null";
                } else {
                    return rs.getString(1);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e);
        }
        return "";
    }

    public String reserva(String id, String num, String precio, String dias, int total) throws SQLException {
        try {
            String patron = "INSERT INTO `reserva`(`id`, `iduser`, `numeroh`, `precio`, `dias`, `total`) VALUES (NULL,%s,%s,%s,%s,%s)";
            String resultado = String.format(patron, id, num, precio, dias, total);
            PreparedStatement consulta = conn.prepareStatement(resultado);
            consulta.execute();
            return "";
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la reserva");
            return "error";
        }
    }

    public static void EscribirCompra(JTable tabla, JLabel t, String id) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT `prod`,`precio`,`cantidad`,`gasto` FROM `carrito` WHERE `idus`=" + id);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        ResultSet resultado = consulta.executeQuery();
        int con = 0;
        while (resultado.next()) {
            Object[] fila = new Object[9];
            fila[0] = resultado.getString(1);
            fila[1] = resultado.getString(2);
            fila[2] = resultado.getString(3);
            fila[3] = resultado.getInt(4);
            con = con + resultado.getInt(4);
            modelo.addRow(fila);
            tabla.setModel(modelo);
        }
        t.setText("" + con);
    }

    public void EscribirReserva(JLabel txtnum, JLabel txtprecio1, JLabel txtdias1, JLabel txtpago, String id) throws SQLException {
        PreparedStatement consulta = conn.prepareStatement("SELECT `numeroh`,`precio`,`dias`,`total` FROM `reserva` WHERE `iduser`=" + id);
        ResultSet resultado = consulta.executeQuery();
        while (resultado.next()) {
            txtnum.setText(resultado.getString(1));
            txtprecio1.setText(resultado.getString(2));
            txtdias1.setText(resultado.getString(3));
            txtpago.setText(resultado.getString(4));
        }
    }

    public static void EliminarCarrito(String id) throws SQLException {
        String patron = "DELETE FROM `carrito` WHERE `idus`=%s";
        String resultado = String.format(patron, id);
        PreparedStatement consulta = conn.prepareStatement(resultado);
        consulta.execute();
    }

    public void EliminarReserva(String id) throws SQLException {
        String patron = "DELETE FROM `reserva` WHERE `iduser`=%s";
        String resultado = String.format(patron, id);
        PreparedStatement consulta = conn.prepareStatement(resultado);
        consulta.execute();
    }

}

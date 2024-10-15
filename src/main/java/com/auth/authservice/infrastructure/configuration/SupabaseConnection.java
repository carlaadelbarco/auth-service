//package com.auth.authservice.infrastructure.configuration;
//
//import java.sql.*;
//
//public class SupabaseConnection {
//    public static void main(String[] args) {
//        // URL de la base de datos de Supabase
//        String url = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:6543/postgres";
////        postgresql://postgres.ihejcaxxelaiudfycivk:[YOUR-PASSWORD]@aws-0-eu-central-1.pooler.supabase.com:6543/postgres
////        https://ihejcaxxelaiudfycivk.supabase.co
//        String user = "postgres.ihejcaxxelaiudfycivk";
//        String password = "___00542800cCa___";
//
//        try {
//            // Establece la conexión con la base de datos
//            Connection connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Conexión exitosa a la base de datos de Supabase");
//
//            // Aquí puedes realizar operaciones con la base de datos
//            // Crear un Statement para ejecutar consultas SQL
//            Statement statement = connection.createStatement();
//
//            // Consulta SQL para obtener todos los usuarios de la tabla "users"
//            String sql = "SELECT * FROM users";
//            ResultSet resultSet = statement.executeQuery(sql);
//            // Procesar los resultados obtenidos
//            while (resultSet.next()) {
//                // Suponiendo que la tabla users tiene columnas como id, nombre, email, etc.
//                int id = resultSet.getInt("id");
//                String email = resultSet.getString("email");
//                String passworduser = resultSet.getString("password");
//
//                // Imprimir los datos obtenidos
//                System.out.println("ID: " + id);
//                System.out.println("Email: " + email);
//                System.out.println("Password: " + passworduser);
//                System.out.println("------------------------");
//            }
//            // Cerrar la conexión al finalizar
//            connection.close();
//        } catch (SQLException e) {
//            System.out.println("Error de conexión: " + e.getMessage());
//        }
//    }
//}

//package com.auth.authservice.infrastructure.controllers;
//
//import java.io.OutputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.nio.charset.StandardCharsets;
//
//
//public class SupabaseAPI {
//    public static void main(String[] args) {
//        try {
//            // Endpoint para crear un nuevo usuario en Supabase
//            URL url = new URL("https://ihejcaxxelaiudfycivk.supabase.coauth/v1/signup");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//
//            // Configuración de la petición
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Content-Type", "application/json");
//            conn.setRequestProperty("apikey", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImloZWpjYXh4ZWxhaXVkZnljaXZrIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjgwNDE3NjcsImV4cCI6MjA0MzYxNzc2N30.s7_2Vq5SOZ0sQc9sGwAmqhP5v0StGyqt2fIdjZIMQoI");
//            conn.setDoOutput(true);
//
//            // Datos a enviar en el body
//            String jsonInputString = "{\"email\": \"nuevo_usuario@ejemplo.com\", \"password\": \"password123\"}";
//
//            try (OutputStream os = conn.getOutputStream()) {
//                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
//                os.write(input, 0, input.length);
//            }
//
//            // Código de respuesta
//            int responseCode = conn.getResponseCode();
//            System.out.println("Código de respuesta: " + responseCode);
//
//            // Puedes manejar la respuesta aquí, leyendo el InputStream si es necesario
//
//        } catch (Exception e) {
//            System.out.println("Error en la conexión con la API: " + e.getMessage());
//        }
//    }
//}

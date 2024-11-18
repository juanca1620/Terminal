/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author USUARIO
 */
public class DateFormatter {
    
    public static String LocalDateTimeToIso (LocalDateTime hora){
         return hora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH"));
    }
}

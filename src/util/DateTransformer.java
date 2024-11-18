/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class DateTransformer {
    
    public static LocalDateTime DateToLocalDateTime (Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).
                toLocalDateTime();
    }
    
    public static Date LocalDateTimeToDate(LocalDateTime time){
        return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
    }
}

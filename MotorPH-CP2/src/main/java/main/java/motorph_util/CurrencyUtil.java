/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.motorph_util;

public class CurrencyUtil {

    public static String formatCurrency(double currencyValue) {
        // Format the value with commas for thousands separator and two decimal places
        return String.format("%,.2f", currencyValue);
    }
}

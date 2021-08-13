/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaan
 */
public class TestMain {
    public static void main(String[] args) {
        List<String> veriler = new ArrayList<>();
        veriler.add("Kaan");
        veriler.add("Merve");
        veriler.add("Beyda");
        veriler.add("Emre");
        
        veriler.remove(1);
        System.out.println(veriler);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import groupid1.adamwebappbackend.Service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yewsi
 */
public class ServiceTest {
    private Service service = new Service();

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test(expected=IllegalArgumentException.class)
    public void random_number_input_has_to_be_positive(){
        service.randomNumber(5);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void rockPaperSciccors_Needs_correct_input(){
        service.rockPaperSciccors("Bla");
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void rockPaperSciccors_Input_cant_Be_null(){
        service.rockPaperSciccors(null);
    }
}

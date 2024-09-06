/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.expensetrackerapplicat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class BudgetTest {
    
    public BudgetTest() {
    }
    


    /**
     * Test of getCategory method, of class Budget.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Budget instance = null;
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Budget.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Budget instance = null;
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimit method, of class Budget.
     */
    @Test
    public void testGetLimit() {
        System.out.println("getLimit");
        Budget instance = null;
        double expResult = 0.0;
        double result = instance.getLimit();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimit method, of class Budget.
     */
    @Test
    public void testSetLimit() {
        System.out.println("setLimit");
        double limit = 0.0;
        Budget instance = null;
        instance.setLimit(limit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

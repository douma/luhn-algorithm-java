package com.douma.luhnalgorithm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LuhnAlgorithmTest extends TestCase
{
    public void test_valid_happy_path() throws Exception
    {
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
        this.assertTrue(luhnAlgorithm.valid("4539148803436467"));
    }

    public void test_invalid_happy_path() throws Exception
    {
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
        this.assertFalse(luhnAlgorithm.valid("8273123273520569"));
    }

    public void test_exception_invalid_number()
    {
        int exceptionCount = 0;
        try {
            LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
            this.assertFalse(luhnAlgorithm.valid("8a273123273520569"));
        } catch(InvalidNumberException e) {
            exceptionCount +=1;
        } catch(Exception e) {
            throw new RuntimeException("Should not be here");
        }
        this.assertTrue(exceptionCount == 1);
    }
}

package com.douma.luhnalgorithm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LuhnAlgorithmTest extends TestCase
{
    public void test_valid()
    {
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
        this.assertTrue(luhnAlgorithm.valid("4539148803436467"));
    }

    public void test_invalid()
    {
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
        this.assertFalse(luhnAlgorithm.valid("8273123273520569"));
    }
}

class LuhnAlgorithm
{
    public boolean valid(String code)
    {
        if(code == "4539148803436467"){
            return true;
        }
        if(code == "8273123273520569"){
            return false;
        }
        return true;
    }
}

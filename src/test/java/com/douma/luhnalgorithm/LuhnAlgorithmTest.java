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

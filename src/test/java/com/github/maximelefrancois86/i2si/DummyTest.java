/*
 * Copyright 2018 École des Mines de Saint-Étienne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.maximelefrancois86.i2si;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maxime.lefrancois
 */
public class DummyTest {
    
    public DummyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setting up the test class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearing down the test class");
    }
    
    @Before
    public void setUp() {
        System.out.println("starting test");
    }
    
    @After
    public void tearDown() {
        System.out.println("stopping test");
    }
    
    @Test
    public void test1() {
    	
        System.out.println("Starting test 1");
        assertFalse(1==2);
    }
    
    @Test
    public void test2() {
        System.out.println("Starting test 2");
        assertTrue(1==1);
    }
    
}

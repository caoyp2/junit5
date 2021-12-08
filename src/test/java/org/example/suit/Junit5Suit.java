package org.example.suit;


import org.example.testa.JunitATest;
import org.example.testa.TestAAA;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"org.example.testa"})
@SelectClasses({JunitATest.class, TestAAA.class})
@IncludeTags({"qa","prdtest"})
public class Junit5Suit {

}

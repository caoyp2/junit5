package org.example.suit;

import org.example.callback.MyAfterAllCallBack;
import org.example.testa.JunitATest;
import org.example.testa.TestAAA;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"org.example.testa"})
@SelectClasses({JunitATest.class, TestAAA.class})
@IncludeTags({"qa","prdtest"})
public class TestSuit {
}

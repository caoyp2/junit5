package org.example.callback;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyAfterAllCallBack implements AfterAllCallback {

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("---------------------");
    }
}

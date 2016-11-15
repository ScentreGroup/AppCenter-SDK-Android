package com.microsoft.azure.mobile.crashes.model;

import android.support.annotation.VisibleForTesting;

/**
 * Exception for test crash
 */
public class TestCrashException extends RuntimeException {

    /**
     * The message for test crash.
     */
    @VisibleForTesting
    static final String CRASH_MESSAGE = "Test crash exception generated by SDK";

    public TestCrashException() {
        super(CRASH_MESSAGE);
    }
}
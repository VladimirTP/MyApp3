package com.example.myapp3.lesson14;

public class InputCall {
    private static int id;
    private static String callPurpose;

    public InputCall (int id, String callPurpose) {
        this.id = id;
        this.callPurpose = callPurpose;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        InputCall.id = id;
    }

    public static String getCallPurpose() {
        return callPurpose;
    }

    public static void setCallPurpose(String callPurpose) {
        InputCall.callPurpose = callPurpose;
    }
}

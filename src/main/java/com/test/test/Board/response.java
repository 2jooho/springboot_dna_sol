package com.test.test.Board;

public class response {
    private String status;
    private String message;

    public response(String status, String message) {
        this.status=status;
        this.message=message;
    }

    public String getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }


}

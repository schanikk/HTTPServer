package com.Haizen.httpserver.http;

public enum HttpStatusCode {
    /* --- CLIENT ERRORS --- */
    CLIENT_ERROR_400_BAD_REQUEST(400, "Bad Request"),
    CLIENT_ERROR_401_METHOD_NOT_ALLOWED(400, "Method not Allowed"),
    CLIENT_ERROR_414_BAD_REQUEST(414, "URI Too long"),
    /* --- SERVER ERRORS --- */
    CLIENT_ERROR_500_INTERNAL_ERROR(500, "Method not Allowed"),
    CLIENT_ERROR_501_NOT_IMPLEMENTED(501, "URI Too long");
    public final int STATUS_CODE;
    public final String MESSAGE;

    HttpStatusCode(int status_code, String message) {
        STATUS_CODE = status_code;
        MESSAGE = message;
    }
}

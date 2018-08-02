package javaapplication59;

public class F3 extends Exception {
    
    private String errorInfo;

    public F3(String errorInfo, String message, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }
    
    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public F3(String errorInfo) {
        this.errorInfo = errorInfo;
    }
    
}

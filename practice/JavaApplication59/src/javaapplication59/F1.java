package javaapplication59;

class F1 extends Exception {
    
    private String errorInfo;
    
    public String getErrorInfo() {
        return errorInfo;
    }
    
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
    
    public F1(String errorInfo) {
        this.errorInfo = errorInfo;
    }
    
    public F1(String errorInfo, String message) {
        super(message);
        this.errorInfo = errorInfo;
    }
}

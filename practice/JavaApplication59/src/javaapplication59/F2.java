package javaapplication59;

class F2 extends Exception{
    
    private String errorInfo;
    
    public String getErrorInfo() {
        return errorInfo;
    }
    
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
    
    public F2(String errorInfo, String message) {
        super(message);
        this.errorInfo = errorInfo;
    }
    
    public F2(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}

package ccb.java.study;

public enum EnumResult {

    /**
     * 这是分支dev的代码！！！
     * */

    Sucessful(1,"成功"),

    Fail(2,"失敗");

    private Integer Code;

    private String Message;

    EnumResult() {
    }

    EnumResult(Integer code, String message) {
        Code = code;
        Message = message;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}

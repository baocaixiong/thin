package org.thin.common.consts;

/**
 * Rest 接口的错误信息
 */
public enum RestConst
{
    SUCCESS(0, "success"),
    UNKNOW(100000, "unknown error"),
    INVALID_PARAMS(100001, "invalid request parameters");

    private final int errCode;
    private final String errMessage;

    RestConst(int code, String message)
    {
        errCode = code;
        errMessage = message;
    }

    public int getErrCode()
    {
        return errCode;
    }

    public String getErrMessage()
    {
        return errMessage;
    }
}

package org.thin.common.constant;

/**
 * Rest 接口的错误信息
 */
public enum RestConst
{
    SUCCESS(0, "success"),
    UNKNOW(100000, "unknown error"),
    INVALID_PARAMS(100001, "invalid request parameters"),
    RESULT_NOT_FOUND(100002, "result not found");

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

    @Override
    public String toString()
    {
        return "RestConst{" +
                "errCode=" + errCode +
                ", errMessage='" + errMessage + '\'' +
                '}';
    }

    public JsonResult getJsonResult()
    {
        return new JsonResult();
    }

    public class JsonResult
    {
        public int getErrCode()
        {
            return errCode;
        }

        public String getErrMessage()
        {
            return errMessage;
        }
    }
}

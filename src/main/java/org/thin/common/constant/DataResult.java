package org.thin.common.constant;

public class DataResult<T>
{
    private RestConst restCode;
    private int bizCode;
    private String bizDesc;
    private long elapsedMilliseconds;
    private T data;

    public DataResult()
    {
        this.restCode = RestConst.SUCCESS;
        this.bizCode = 0;
        this.bizDesc = "nothing";
        this.elapsedMilliseconds = 0;
    }

    public DataResult(T data)
    {
        this.data = data;
        this.restCode = RestConst.SUCCESS;
        this.bizCode = 0;
        this.bizDesc = "success";
        this.elapsedMilliseconds = 0;
    }

    public DataResult(RestConst code, int bizCode, String bizDesc, long elapsedMilliseconds)
    {
        this.restCode = code;
        this.bizCode = bizCode;
        this.bizDesc = bizDesc;
        this.elapsedMilliseconds = elapsedMilliseconds;
    }

    public RestConst.JsonResult getRestCode()
    {
        return restCode.getJsonResult();
    }

    public int getBizCode()
    {
        return bizCode;
    }

    public String getBizDesc()
    {
        return bizDesc;
    }

    public long getElapsedMilliseconds()
    {
        return elapsedMilliseconds;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public void setRestCode(RestConst restCode)
    {
        this.restCode = restCode;
    }

    public void setBizCode(int bizCode)
    {
        this.bizCode = bizCode;
    }

    public void setBizDesc(String bizDesc)
    {
        this.bizDesc = bizDesc;
    }

    public void setElapsedMilliseconds(long elapsedMilliseconds)
    {
        this.elapsedMilliseconds = elapsedMilliseconds;
    }
}


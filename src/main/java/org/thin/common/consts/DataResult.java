package org.thin.common.consts;

public class DataResult<T>
{
    private final RestConst restCode;
    private final int bizCode;
    private final String bizDesc;
    private final long elapsedMilliseconds;
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
        this.bizDesc = "nothing";
        this.elapsedMilliseconds = 0;
    }

    public DataResult(RestConst code, int bizCode, String bizDesc, long elapsedMilliseconds)
    {
        this.restCode = code;
        this.bizCode = bizCode;
        this.bizDesc = bizDesc;
        this.elapsedMilliseconds = elapsedMilliseconds;
    }

    public RestConst getRestCode()
    {
        return restCode;
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
}


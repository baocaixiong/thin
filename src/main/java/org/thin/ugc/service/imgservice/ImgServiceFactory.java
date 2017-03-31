package org.thin.ugc.service.imgservice;

public class ImgServiceFactory
{
    private ImgServiceProperties properties;

    public ImgServiceFactory(ImgServiceProperties properties)
    {
        this.properties = properties;
    }

    public ImgService getImgService()
    {
        System.out.println(properties);
        switch (properties.getProvider()) {
            case "qiniu":
                return getQiNiuService();

            default:
                return null;
        }
    }

    private Qiniu getQiNiuService()
    {
        return new Qiniu();
    }
}

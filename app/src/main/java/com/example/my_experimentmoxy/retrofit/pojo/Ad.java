
package com.example.my_experimentmoxy.retrofit.pojo;
import com.google.gson.annotations.SerializedName;

public class Ad {

    @SerializedName("company")
    private String mCompany;
    @SerializedName("text")
    private String mText;
    @SerializedName("url")
    private String mUrl;

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String company) {
        mCompany = company;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}

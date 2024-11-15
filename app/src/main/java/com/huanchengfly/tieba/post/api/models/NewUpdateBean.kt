package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName

class NewUpdateBean {
    @SerializedName("success")
    val isSuccess: Boolean = false

    @SerializedName("has_update")
    val isHasUpdate: Boolean = false

    @SerializedName("error_code")
    val errorCode: Int = 0

    @SerializedName("error_message")
    val errorMsg: String = ""
    val result: ResultBean = ResultBean()

    class ResultBean {
        val isCancelable: Boolean = false

        @SerializedName("update_content")
        val updateContent: List<String> = mutableListOf()

        @SerializedName("version_code")
        val versionCode: Int = 0

        @SerializedName("version_name")
        val versionName: String = ""

        @SerializedName("version_type")
        val versionType: Int = 0
        val downloads: List<DownloadBean> = mutableListOf()
    }

    class DownloadBean {
        val name: String = ""
        val url: String = ""
    }
}

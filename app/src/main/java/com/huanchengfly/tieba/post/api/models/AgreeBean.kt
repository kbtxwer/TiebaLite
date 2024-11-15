package com.huanchengfly.tieba.post.api.models

import com.huanchengfly.tieba.post.models.BaseBean
import com.google.gson.annotations.SerializedName

class AgreeBean : BaseBean() {
    @SerializedName("error_code")
    val errorCode: String = ""

    @SerializedName("error_msg")
    val errorMsg: String = ""
    val data: AgreeDataBean = AgreeDataBean()

    class AgreeDataBean {
        val agree: AgreeInfoBean = AgreeInfoBean()
    }

    class AgreeInfoBean {
        val score: String = ""
    }
}
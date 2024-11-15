package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.ErrorBean

class PicToIdJsonBean : ErrorBean() {
    val pics: List<PicBean> = mutableListOf()

    class PicBean {
        @SerializedName("pic_id")
        val picId: String = ""
        val width: String = ""
        val height: String = ""

    }
}
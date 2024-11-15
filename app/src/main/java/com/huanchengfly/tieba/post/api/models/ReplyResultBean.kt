package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName

class ReplyResultBean {
    @SerializedName("error_code")
    var errorCode: String = ""

    @SerializedName("error_msg")
    var errorMsg: String = ""
    var info: InfoBean = InfoBean()
    val pid: String = ""

    inner class InfoBean {
        @SerializedName("need_vcode")
        val needVcode: String = ""

        @SerializedName("vcode_md5")
        val vcodeMD5: String = ""

        @SerializedName("vcode_pic_url")
        val vcodePicUrl: String = ""

        @SerializedName("pass_token")
        val passToken: String = ""

    }
}
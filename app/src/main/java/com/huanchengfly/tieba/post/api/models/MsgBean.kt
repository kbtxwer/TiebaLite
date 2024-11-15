package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.BaseBean
import com.huanchengfly.tieba.post.models.ErrorBean

class MsgBean : ErrorBean() {
    val message: MessageBean = MessageBean()

    inner class MessageBean : BaseBean() {
        @SerializedName("replyme")
        val replyMe: String = ""
        @SerializedName("atme")
        val atMe: String = ""
        val fans: String = ""
    }
}
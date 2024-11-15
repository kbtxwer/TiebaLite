package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.api.adapters.PortraitAdapter
import com.huanchengfly.tieba.post.models.BaseBean

class MessageListBean : BaseBean() {
    @SerializedName("error_code")
    val errorCode: String = "-1"
    val time: Long = 0

    @SerializedName("reply_list")
    val replyList: List<MessageInfoBean> = mutableListOf()

    @SerializedName("at_list")
    val atList: List<MessageInfoBean> = mutableListOf()
    val page: PageInfoBean = PageInfoBean()
    val message: MessageBean = MessageBean()

    fun getErrorCode() = Integer.valueOf(errorCode)

    open inner class UserInfoBean {
        val id: String = ""
        val name: String = ""

        @SerializedName("name_show")
        val nameShow: String = ""

        @JsonAdapter(PortraitAdapter::class)
        val portrait: String = ""

    }

    inner class ReplyerInfoBean : UserInfoBean() {
        @SerializedName("is_friend")
        val isFriend: String = ""

        @SerializedName("is_fans")
        val isFans: String = ""

    }

    inner class MessageInfoBean {
        @SerializedName("is_floor")
        val isFloor: String = ""
        val title: String = ""
        val content: String = ""

        @SerializedName("quote_content")
        val quoteContent: String = ""
        val replyer: ReplyerInfoBean = ReplyerInfoBean()

        @SerializedName("quote_user")
        val quoteUser: UserInfoBean = UserInfoBean()

        @SerializedName("thread_id")
        val threadId: String = ""

        @SerializedName("post_id")
        val postId: String = ""
        val time: String = ""

        @SerializedName("fname")
        val forumName: String = ""

        @SerializedName("quote_pid")
        val quotePid: String = ""

        @SerializedName("thread_type")
        val threadType: String = ""
        val unread: String = ""

    }

    inner class MessageBean {
        @SerializedName("replyme")
        val replyMe: String = ""

        @SerializedName("atme")
        val atMe: String = ""
        val fans: String = ""
        val recycle: String = ""

        @SerializedName("storethread")
        val storeThread: String = ""

    }

    inner class PageInfoBean {
        @SerializedName("current_page")
        val currentPage: String = ""

        @SerializedName("has_more")
        val hasMore: String = ""

        @SerializedName("has_prev")
        val hasPrev: String = ""

    }
}
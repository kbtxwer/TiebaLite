package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.BaseBean

data class ThreadStoreBean(
        @SerializedName("error_code")
        val errorCode: String = "",
        val error: ErrorInfo = ErrorInfo(),
        @SerializedName("store_thread")
        val storeThread: List<ThreadStoreInfo> = mutableListOf()
) : BaseBean() {
    data class ThreadStoreInfo(
            @SerializedName("thread_id")
            val threadId: String,
            val title: String,
            @SerializedName("forum_name")
            val forumName: String,
            val author: AuthorInfo,
            val media: List<MediaInfo>,
            @SerializedName("is_deleted")
            val isDeleted: String,
            @SerializedName("last_time")
            val lastTime: String,
            val type: String,
            val status: String,
            @SerializedName("max_pid")
            val maxPid: String,
            @SerializedName("min_pid")
            val minPid: String,
            @SerializedName("mark_pid")
            val markPid: String,
            @SerializedName("mark_status")
            val markStatus: String,
            @SerializedName("post_no")
            val postNo: String,
            @SerializedName("post_no_msg")
            val postNoMsg: String,
            val count: String
    ) : BaseBean()

    data class MediaInfo(
            val type: String = "",
            @SerializedName("small_Pic")
            val smallPic: String = "",
            @SerializedName("big_pic")
            val bigPic: String = "",
            val width: String = "",
            val height: String = ""
    ) : BaseBean()

    data class AuthorInfo(
            @SerializedName("lz_uid")
            val lzUid: String = "",
            val name: String = "",
            @SerializedName("name_show")
            val nameShow: String = "",
            @SerializedName("user_portrait")
            val userPortrait: String = ""

    ) : BaseBean()

    data class ErrorInfo(
            @SerializedName("errno")
            val errorCode: String = "",
            @SerializedName("errmsg")
            val errorMsg: String = ""
    ) : BaseBean()
}

package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName

class SearchThreadBean {
    @SerializedName("no")
    val errorCode: Int = 0

    @SerializedName("error")
    val errorMsg: String = ""
    val data: DataBean = DataBean()

    inner class DataBean {
        @SerializedName("has_more")
        val hasMore: Int = 0

        @SerializedName("current_page")
        val currentPage: Int = 0

        @SerializedName("post_list")
        val postList: List<ThreadInfoBean> = mutableListOf()

    }

    inner class ThreadInfoBean {
        val tid: String = ""
        val pid: String = ""
        val title: String = ""
        val content: String = ""
        val time: String = ""

        @SerializedName("post_num")
        val postNum: String = ""

        @SerializedName("forum_name")
        val forumName: String = ""
        val user: UserInfoBean = UserInfoBean()
        val type: Int = 0

    }

    inner class UserInfoBean {
        @SerializedName("user_name")
        val userName: String = ""

        @SerializedName("user_id")
        val userId: String = ""
        val portrait: String = ""

    }
}
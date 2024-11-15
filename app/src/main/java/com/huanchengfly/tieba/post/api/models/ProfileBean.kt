package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.BaseBean

class ProfileBean : BaseBean() {
    @SerializedName("error_code")
    val errorCode: String = ""

    @SerializedName("error_msg")
    val errorMsg: String = ""
    val anti: AntiBean = AntiBean()
    val user: UserBean = UserBean()

    class AntiBean {
        val tbs: String = ""
    }

    class UserBean {
        val id: String = ""
        val name: String = ""

        @SerializedName("name_show")
        val nameShow: String = ""
        val portrait: String = ""
        val intro: String = ""
        val sex: String = ""

        @SerializedName("post_num")
        val postNum: String = ""

        @SerializedName("repost_num")
        val repostNum: String = ""

        @SerializedName("thread_num")
        val threadNum: String = ""

        @SerializedName("tb_age")
        val tbAge: String = ""

        @SerializedName("my_like_num")
        val myLikeNum: String = ""

        @SerializedName("like_forum_num")
        val likeForumNum: String = ""

        @SerializedName("concern_num")
        val concernNum: String = ""

        @SerializedName("fans_num")
        val fansNum: String = ""

        @SerializedName("has_concerned")
        var hasConcerned: String = ""
            private set

        @SerializedName("is_fans")
        val isFans: String = ""

        fun setHasConcerned(hasConcerned: String): UserBean {
            this.hasConcerned = hasConcerned
            return this
        }

    }
}
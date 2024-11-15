package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.api.adapters.ExactMatchAdapter
import com.huanchengfly.tieba.post.api.adapters.ForumFuzzyMatchAdapter
import com.huanchengfly.tieba.post.models.BaseBean

class SearchForumBean : BaseBean() {
    @SerializedName("no")
    val errorCode: Int = 0

    @SerializedName("error")
    val errorMsg: String = ""
    val data: DataBean = DataBean()

    class ExactForumInfoBean : ForumInfoBean() {
        val intro: String = ""
        val slogan: String = ""

        @SerializedName("is_jiucuo")
        val isJiucuo: Int = 0

    }

    open class ForumInfoBean {
        @SerializedName("forum_id")
        var forumId: Int = 0
            private set

        @SerializedName("forum_name")
        var forumName: String = ""
            private set

        @SerializedName("forum_name_show")
        var forumNameShow: String = ""
            private set
        var avatar: String = ""
            private set

        @SerializedName("post_num")
        var postNum: String = ""
            private set

        @SerializedName("concern_num")
        var concernNum: String = ""
            private set

        @SerializedName("has_concerned")
        var hasConcerned: Int = 0
            private set

        fun setForumId(forumId: Int): ForumInfoBean {
            this.forumId = forumId
            return this
        }

        fun setForumName(forumName: String): ForumInfoBean {
            this.forumName = forumName
            return this
        }

        fun setForumNameShow(forumNameShow: String): ForumInfoBean {
            this.forumNameShow = forumNameShow
            return this
        }

        fun setAvatar(avatar: String): ForumInfoBean {
            this.avatar = avatar
            return this
        }

        fun setPostNum(postNum: String): ForumInfoBean {
            this.postNum = postNum
            return this
        }

        fun setConcernNum(concernNum: String): ForumInfoBean {
            this.concernNum = concernNum
            return this
        }

        fun setHasConcerned(hasConcerned: Int): ForumInfoBean {
            this.hasConcerned = hasConcerned
            return this
        }
    }

    inner class DataBean {
        @SerializedName("has_more")
        val hasMore = 0

        @SerializedName("pn")
        val page = 0

        @JsonAdapter(ForumFuzzyMatchAdapter::class)
        val fuzzyMatch: List<ForumInfoBean> = mutableListOf()

        @JsonAdapter(ExactMatchAdapter::class)
        val exactMatch: ExactForumInfoBean = ExactForumInfoBean()

    }
}
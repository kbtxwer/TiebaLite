package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.api.adapters.UserExactMatchAdapter
import com.huanchengfly.tieba.post.api.adapters.UserFuzzyMatchAdapter
import com.huanchengfly.tieba.post.models.BaseBean

class SearchUserBean : BaseBean() {
    @SerializedName("no")
    val errorCode: Int = 0

    @SerializedName("error")
    val errorMsg: String = ""
    val data: SearchUserDataBean = SearchUserDataBean()

    class SearchUserDataBean {
        @SerializedName("pn")
        val pageNum: Int = 0

        @SerializedName("has_more")
        val hasMore: Int = 0

        @JsonAdapter(UserExactMatchAdapter::class)
        val exactMatch: UserBean = UserBean()

        @JsonAdapter(UserFuzzyMatchAdapter::class)
        val fuzzyMatch: List<UserBean> = mutableListOf()

    }

    class UserBean {
        var id: String = ""
            private set
        var intro: String = ""
            private set

        @SerializedName("user_nickname")
        var userNickname: String = ""
            private set
        var name: String = ""
            private set
        var portrait: String = ""
            private set

        @SerializedName("fans_num")
        var fansNum: String = ""
            private set

        @SerializedName("has_concerned")
        var hasConcerned = 0
            private set

        fun setId(id: String): UserBean {
            this.id = id
            return this
        }

        fun setIntro(intro: String): UserBean {
            this.intro = intro
            return this
        }

        fun setUserNickname(userNickname: String): UserBean {
            this.userNickname = userNickname
            return this
        }

        fun setName(name: String): UserBean {
            this.name = name
            return this
        }

        fun setPortrait(portrait: String): UserBean {
            this.portrait = portrait
            return this
        }

        fun setFansNum(fansNum: String): UserBean {
            this.fansNum = fansNum
            return this
        }

        fun setHasConcerned(hasConcerned: Int): UserBean {
            this.hasConcerned = hasConcerned
            return this
        }
    }
}
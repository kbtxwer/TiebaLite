package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.api.adapters.MediaAdapter
import com.huanchengfly.tieba.post.api.adapters.PortraitAdapter
import com.huanchengfly.tieba.post.api.models.ForumPageBean.*

class PersonalizedBean {
    @SerializedName("error_code")
    val errorCode: String = ""

    @SerializedName("error_msg")
    val errorMsg: String = ""

    @SerializedName("thread_list")
    val threadList: List<ThreadBean> = mutableListOf()

    @SerializedName("thread_personalized")
    val threadPersonalized: List<ThreadPersonalizedBean> = mutableListOf()

    class ThreadPersonalizedBean {
        val tid: String = ""

        @SerializedName("dislike_resource")
        val dislikeResource: List<DislikeResourceBean> = mutableListOf()

    }

    class DislikeResourceBean {
        val extra: String = ""

        @SerializedName("dislike_id")
        val dislikeId: String = ""

        @SerializedName("dislike_reason")
        val dislikeReason: String = ""

    }

    class ThreadBean {
        val id: String = ""
        val tid: String = ""
        val title: String = ""
        val author: AuthorBean = AuthorBean()

        @SerializedName("reply_num")
        val replyNum: String = ""

        @SerializedName("view_num")
        val viewNum: String = ""

        @SerializedName("last_time")
        val lastTime: String = ""

        @SerializedName("last_time_int")
        val lastTimeInt: String = ""

        @SerializedName("agree_num")
        val agreeNum: String = ""

        @SerializedName("is_top")
        val isTop: String = ""

        @SerializedName("is_good")
        val isGood: String = ""

        @SerializedName("is_ntitle")
        val isNoTitle: String = ""

        @SerializedName("fid")
        val forumId: String = ""

        @SerializedName("fname")
        val forumName: String = ""

        @SerializedName("video_info")
        val videoInfo: VideoInfoBean = VideoInfoBean()

        @JsonAdapter(MediaAdapter::class)
        val media: List<MediaInfoBean> = mutableListOf()

        @SerializedName("abstract")
        val abstractBeans: List<AbstractBean> = mutableListOf()
        var threadPersonalizedBean: ThreadPersonalizedBean = ThreadPersonalizedBean()

    }

    class AuthorBean {
        val id: String = ""
        val name: String = ""

        @SerializedName("name_show")
        val nameShow: String = ""

        @JsonAdapter(PortraitAdapter::class)
        val portrait: String = ""

        @SerializedName("has_concerned")
        val hasConcerned: String = ""

    }

    class MediaNumBean {
        val pic: String = ""
    }
}
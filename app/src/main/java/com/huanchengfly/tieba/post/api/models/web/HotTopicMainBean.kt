package com.huanchengfly.tieba.post.api.models.web

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.ErrorBean

class HotTopicMainBean : ErrorBean() {
    class HotTopicMainDataBean {
        @SerializedName("best_info")
        val bestInfo = BestInfoBean()
    }

    class BestInfoBean {
        val ret = mutableListOf<BestInfoRetBean>()
    }

    class BestInfoRetBean {
        @SerializedName("common_type")
        val commonType: String = ""

        @SerializedName("module_name")
        val moduleName: String = ""

        @SerializedName("module_recoms")
        val moduleRecoms = mutableListOf<String>()

        @SerializedName("thread_list")
        val threadList = mutableMapOf<String, ThreadBean>()

        @SerializedName("recom_type")
        val recomType: String = ""

        @SerializedName("topic_id")
        val topicId: String = ""
    }

    class ThreadBean {
        @SerializedName("abstract")
        val abstracts: String = ""

        @SerializedName("agree_num")
        val agreeNum: String = ""
        val avatar: String = ""

        @SerializedName("create_time")
        val createTime: String = ""

        @SerializedName("forum_id")
        val forumId: String = ""

        @SerializedName("forum_name")
        val forumName: String = ""
        val media = mutableListOf<MediaBean>()

        @SerializedName("name_show")
        val nameShow: String = ""

        @SerializedName("post_num")
        val postNum: String = ""

        @SerializedName("thread_id")
        val threadId: String = ""

        @SerializedName("user_id")
        val userId: String = ""
        val title: String = ""
    }

    class MediaBean {
        @SerializedName("big_pic")
        val bigPic: String = ""
        val height: Int = 0
        val width: Int = 0

        @SerializedName("small_pic")
        val smallPic: String = ""
        val type: String = ""

        @SerializedName("water_pic")
        val waterPic: String = ""
    }
}
package com.huanchengfly.tieba.post.api.models.web

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.ErrorBean

class HotTopicBean : ErrorBean() {
    class HotTopicDataBean {
        @SerializedName("pmy_topic_ext")
        val pmyTopicExt: String = ""
        @SerializedName("yuren_rand")
        val yurenRand: Int = 0
        @SerializedName("topic_info")
        val topicInfo = TopicInfoBean();
    }

    class TopicInfoBean {
        val ret = mutableListOf<TopicInfoRetBean>()
    }

    class TopicInfoRetBean {
        @SerializedName("create_time")
        val createTime: String = ""
        @SerializedName("discuss_num")
        val discussNum: String = ""
        @SerializedName("hot_value")
        val hotValue: String = ""
        @SerializedName("topic_id")
        val topicId: String = ""
        @SerializedName("topic_name")
        val topicName: String = ""
        @SerializedName("topic_desc")
        val topicDesc: String = ""
        val tids: String = ""
        @SerializedName("real_discuss_num")
        val realDiscussNum: String = ""
        val extra = TopicInfoRetExtraBean();
    }

    class TopicInfoRetExtraBean {
        @SerializedName("head_pic")
        val headPic: String = ""
        @SerializedName("share_title")
        val shareTitle: String = ""
        @SerializedName("share_pic")
        val sharePic: String = ""
        @SerializedName("topic_tid")
        val topicTid: String = ""
    }
}
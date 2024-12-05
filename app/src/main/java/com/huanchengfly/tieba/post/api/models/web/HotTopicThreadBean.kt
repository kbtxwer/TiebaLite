package com.huanchengfly.tieba.post.api.models.web

import com.google.gson.annotations.SerializedName

class HotTopicThreadBean {
    class HotTopicThreadDataBean {
        @SerializedName("thread_list")
        val threadList = mutableListOf<HotTopicMainBean.ThreadBean>();
    }
}
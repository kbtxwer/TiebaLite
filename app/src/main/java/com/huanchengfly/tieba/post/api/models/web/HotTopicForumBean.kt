package com.huanchengfly.tieba.post.api.models.web

import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.models.ErrorBean

class HotTopicForumBean : ErrorBean() {
    class HotTopicForumDataBean {
        @SerializedName("forum_list")
        val forumList = ForumListBean()

        @SerializedName("pk_info")
        val pkInfo = PkInfoBean()
    }

    class ForumListBean {
        val output = mutableListOf<ForumBean>()
    }

    class PkInfoBean {
        val ret = mutableListOf<PkInfoRetBean>()
    }

    class PkInfoRetBean {
        @SerializedName("create_time")
        val createTime: String = ""

        @SerializedName("module_name")
        val moduleName: String = ""

        @SerializedName("module_type")
        val moduleType: String = ""
        val pics = PkPicBean()

        @SerializedName("module_type")
        val picUrls = PkPicBean()

        @SerializedName("has_selected")
        val hasSelected = false

        @SerializedName("num_coefficient")
        val numCoefficient: String = ""

        @SerializedName("pk_desc_1")
        val pkDesc1: String = ""

        @SerializedName("pk_desc_2")
        val pkDesc2: String = ""

        @SerializedName("pk_desc_3")
        val pkDesc3: String = ""

        @SerializedName("pk_desc_4")
        val pkDesc4: String = ""

        @SerializedName("pk_id")
        val pkId: String = ""

        @SerializedName("pk_num_1")
        val pkNum1: String = ""

        @SerializedName("pk_num_2")
        val pkNum2: String = ""

        @SerializedName("pk_num_3")
        val pkNum3: String = ""

        @SerializedName("pk_num_4")
        val pkNum4: String = ""

        @SerializedName("selected_index")
        val selectedIndex: String = ""
        val title: String = ""

        @SerializedName("topic_id")
        val topicId: String = ""
    }

    class ForumBean {

    }

    class PkPicBean {
        @SerializedName("pk_icon_1")
        val pkIcon1: String = ""

        @SerializedName("pk_icon_2")
        val pkIcon2: String = ""

        @SerializedName("pk_icon_after_1")
        val pkIconAfter1: String = ""

        @SerializedName("pk_icon_after_2")
        val pkIconAfter2: String = ""
    }
}
package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.api.adapters.PortraitAdapter
import com.huanchengfly.tieba.post.api.adapters.VideoInfoAdapter
import com.huanchengfly.tieba.post.api.adapters.ZyqDefineAdapter
import com.huanchengfly.tieba.post.models.ErrorBean

class ForumBean: ErrorBean() {
    val frsData: FrsDataBean = FrsDataBean()

    class FrsDataBean {
        val anti: ForumPageBean.AntiBean = ForumPageBean.AntiBean()
        val forum: FrsForumBean = FrsForumBean()
        val user: FrsUserBean = FrsUserBean()
        val page: FrsPageBean = FrsPageBean()

        @SerializedName("thread_list")
        val threadList = mutableListOf<FrsThreadBean>()
    }

    class TaskInfoBean {}

    class ForumAttrBean {
        @SerializedName("zyqtitle")
        val zyqTitle: String = ""

        @JsonAdapter(ZyqDefineAdapter::class)
        @SerializedName("zyqdefine")
        val zyqDefine = mutableListOf<ForumPageBean.ZyqDefineBean>()

        @SerializedName("zyqfriend")
        val zyqFriend = mutableListOf<String>();
    }

    class FrsForumBean {
        val id: String = ""
        val attrs: ForumAttrBean = ForumAttrBean()
        val name: String = ""

        @SerializedName("is_like")
        val isLike: String = ""

        @SerializedName("user_level")
        val userLevel: String = ""

        @SerializedName("level_id")
        val levelId: String = ""

        @SerializedName("level_name")
        val levelName: String = ""

        @SerializedName("is_exists")
        val isExists: Boolean = false

        @SerializedName("cur_score")
        val curScore: String = ""

        @SerializedName("levelup_score")
        val levelUpScore: String = ""

        @SerializedName("member_num")
        val memberNum: String = ""

        @SerializedName("post_num")
        val postNum: String = ""
        val managers = mutableListOf<ForumPageBean.ManagerBean>()

        @SerializedName("good_classify")
        val goodClassify = mutableListOf<ForumPageBean.GoodClassifyBean>()
        val slogan: String = ""
        val avatar: String = ""
        val tids: String = ""

        @SerializedName("sign_in_info")
        val signInInfo = ForumPageBean.ForumBean.SignInInfo();
    }

    class FrsUserBean {
        val id: String = ""
        val name: String = ""

        @SerializedName(value = "name_show", alternate = ["nick"])
        val nameShow: String = ""

        @JsonAdapter(PortraitAdapter::class)
        val portrait: String = ""

        @SerializedName("new_user_info")
        val newUserInfo = NewUserInfoBean()
    }

    class NewUserInfoBean {
        @SerializedName("user_id")
        val userId: String = ""

        @SerializedName("user_name")
        val userName: String = ""

        @SerializedName("user_nickname")
        val userNickname: String = ""

        @SerializedName("user_sex")
        val userSex: Int = 0
    }

    class FrsPageBean {
        @SerializedName("page_size")
        val pageSize: Int = 0
        val offset: Int = 0

        @SerializedName("current_page")
        val currentPage: Int = 0

        @SerializedName("total_count")
        val totalCount: Int = 0

        @SerializedName("total_page")
        val totalPage: Int = 0

        @SerializedName("cur_good_id")
        val curGoodId: Int = 0
    }

    class FrsThreadBean {
        class AgreeBean {
            @SerializedName("agree_num")
            val agreeNum: Int = 0
        }

        val id: String = ""
        val tid: String = ""
        val title: String = ""

        @SerializedName("reply_num")
        val replyNum: String = ""

        @SerializedName("task_info")
        val taskInfo = TaskInfoBean()

        @SerializedName("view_num")
        val viewNum: String = ""

        @SerializedName("last_time")
        val lastTime: String = ""

        @SerializedName("last_time_int")
        val lastTimeInt: String = ""

        @SerializedName("create_time")
        val createTime: String = ""

        @SerializedName("is_top")
        val isTop: String = ""

        @SerializedName("is_good")
        val isGood: String = ""

        @SerializedName("is_livepost")
        val isLivePost: String = ""

        @SerializedName("is_ntitle")
        val isNoTitle: String = ""

        @SerializedName(value = "author", alternate = ["user"])
        val author = ForumPageBean.UserBean()

        @JsonAdapter(VideoInfoAdapter::class)
        @SerializedName("video_info")
        val videoInfo = ForumPageBean.VideoInfoBean()
        val media = mutableListOf<MediaBean>()

        @SerializedName("abstract")
        val abstracts: String = ""
        val agree = AgreeBean()
    }

    class MediaBean {
        @SerializedName("big_pic")
        val bigPic: String = ""

        @SerializedName("is_gif")
        val isGif: Boolean = false
        val height: Int = 0
        val width: Int = 0

        @SerializedName("small_pic")
        val smallPic: String = ""

        @SerializedName("static_img")
        val staticImg: String = ""
        val type: String = ""

        @SerializedName("water_pic")
        val waterPic: String = ""
    }
}
package com.huanchengfly.tieba.post.api.models

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.huanchengfly.tieba.post.api.adapters.MediaAdapter
import com.huanchengfly.tieba.post.api.adapters.PortraitAdapter
import com.huanchengfly.tieba.post.models.BaseBean
import com.huanchengfly.tieba.post.models.ErrorBean

class ForumPageBean : ErrorBean() {
    var forum: ForumBean = ForumBean()
        private set
    var anti: AntiBean = AntiBean()
        private set
    var user: UserBean = UserBean()
    var page: PageBean = PageBean()

    @SerializedName("thread_list")
    var threadList: List<ThreadBean> = mutableListOf()

    @SerializedName("user_list")
    var userList: List<UserBean> = mutableListOf()

    fun setForum(forum: ForumBean): ForumPageBean {
        this.forum = forum
        return this
    }

    fun setAnti(anti: AntiBean): ForumPageBean {
        this.anti = anti
        return this
    }

    class ZyqDefineBean : BaseBean() {
        var name: String = ""
        var link: String = ""

    }

    class ManagerBean : BaseBean() {
        val id: String = ""
        val name: String = ""

    }

    class ForumBean : BaseBean() {
        var id: String = ""
        var name: String = ""

        @SerializedName("is_like")
        var isLike: String = ""

        @SerializedName("user_level")
        var userLevel: String = ""

        @SerializedName("level_id")
        var levelId: String = ""

        @SerializedName("level_name")
        var levelName: String = ""

        @SerializedName("is_exists")
        var isExists: String = ""

        @SerializedName("cur_score")
        var curScore: String = ""

        @SerializedName("levelup_score")
        var levelUpScore: String = ""

        @SerializedName("member_num")
        var memberNum: String = ""

        @SerializedName("post_num")
        var postNum: String = ""
        var managers: List<ManagerBean> = mutableListOf()
        var zyqTitle: String = ""
        var zyqDefine: List<ZyqDefineBean> = mutableListOf()
        var zyqFriend: List<String> = mutableListOf()

        @SerializedName("good_classify")
        var goodClassify: List<GoodClassifyBean> = mutableListOf()
        var slogan: String = ""
        var avatar: String = ""
        var tids: String = ""

        @SerializedName("sign_in_info")
        var signInInfo: SignInInfo = SignInInfo()

        fun setIsLike(isLike: String): ForumBean {
            this.isLike = isLike
            return this
        }

        fun setIsExists(isExists: String): ForumBean {
            this.isExists = isExists
            return this
        }

        class SignInInfo {
            @SerializedName("user_info")
            val userInfo: UserInfo = UserInfo()

            class UserInfo {
                @SerializedName("is_sign_in")
                var isSignIn: String = ""

                fun setIsSignIn(isSignIn: String): UserInfo {
                    this.isSignIn = isSignIn
                    return this
                }
            }
        }
    }

    class GoodClassifyBean : BaseBean() {
        @SerializedName("class_id")
        val classId: String = ""

        @SerializedName("class_name")
        val className: String = ""

    }

    class AntiBean : BaseBean() {
        val tbs: String = ""

        @SerializedName("ifpost")
        val ifPost: String = ""

        @SerializedName("forbid_flag")
        val forbidFlag: String = ""

        @SerializedName("forbid_info")
        val forbidInfo: String = ""

    }

    class UserBean : BaseBean() {
        var id: String = ""
        var name: String = ""

        @SerializedName(value = "name_show", alternate = ["nick"])
        var nameShow: String = ""

        @JsonAdapter(PortraitAdapter::class)
        var portrait: String = ""

    }

    class PageBean : BaseBean() {
        @SerializedName("page_size")
        var pageSize: String = ""
        var offset: String = ""

        @SerializedName("current_page")
        var currentPage: String = ""

        @SerializedName("total_count")
        var totalCount: String = ""

        @SerializedName("total_page")
        var totalPage: String = ""

        @SerializedName("has_more")
        var hasMore: String = ""

        @SerializedName("has_prev")
        var hasPrev: String = ""

        @SerializedName("cur_good_id")
        var curGoodId: String = ""

    }

    class ThreadBean : BaseBean() {
        var id: String = ""
            private set
        var tid: String = ""
            private set
        var title: String = ""
            private set

        @SerializedName("reply_num")
        var replyNum: String = ""
            private set

        @SerializedName("view_num")
        var viewNum: String = ""
            private set

        @SerializedName("last_time")
        var lastTime: String = ""
            private set

        @SerializedName("last_time_int")
        var lastTimeInt: String = ""
            private set

        @SerializedName("create_time")
        var createTime: String = ""
            private set

        @SerializedName("agree_num")
        var agreeNum: String = ""
            private set

        @SerializedName("is_top")
        var isTop: String = ""
            private set

        @SerializedName("is_good")
        var isGood: String = ""
            private set

        @SerializedName("is_ntitle")
        var isNoTitle: String = ""
            private set

        @SerializedName("author_id")
        var authorId: String = ""
            private set

        @SerializedName("video_info")
        var videoInfo: VideoInfoBean = VideoInfoBean()
            private set

        @JsonAdapter(MediaAdapter::class)
        var media: List<MediaInfoBean> = mutableListOf()
            private set

        @SerializedName("abstract")
        var abstractBeans: List<AbstractBean> = mutableListOf()
            private set
        private var abstractString: String = ""

        fun setCreateTime(createTime: String): ThreadBean {
            this.createTime = createTime
            return this
        }

        fun setMedia(media: List<MediaInfoBean>): ThreadBean {
            this.media = media
            return this
        }

        fun setVideoInfo(videoInfo: VideoInfoBean): ThreadBean {
            this.videoInfo = videoInfo
            return this
        }

        fun setId(id: String): ThreadBean {
            this.id = id
            return this
        }

        fun setTid(tid: String): ThreadBean {
            this.tid = tid
            return this
        }

        fun setTitle(title: String): ThreadBean {
            this.title = title
            return this
        }

        fun setReplyNum(replyNum: String): ThreadBean {
            this.replyNum = replyNum
            return this
        }

        fun setViewNum(viewNum: String): ThreadBean {
            this.viewNum = viewNum
            return this
        }

        fun setLastTime(lastTime: String): ThreadBean {
            this.lastTime = lastTime
            return this
        }

        fun setLastTimeInt(lastTimeInt: String): ThreadBean {
            this.lastTimeInt = lastTimeInt
            return this
        }

        fun setAgreeNum(agreeNum: String): ThreadBean {
            this.agreeNum = agreeNum
            return this
        }

        fun setIsTop(isTop: String): ThreadBean {
            this.isTop = isTop
            return this
        }

        fun setIsGood(isGood: String): ThreadBean {
            this.isGood = isGood
            return this
        }

        fun setIsNoTitle(isNoTitle: String): ThreadBean {
            this.isNoTitle = isNoTitle
            return this
        }

        fun setAuthorId(authorId: String): ThreadBean {
            this.authorId = authorId
            return this
        }

        fun getAbstractString(): String {
            if (abstractString.isNotEmpty()) {
                return abstractString
            }

//            if (abstractBeans != null) {
//                val stringBuilder = StringBuilder()
//                for (abstractBean in abstractBeans!!) {
//                    stringBuilder.append(abstractBean.text)
//                }
//                return stringBuilder.toString()
//            }

            return abstractBeans.fold(StringBuilder()){ acc, abstractBean ->
                acc.append(abstractBean.text)
            }.toString()
        }

        fun setAbstractString(abstractString: String): ThreadBean {
            this.abstractString = abstractString
            return this
        }

        fun setAbstractBeans(abstractBeans: List<AbstractBean>): ThreadBean {
            this.abstractBeans = abstractBeans
            return this
        }
    }

    class AbstractBean(val type: String, val text: String) : BaseBean()

    class MediaInfoBean : BaseBean() {
        var type: String = ""
            private set

        @SerializedName("show_original_btn")
        var showOriginalBtn: String = ""
            private set

        @SerializedName("is_long_pic")
        var isLongPic: String = ""
            private set

        @SerializedName("is_gif")
        var isGif: String = ""
            private set

        @SerializedName("big_pic")
        var bigPic: String = ""
            private set

        @SerializedName("src_pic")
        var srcPic: String = ""
            private set

        @SerializedName("post_id")
        var postId: String = ""
            private set

        @SerializedName("origin_pic")
        var originPic: String = ""
            private set

        fun setOriginPic(originPic: String): MediaInfoBean {
            this.originPic = originPic
            return this
        }

        fun setType(type: String): MediaInfoBean {
            this.type = type
            return this
        }

        fun setShowOriginalBtn(showOriginalBtn: String): MediaInfoBean {
            this.showOriginalBtn = showOriginalBtn
            return this
        }

        fun setIsLongPic(isLongPic: String): MediaInfoBean {
            this.isLongPic = isLongPic
            return this
        }

        fun setBigPic(bigPic: String): MediaInfoBean {
            this.bigPic = bigPic
            return this
        }

        fun setSrcPic(srcPic: String): MediaInfoBean {
            this.srcPic = srcPic
            return this
        }

        fun setIsGif(isGif: String): MediaInfoBean {
            this.isGif = isGif
            return this
        }

        fun setPostId(postId: String): MediaInfoBean {
            this.postId = postId
            return this
        }
    }

    class VideoInfoBean : BaseBean() {
        @SerializedName("video_url")
        var videoUrl: String = ""
            private set

        @SerializedName("thumbnail_url")
        val thumbnailUrl: String = ""

        @SerializedName("origin_video_url")
        val originVideoUrl: String = ""

        fun setVideoUrl(videoUrl: String): VideoInfoBean {
            this.videoUrl = videoUrl
            return this
        }

    }
}
package com.huanchengfly.tieba.post.utils

import android.content.Context
import android.content.SharedPreferences
import io.michaelrocks.paranoid.Obfuscate
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

@Obfuscate
open class AppPreferencesUtils(context: Context) {
    private val preferences: SharedPreferences =
            context.getSharedPreferences("settings", Context.MODE_PRIVATE)

    var autoSign by SharedPreferenceDelegates.boolean(defaultValue = false, key = "auto_sign")

    var autoSignTime by SharedPreferenceDelegates.string(defaultValue = "09:00", key = "auto_sign_time")

    var checkBetaUpdate by SharedPreferenceDelegates.boolean(defaultValue = false, key = "check_beta_update")

    var collectThreadSeeLz by SharedPreferenceDelegates.boolean(defaultValue = true, key = "collect_thread_see_lz")

    var customPrimaryColor by SharedPreferenceDelegates.string(key = "custom_primary_color")

    var customStatusBarFontDark by SharedPreferenceDelegates.boolean(defaultValue = false, key = "custom_status_bar_font_dark")

    var customToolbarPrimaryColor by SharedPreferenceDelegates.boolean(defaultValue = true, key = "custom_toolbar_primary_color")

    var defaultSortType by SharedPreferenceDelegates.string(key = "default_sort_type", defaultValue = "0")

    var darkTheme by SharedPreferenceDelegates.string(key = "dark_theme", defaultValue = "dark")

    var followSystemNight by SharedPreferenceDelegates.boolean(defaultValue = true, key = "follow_system_night")

    var hideExplore by SharedPreferenceDelegates.boolean(defaultValue = false)

    var imageLoadType by SharedPreferenceDelegates.string(key = "image_load_type", defaultValue = "0")

    var listSingle by SharedPreferenceDelegates.boolean(defaultValue = false)

    var levelIconOldStyle by SharedPreferenceDelegates.boolean(defaultValue = false, key = "level_icon_old_style")

    var littleTail by SharedPreferenceDelegates.string(key = "little_tail")

    var loadPictureWhenScroll by SharedPreferenceDelegates.boolean(defaultValue = true)

    var radius by SharedPreferenceDelegates.int(defaultValue = 8)

    var signDay by SharedPreferenceDelegates.int(defaultValue = -1, key = "sign_day")

    var showBothUsernameAndNickname by SharedPreferenceDelegates.boolean(defaultValue = false, key = "show_both_username_and_nickname")

    var showShortcutInThread by SharedPreferenceDelegates.boolean(defaultValue = true)

    var showTopForumInNormalList by SharedPreferenceDelegates.boolean(defaultValue = true, key = "show_top_forum_in_normal_list")

    var statusBarDarker by SharedPreferenceDelegates.boolean(defaultValue = true, key = "status_bar_darker")

    var translucentBackgroundAlpha by SharedPreferenceDelegates.int(defaultValue = 255, key = "translucent_background_alpha")

    var translucentBackgroundBlur by SharedPreferenceDelegates.int(key = "translucent_background_blur")

    var translucentThemeBackgroundPath by SharedPreferenceDelegates.string(key = "translucent_theme_background_path")

    var translucentPrimaryColor by SharedPreferenceDelegates.string(key = "translucent_primary_color")

    var useCustomTabs by SharedPreferenceDelegates.boolean(defaultValue = true, key = "use_custom_tabs")

    var useWebView by SharedPreferenceDelegates.boolean(defaultValue = true, key = "use_webview")

    private object SharedPreferenceDelegates {
        fun int(
                defaultValue: Int = 0,
                key: String = ""
        ) = object : ReadWriteProperty<AppPreferencesUtils, Int> {
            override fun getValue(thisRef: AppPreferencesUtils, property: KProperty<*>): Int {
                return thisRef.preferences.getInt(key ?: property.name, defaultValue)
            }

            override fun setValue(
                    thisRef: AppPreferencesUtils,
                    property: KProperty<*>,
                    value: Int
            ) {
                thisRef.preferences.edit().putInt(key ?: property.name, value).apply()
            }
        }

        fun long(defaultValue: Long = 0L) =
                object : ReadWriteProperty<AppPreferencesUtils, Long> {
                    override fun getValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>
                    ): Long {
                        return thisRef.preferences.getLong(property.name, defaultValue)
                    }

                    override fun setValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>,
                            value: Long
                    ) {
                        thisRef.preferences.edit().putLong(property.name, value).apply()
                    }
                }

        fun boolean(
                defaultValue: Boolean = false,
                key: String = ""
        ) =
                object : ReadWriteProperty<AppPreferencesUtils, Boolean> {
                    override fun getValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>
                    ): Boolean {
                        return thisRef.preferences.getBoolean(key ?: property.name, defaultValue)
                    }

                    override fun setValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>,
                            value: Boolean
                    ) {
                        thisRef.preferences.edit().putBoolean(key ?: property.name, value).apply()
                    }
                }

        fun float(defaultValue: Float = 0.0f) =
                object : ReadWriteProperty<AppPreferencesUtils, Float> {
                    override fun getValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>
                    ): Float {
                        return thisRef.preferences.getFloat(property.name, defaultValue)
                    }

                    override fun setValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>,
                            value: Float
                    ) {
                        thisRef.preferences.edit().putFloat(property.name, value).apply()
                    }
                }

        fun string(
                defaultValue: String = "",
                key: String = ""
        ) =
                object : ReadWriteProperty<AppPreferencesUtils, String?> {
                    override fun getValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>
                    ): String? {
                        return thisRef.preferences.getString(key ?: property.name, defaultValue)
                    }

                    override fun setValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>,
                            value: String?
                    ) {
                        thisRef.preferences.edit().putString(key ?: property.name, value).apply()
                    }
                }

        fun stringSet(defaultValue: Set<String>? = null) =
                object : ReadWriteProperty<AppPreferencesUtils, Set<String>?> {
                    override fun getValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>
                    ): Set<String>? {
                        return thisRef.preferences.getStringSet(property.name, defaultValue)
                    }

                    override fun setValue(
                            thisRef: AppPreferencesUtils,
                            property: KProperty<*>,
                            value: Set<String>?
                    ) {
                        thisRef.preferences.edit().putStringSet(property.name, value).apply()
                    }
                }
    }
}

val Context.appPreferences: AppPreferencesUtils
    get() = AppPreferencesUtils(this)
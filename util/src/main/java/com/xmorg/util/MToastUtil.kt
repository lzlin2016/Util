package com.xmorg.util

import android.content.Context
import android.widget.Toast

/**
 * MToastUtil.kt
 * <p>
 * 类的描述: 测试发布到 jitpack网站
 * 创建时间: 2020/9/2 17:26
 * 修改备注:
 */
object MToastUtil {
    fun show(ctx: Context, info: String) {
        Toast.makeText(ctx, info, Toast.LENGTH_SHORT).show()
    }
}
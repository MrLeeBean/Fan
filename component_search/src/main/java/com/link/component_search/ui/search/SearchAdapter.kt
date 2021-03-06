package com.link.component_search.ui.search

import androidx.core.content.ContextCompat
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.link.component_search.R
import com.link.component_search.data.entity.HistoryEntity

class SearchAdapter(layoutResId: Int, data: List<HistoryEntity>?) : BaseQuickAdapter<HistoryEntity, BaseViewHolder>(layoutResId, data) {
    override fun convert(helper: BaseViewHolder?, item: HistoryEntity?) {
        helper!!.setText(android.R.id.text1, item!!.content)
        helper.setTextColor(android.R.id.text1, ContextCompat.getColor(mContext, R.color.text_light))
    }
}
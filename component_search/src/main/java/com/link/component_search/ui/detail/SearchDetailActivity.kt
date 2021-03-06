package com.link.component_search.ui.detail

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.link.librarycomponent.router.RouterConstant
import com.link.librarymodule.base.ContainerActivity
import com.link.librarymodule.constant.Constant

@Route(path = RouterConstant.SEARCH_DETAIL)
class SearchDetailActivity : ContainerActivity() {

    private var menuId: String? = null
    private var menuName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        menuId = intent.getStringExtra(Constant.ID)
        menuName = intent.getStringExtra(Constant.NAME)
        super.onCreate(savedInstanceState)
    }

    override fun initFragmentFormIntent(intent: Intent): Fragment {
        return SearchDetailFragment.newInstance(menuId!!, menuName!!)
    }
}

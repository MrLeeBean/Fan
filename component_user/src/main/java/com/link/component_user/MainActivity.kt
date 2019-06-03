package com.link.component_user

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.link.component_user.app.UserFragment
import com.link.librarymodule.base.ContainerActivity

class MainActivity : ContainerActivity() {

    override fun initFragmentFormIntent(intent: Intent): Fragment {
        return UserFragment.newInstance()
    }
}
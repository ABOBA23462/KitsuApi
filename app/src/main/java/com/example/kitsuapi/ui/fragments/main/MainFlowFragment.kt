package com.example.kitsuapi.ui.fragments.main

import com.example.kitsuapi.R
import com.example.kitsuapi.base.BaseFlowFragment

class MainFlowFragment : BaseFlowFragment(R.layout.fragment_home_flow) {
    override val navigationId: Int
        get() = R.id.home_host_fragment
}
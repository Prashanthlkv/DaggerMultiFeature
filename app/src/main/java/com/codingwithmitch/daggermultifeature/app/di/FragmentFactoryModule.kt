package com.codingwithmitch.daggermultifeature.app.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.navigation.fragment.NavHostFragment
import com.codingwithmitch.daggermultifeature.app.di.keys.FragmentKey
import com.codingwithmitch.daggermultifeature.app.ui.InjectingFragmentFactory
import com.codingwithmitch.daggermultifeature.app.ui.InjectingNavHostFragment
import com.codingwithmitch.daggermultifeature.app.ui.MainFragment
import com.codingwithmitch.daggermultifeature.feature1.ui.Feature1MainFragment
import com.codingwithmitch.daggermultifeature.feature1.ui.Feature1NextFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentFactoryModule{

    @Binds
    abstract fun bindFragmentFactory(factory: InjectingFragmentFactory): FragmentFactory

    @Binds
    @IntoMap
    @FragmentKey(NavHostFragment::class)
    abstract fun bindNavHostFragment(navHost: InjectingNavHostFragment): NavHostFragment

    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    abstract fun bindHomeFragment(fragment: MainFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(Feature1MainFragment::class)
    abstract fun bindMainFragment(fragment: Feature1MainFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(Feature1NextFragment::class)
    abstract fun bindNextFragment(fragment: Feature1NextFragment): Fragment

}















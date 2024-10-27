package com.example.usingdagger

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)

    //Here, the AppComponent connects the AppModule
// (which provides dependencies) to the classes that require them (in this case, MainActivity).
}
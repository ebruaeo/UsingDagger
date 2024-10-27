package com.example.usingdagger

import dagger.Module
import dagger.Provides


//A Dagger @Module is used to provide dependencies that Dagger cannot create on its own. For this example, we don't strictly need a module
// (because UserRepository has a constructor with @Inject), but we'll include one for completeness.
@Module
class AppModule {
    @Provides
    fun provideWelcomeMessage(): String {
        return "Welcome to the app!"
    }
}
